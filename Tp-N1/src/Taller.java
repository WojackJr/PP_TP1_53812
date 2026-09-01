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
        return 0;
    }

    @Override
    public String getTipo() {
        return "";
    }
}
