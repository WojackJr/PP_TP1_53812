//if ternario, ejemplo: this.costoBase=gratuito ? 0 : costo;
import java.util.ArrayList;
import java.util.List;
public class EventoUniversitario {
    private final String id;
    private String titulo;
    private double costoBase;
    private boolean gratuito;
    private static int cantEventos;
    //parametro de la sala (agregacion)
    private Sala sala;
    //cuando un elemento en el uml esta subrayado hace referencia a que el atributo es static
//array para crear actividades
    private List<Actividad> actividades=new ArrayList<>();
    //constructor
    public EventoUniversitario(String id, String titulo, double costoBase, boolean gratuito) {
        this.id = id;
        this.titulo = titulo;
        this.costoBase = costoBase;
        if(costoBase==0){
            gratuito=true;
        }
        this.gratuito = gratuito;
        cantEventos++;
        //inicializo el array de las actividades
        this.actividades=new ArrayList<>();
    }

    public EventoUniversitario(EventoUniversitario otro) {
        this.id = otro.id + "-COPIA";
        this.titulo = otro.titulo;
        this.costoBase = otro.costoBase;
        this.gratuito = otro.gratuito;
        cantEventos++;
    }
    //getter and setter
    public String getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getCostoBase() {
        return costoBase;
    }

    public void setCostoBase(double costoBase) {
        this.costoBase = costoBase;
    }

    public boolean isGratuito() {
        return gratuito;
    }

    public void setGratuito(boolean gratuito) {
        this.gratuito = gratuito;
    }

    public static int getCantEventos() {
        return cantEventos;
    }

//metodos
    public double calcularCostoEstimado(){
        double costoEstimado;
        if (costoBase!=0){
            costoEstimado=costoBase+costoBase*0.21;
        }
        else{
            costoEstimado=0.0;
        }
        return costoEstimado;
    }

    public void mostrarDatos(){
        //evento original
        System.out.println("\n=====================" + "\nID: EVT-"+id + "\nTítulo: "+titulo);
        if(!gratuito){
            System.out.println("Costo: "+calcularCostoEstimado());
        }
        else{
            System.out.println("Es gratuito ");
        }
        System.out.println("------------------------------");
    }
    //metodo para asignar sala
    public void asignarSala(Sala sala){
        this.sala=sala;
    }
    //metodo para crear actividad
    public void crearActividad(int id, String titulo, int cupo){
        Actividad nuevaActividad=new Actividad(id,titulo,cupo);
        this.actividades.add(nuevaActividad);
    }
}
