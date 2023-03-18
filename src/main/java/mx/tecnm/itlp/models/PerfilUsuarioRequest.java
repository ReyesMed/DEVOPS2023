package mx.tecnm.itlp.models;

public class PerfilUsuarioRequest {

    private String fecha;
    private int perfiles_usuarios_id;
    private int peliculas_id;

    public String getFecha() {
        return this.fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getPerfiles_usuarios_id() {
        return this.perfiles_usuarios_id;
    }

    public void setPerfiles_usuarios_id(int perfiles_usuarios_id) {
        this.perfiles_usuarios_id = perfiles_usuarios_id;
    }

    public int getPeliculas_id() {
        return this.peliculas_id;
    }

    public void setPeliculas_id(int peliculas_id) {
        this.peliculas_id = peliculas_id;
    }

}
