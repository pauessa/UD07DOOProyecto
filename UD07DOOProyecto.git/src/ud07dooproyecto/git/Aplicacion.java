/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ud07dooproyecto.git;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author pauessa
 */
public class Aplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre = "";
        String dni = "";
        String genero = "";
        Calendar fecha = Calendar.getInstance();
        Productora prodActiva = null;
        Director directorActivo = null;
        Pelicula peliActiva = null;
        Actor actorActivo = null;
        Contrato contratoActivo=null;
        int opc = 0, ano, mes, dia, duracion, npelis, id;
        double precio;
        do {
            menu();
            opc = teclado.nextInt();
            teclado.nextLine();
            switch (opc) {
                case 1:
                    System.out.println("Introduce nombre");
                    nombre = teclado.nextLine();
                    System.out.println("introduce año");
                    ano = teclado.nextInt();
                    System.out.println("introduce mes");
                    mes = teclado.nextInt();
                    System.out.println("introduce dia");
                    dia = teclado.nextInt();

                    fecha.set(ano, mes, dia);

                    prodActiva = new Productora(nombre, fecha);

                    break;
                case 2:
                    System.out.println("Introduce nombre");
                    nombre = teclado.nextLine();
                    System.out.println("Introduce dni");
                    dni = teclado.nextLine();
                    System.out.println("Introduce fecha nachimiento");
                    System.out.println("introduce año");
                    ano = teclado.nextInt();
                    System.out.println("introduce mes");
                    mes = teclado.nextInt();
                    System.out.println("introduce dia");
                    dia = teclado.nextInt();
                    fecha.set(ano, mes, dia);

                    directorActivo = new Director(nombre, dni, fecha);

                    prodActiva.addDirector(directorActivo);

                    break;
                case 3:
                    System.out.println("introduce primero el Director de la pelicula:");
                    prodActiva.MostrarListaDirectores();
                    System.out.print("DNI:");
                    dni = teclado.nextLine();
                    directorActivo = prodActiva.BuscarDirector(dni);

                    System.out.println("Introduce nombre de la pelicula");
                    nombre = teclado.nextLine();
                    System.out.println("Introduce genero de la pelicula");
                    genero = teclado.nextLine();
                    System.out.println("introduce duracion en minutos de la pelicula");
                    duracion = teclado.nextInt();

                    peliActiva = new Pelicula(nombre, genero, duracion, directorActivo);
                    prodActiva.addPelicula(peliActiva);

                    break;
                case 4:
                    System.out.println("Introduce nombre");
                    nombre = teclado.nextLine();
                    System.out.println("Introduce dni");
                    dni = teclado.nextLine();
                    System.out.println("introduce la cantidad de peliculas del actor");
                    npelis = teclado.nextInt();

                    actorActivo = new Actor(nombre, dni, npelis);
                    prodActiva.addActor(actorActivo);
                    break;
                case 5:
                    System.out.println("introduce id");
                    id = teclado.nextInt();
                    fecha = Calendar.getInstance();
                    System.out.println("introduce precio");
                    precio = teclado.nextDouble();
                    System.out.println("seleciona un Actor (DNI)");
                    prodActiva.MostrarListaActores();
                    dni=teclado.nextLine();
                    actorActivo=prodActiva.buscarActor(dni);
                    
                    contratoActivo=new Contrato(id, fecha, precio, actorActivo);
                    
                    System.out.println("introduce pelicula a la que introducir el contrato");
                    prodActiva.MostrarListaPeliculas();
                    System.out.print("seleciona pelicula nombre");
                    nombre=teclado.nextLine();
                    peliActiva=prodActiva.buscarPelicula(nombre);
                    
                    
                    peliActiva.addContrato(contratoActivo);
                    
                    break;
                    
                case 6:
                    System.out.println("introduce pelicula");
                    prodActiva.MostrarListaPeliculas();
                    System.out.print("seleciona pelicula nombre");
                    nombre=teclado.nextLine();
                    peliActiva=prodActiva.buscarPelicula(nombre);
                    
                    ArrayList<Actor> actores=new ArrayList<>();
                    actores=prodActiva.listaActores(peliActiva);
                    
                    mostrarArray(actores);
                    break;
                case 7:
                    ArrayList<Pelicula> pelis=new ArrayList<>();
                    System.out.println("introduce pelicula");
                    prodActiva.MostrarListaPeliculas();
                    System.out.print("seleciona pelicula nombre");
                    nombre=teclado.nextLine();
                    peliActiva=prodActiva.buscarPelicula(nombre);
                    System.out.println("seleciona que genero buscar");
                    genero=teclado.nextLine();
                    
                    pelis=prodActiva.listaPeliculas(genero);
                    
                    mostrarArrayPelis(pelis);
                    break;
            }
        } while (opc != 0);

    }

    private static void menu() {
        System.out.println("1.Dar de alta Productora");
        System.out.println("2.Dar de alta Director");
        System.out.println("3.Dar de alta Pelicula");
        System.out.println("4.Dar de alta Actor");
        System.out.println("5.Añadir contrato a x pelicula");
        System.out.println("6.Lista de actores de x pelicula");
        System.out.println("7.Lista de peliculas de x genero");
        System.out.println("0.Salir");
        System.out.println("Elegir opcion");

    }

    private static void mostrarArray(ArrayList<Actor> array) {    
        for (Actor actor : array) {
            System.out.println(actor);
        }
    }

    private static void mostrarArrayPelis(ArrayList<Pelicula> pelis) {
        for (Pelicula peli : pelis) {
            System.out.println(peli);
            
        }
    }

}
