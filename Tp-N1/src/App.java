import java.util.Scanner;
public class App {//este codigo crea un evento, a ese evento se crea un objeto actividad que es un array que a este por cada posicion de actividad se le crea un array que son las inscripciones que contienen los datos de los estudiantes
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

            //crear sala
            Sala sala1=new Sala (1, "LISUN");
            Sala sala2=new Sala (2, "Laboratorio");
            Sala sala3=new Sala (3, "SUM");

            //crear estudiantes
            Estudiante estudiante1=new Estudiante("53812", "Brian vizzioli");
            Estudiante estudiante2=new Estudiante("53283", "Martin Martines");
            Estudiante estudiante3=new Estudiante("48294", "Pedro Gonzales");

            //asignar sala y actividad a evento
            switch (i){
                case 1:
                    evento.asignarSala(sala1);
                    evento.crearActividad(0,"Hacking",50);
                    evento.crearActividad(1,"Ciberseguridad",50);
                    //se asigna manualmente alumnos a esa actividad de ese evento especifico
                    evento.getActividades().get(0).inscribir(estudiante1);//el numero dentro del get hace referencia al numero de actividad (el 0 es el primero que se creó en el bucle)
                    evento.getActividades().get(1).inscribir(estudiante2);
                    evento.getActividades().get(0).inscribir(estudiante3);
                    break;
                case 2:
                    evento.asignarSala(sala2);
                    evento.crearActividad(0,"Examinacion de sustancias",30);
                    evento.crearActividad(1,"Destilado de liquidos",30);
                    evento.getActividades().get(1).inscribir(estudiante1);
                    evento.getActividades().get(0).inscribir(estudiante2);
                    evento.getActividades().get(0).inscribir(estudiante3);
                    break;
                case 3:
                    evento.asignarSala(sala3);
                    evento.crearActividad(0,"Choripaneada",60);
                    evento.crearActividad(1,"Torneo de Truco",32);
                    evento.getActividades().get(0).inscribir(estudiante1);
                    evento.getActividades().get(1).inscribir(estudiante2);
                    evento.getActividades().get(1).inscribir(estudiante3);
                    break;
            }//creo el switch para que en cada bucle le asigne una sala y actividad distinta al evento

            EventoUniversitario copiaEvento=new EventoUniversitario(evento); //la copia va al final asi agarra todos los atributos que le asigne a la original
            //se le asignan las salas a la copia
            switch(i){
                case 1: copiaEvento.asignarSala(sala1);
                break;
                case 2: copiaEvento.asignarSala(sala2);
                break;
                case 3: copiaEvento.asignarSala(sala3);
                break;
            }
            evento.mostrarDatos();
            copiaEvento.mostrarDatos();

            System.out.println("Desea crear otro evento S/N? (solo puede crear 3) ");
            respuesta=Character.toLowerCase(teclado.next().charAt(0));
            teclado.nextLine();
        } while ((respuesta=='s') || (i!=3)) ; //solo se crearan maximo 3 eventos universitarios, por nuevas instrucciones de la profe y comodidad mia kjj
        System.out.println("Cantidad de eventos creados: "+EventoUniversitario.getCantEventos());
// debo tambien contar la cantidad de eventos por la copia? i don't know
    }
    //no hace falta pedir los datos por teclado para crear las actividades y las inscripciones)

}
