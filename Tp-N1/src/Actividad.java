import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
public class Actividad {
    private int id;
    private String titulo;
    private int cupoMaximo;
    public static final int cupoMinimo = 0;
    //relacion 0 a muchos con estudiante para inscripcion
    private List<Inscripcion> inscripcion;
    //constructores

    public Actividad(int id, String titulo, int cupoMaximo) {
        this.id = id;
        this.titulo = titulo;
        this.cupoMaximo = cupoMaximo;
        //array de la asociacion inscripcion
        this.inscripcion=new ArrayList<>();
    }

    //getter and setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCupoMaximo() {
        return cupoMaximo;
    }

    public void setCupoMaximo(int cupoMaximo) {
        this.cupoMaximo = cupoMaximo;
    }
    //metodos
    public Inscripcion inscribir (Estudiante estudiante){
        Inscripcion nuevaInscripcion=new Inscripcion(LocalDate.now(), "Inscripto", this, estudiante);//pongo 'this' donde va la actividad para enviarse a si mismo.
        this.inscripcion.add(nuevaInscripcion);
        return nuevaInscripcion;
    }
    public void mostrarInscripciones(){

    }
}
