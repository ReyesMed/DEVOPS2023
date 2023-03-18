package mx.tecnm.itlp.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

import mx.tecnm.itlp.models.Mi_Lista;



@Repository
public class Mi_Lista_JDBC {

	@Autowired
	JdbcTemplate conexion;


	public List<Mi_Lista> Obtener_Lista(int perfiles_usuarios_id) {
		String sql = "SELECT PU.nombre, M.peliculas_id, P.titulo\r\n"
				+ "FROM mi_lista M\r\n"
				+ "JOIN peliculas P ON (P.id = M.peliculas_id)\r\n"
				+ "JOIN perfiles_usuarios PU ON (PU.id = M.perfiles_usuarios_id)\r\n"
				+ "WHERE perfiles_usuarios_id = ? and activo = 1;";
		return conexion.query(sql, new Mi_lista_RM(), perfiles_usuarios_id);

	}

	public void eliminarPelicula(int pelicula_id, int perfil_usuario_id) {
		String sql = "update mi_lista set activo = '0', fecha_modificado = now() " +
				"where peliculas_id = ? and perfiles_usuarios_id = ?;";
		conexion.update(sql, pelicula_id, perfil_usuario_id);
	}
	
	public int contar_peliculas(int perfiles_usuarios_id){
		String sql="SELECT COUNT(*) "
		+"FROM mi_lista "
		+"WHERE activo=1 AND perfiles_usuarios_id=?;";
        return conexion.queryForObject(sql ,Integer.class,perfiles_usuarios_id);
	}
}
