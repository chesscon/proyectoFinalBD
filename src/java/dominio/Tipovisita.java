package dominio;

import java.util.HashSet;
import java.util.Set;

/**
 * Tipovisita
 */
public class Tipovisita {


     private int id;
     private String descripcion;
     private Set<Reservacion> reservacions = new HashSet<Reservacion>(0);

    public Tipovisita() {
    }

	
    public Tipovisita(int id) {
        this.id = id;
    }
    public Tipovisita(int id, String descripcion, Set<Reservacion> reservacions) {
       this.id = id;
       this.descripcion = descripcion;
       this.reservacions = reservacions;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Set<Reservacion> getReservacions() {
        return this.reservacions;
    }
    
    public void setReservacions(Set<Reservacion> reservacions) {
        this.reservacions = reservacions;
    }




}


