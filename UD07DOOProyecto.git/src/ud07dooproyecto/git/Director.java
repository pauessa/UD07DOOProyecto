/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ud07dooproyecto.git;

import java.util.Calendar;

/**
 *
 * @author pauessa
 */
public class Director {
    private String nombre;
    private String dni;
    private Calendar fecha_nacimineto;

    public Director() {
    }

    public Director(String nombre, String dni, Calendar fecha_nacimineto) {
        this.nombre = nombre;
        this.dni = dni;
        this.fecha_nacimineto = fecha_nacimineto;
    }

    @Override
    public String toString() {
        return "Director{" + "nombre=" + nombre + ", dni=" + dni + ", fecha_nacimineto=" + fecha_nacimineto.getTime() + '}';
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

    public Calendar getFecha_nacimineto() {
        return fecha_nacimineto;
    }

    public void setFecha_nacimineto(Calendar fecha_nacimineto) {
        this.fecha_nacimineto = fecha_nacimineto;
    }
    
    
    
}
