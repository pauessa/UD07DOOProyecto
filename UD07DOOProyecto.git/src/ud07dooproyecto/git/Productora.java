/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ud07dooproyecto.git;

import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author pauessa
 */
public class Productora {

    private String nombre;
    private Calendar fechaDeCreacion;
    private ArrayList<Director> dir;
    private ArrayList<Pelicula> pel;
    private ArrayList<Actor> act;

    public Productora() {
    }

    public Productora(String nombre, Calendar fechaDeCreacion) {
        this.nombre = nombre;
        this.fechaDeCreacion = fechaDeCreacion;
        this.dir = new ArrayList<>();
        this.pel = new ArrayList<>();
        this.act = new ArrayList<>();
    }

    public void addDirector(Director director) {
        this.dir.add(director);
    }

    public void MostrarListaDirectores() {
        for (Director director : dir) {
            System.out.println(director);

        }
    }

    public Director BuscarDirector(String dni) {
        for (Director director : dir) {
            if (director.getDni().equalsIgnoreCase(dni)) {
                return director;

            }

        }
        return null;
    }

    public void addPelicula(Pelicula pelicula) {
        this.pel.add(pelicula);
    }
     public void MostrarListaPeliculas() {
        for (Pelicula peli : pel) {
            System.out.println(peli);
        }
    }
     
      public Pelicula buscarPelicula(String nombre) {
        for (Pelicula peli : pel) {
            if (peli.getNombre().equalsIgnoreCase(nombre)) {
                return peli;

            }

        }
        return null;
    }

    public void addActor(Actor actor) {
        this.act.add(actor);
    }
    public void MostrarListaActores() {
        for (Actor actor : act) {
            System.out.println(actor);
        }
    }
    
    public Actor buscarActor(String dni) {
        for (Actor actor : act) {
            if (actor.getDni().equalsIgnoreCase(dni)) {
                return actor;

            }

        }
        return null;
    }
    
    
    public ArrayList<Actor> listaActores(Pelicula pelicula){
        ArrayList<Contrato> c=new ArrayList<>();
        ArrayList<Actor> a=new ArrayList<>();
        for (Pelicula peli : pel) {
            if(peli.equals(pelicula)){
            c=peli.getContrato();
            }
        }      
        for (Contrato con : c) {
           a.add(con.getActor());         
        }
        return a;
    }
    
    public ArrayList<Pelicula> listaPeliculas(String genero){
        ArrayList<Pelicula> peliculas=new ArrayList<>();
        for (Pelicula peli : pel) {
            if (peli.getGenero().equalsIgnoreCase(genero)) {
               peliculas.add(peli);
            }
        }
        return peliculas;
    }

    @Override
    public String toString() {
        return "Productora{" + "nombre=" + nombre + ", fechaDeCreacion=" + fechaDeCreacion + ", dir=" + dir + ", pel=" + pel + ", act=" + act + '}';
    }
    
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Calendar getFechaDeCreacion() {
        return fechaDeCreacion;
    }

    public void setFechaDeCreacion(Calendar fechaDeCreacion) {
        this.fechaDeCreacion = fechaDeCreacion;
    }

    public ArrayList<Director> getDir() {
        return dir;
    }

    public void setDir(ArrayList<Director> dir) {
        this.dir = dir;
    }

    public ArrayList<Pelicula> getPel() {
        return pel;
    }

    public void setPel(ArrayList<Pelicula> pel) {
        this.pel = pel;
    }

    public ArrayList<Actor> getAct() {
        return act;
    }

    public void setAct(ArrayList<Actor> act) {
        this.act = act;
    }

}
