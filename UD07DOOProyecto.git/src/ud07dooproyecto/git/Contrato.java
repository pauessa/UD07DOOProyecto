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
public class Contrato {

    private int id;
    private Calendar fecha;
    private Double precio;
    private Actor actor;

    public Contrato() {
    }

    public Contrato(int id, Calendar fecha, Double precio, Actor actor) {
        this.id = id;
        this.fecha = fecha;
        this.precio = precio;
        this.actor = actor;
    }

    
 
    
    @Override
    public String toString() {
        return "Contrato{" + "id=" + id + ", fecha=" + fecha + ", precio=" + precio + ", actor=" + actor + '}';
    }
    
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }
    
            

}
