import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        char respuesta;
        int i=0;
        boolean esGratuito=false;

        do{
            if(i==0){
                System.out.println("REGISTRO DE EVENTOS\n"+"===================");
            }
            System.out.println("Ingrese un título para el evento: ");
            String nombre=teclado.nextLine();
            System.out.println("Ingrese el costo base: ");
            double costo=teclado.nextDouble();
            System.out.println("El evento tendrá costo para los estudiantes S/N? ");
            char letra=Character.toLowerCase(teclado.next().charAt(0));
            if (letra=='s'){
                esGratuito=false;
            }
            if (letra=='n'){
                esGratuito=true;
                costo=0.0;
            }
            i++;
            String cont=String.valueOf(i);
            System.out.println("Inicializador estatico: se cargo la clase EventoUniversitario.");
            EventoUniversitario evento =new EventoUniversitario(cont,nombre,costo,esGratuito);
            evento.mostrarDatos();
            EventoUniversitario copiaEvento=new EventoUniversitario(evento);
            copiaEvento.mostrarDatos();
            System.out.println("Desea crear otro evento S/N? ");
            respuesta=Character.toLowerCase(teclado.next().charAt(0));
            teclado.nextLine();
        } while (respuesta=='s');
        System.out.println("Cantidad de eventos creados: "+EventoUniversitario.getCantEventos());
// debo tambien contar la cantidad de eventos por la copia? i don't know
    }
}
