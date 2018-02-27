/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ud07dooproyecto.git;

/**
 *
 * @author pauessa
 */
public class Actor {
    private String nombre;
    private String dni;
    private int npelis;

    public Actor() {
    }

    public Actor(String nombre, String dni, int npelis) {
        this.nombre = nombre;
        this.dni = dni;
        this.npelis = npelis;
    }

    @Override
    public String toString() {
        return "Actor{" + "nombre=" + nombre + ", dni=" + dni + ", npelis=" + npelis + '}';
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getNpelis() {
        return npelis;
    }

    public void setNpelis(int npelis) {
        this.npelis = npelis;
    }
    
    
    
}
