package mx.tecnm.itlp.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import mx.tecnm.itlp.models.Alumno;

@Repository
public class AlumnoJDBC {

    @Autowired
    JdbcTemplate conexion;

    public List<Alumno> consultar(){
        String sql = "SELECT * FROM alumnos";
        return conexion.query(sql,new AlumnoRM());
    }

    
}
//public void insertar (Alumno alumno){
//String sql = "INSERT INTO alumnos (nombre, nocontrol) VALUES(?,?)";
//conexion.update(sql, alumno.getNombre(), alumno.getNocontrol)    
//}