/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ud07dooproyecto.git;

import java.util.ArrayList;

/**
 *
 * @author pauessa
 */
public class Pelicula {

    private String nombre;
    private String genero;
    private int duracion;
    private ArrayList<Contrato> contrato;
    private Director director;

    public Pelicula() {
    }

    public Pelicula(String nombre, String genero, int duracion,Director director) {
        this.nombre = nombre;
        this.genero = genero;
        this.duracion = duracion;
        this.contrato = new ArrayList<>();
        this.director= director;
    }

    public void addContrato(Contrato contrato){
        this.contrato.add(contrato);
    }

    @Override
    public String toString() {
        return "Pelicula{" + "nombre=" + nombre + ", genero=" + genero + ", duracion=" + duracion + ", contrato=" + contrato + ", director=" + director + '}';
    }
    
    
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public ArrayList<Contrato> getContrato() {
        return contrato;
    }

    public void setContrato(ArrayList<Contrato> contrato) {
        this.contrato = contrato;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }
    
    
    

}
