package mx.tecnm.itlp.models;

public class Alumno {
    private byte id;
    private String nombre;
    private String nocontrol;

    public byte getId() {
        return id;
    }
    public void setId(byte id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNocontrol() {
        return nocontrol;
    }
    public void setNocontrol(String nocontrol) {
        this.nocontrol = nocontrol;
    }
}
