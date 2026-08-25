public class Estudiante {
    private String legajo;
    private String nombre;
    //constructores

    public Estudiante(String legajo, String nombre) {
        this.legajo = legajo;
        this.nombre = nombre;
    }

    //getters and setters

    public String getLegajo() {
        return legajo;
    }

    public String getNombre() {
        return nombre;
    }
}
