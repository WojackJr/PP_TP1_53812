public class Taller extends Actividad {
    //atributos
    private boolean requiereNotebook;
    //constructor
    public Taller(int id, String titulo, int cupoMaximo) {
        super(id, titulo, cupoMaximo);
    }
//metodos
    @Override
    public double calcularCostoMateriales() {
        return requiereNotebook? 5000.0 : 2000.0;
    }

    @Override
    public String getTipo() {
        return this.getClass().getSimpleName(); //aca voy a la clase y luego extraigo su nombre
    }
}
