package mx.tecnm.itlp.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.lang.Nullable;

import mx.tecnm.itlp.models.Alumno;

public class AlumnoRM implements RowMapper<Alumno> {

    @Override
    @Nullable
    public Alumno mapRow(ResultSet rs, int rowNum) throws SQLException {
        Alumno alumnos = new Alumno();
        alumnos.setId(rs.getByte("id"));
        alumnos.setNombre(rs.getString("nombre"));
        alumnos.setNocontrol(rs.getString("nocontrol"));
        return alumnos;
    }
    
}
