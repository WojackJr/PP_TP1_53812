import java.time.LocalDate;
public class Inscripcion {
    private LocalDate fecha;
    private static String estado;
    //getter and setter

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public static String getEstado() {
        return estado;
    }

    public static void setEstado(String estado) {
        Inscripcion.estado = estado;
    }
}
