package dominio;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Reservacion 
 */
public class Reservacion {


     private int id;
     private Tipovisita tipovisita;
     private Date fecha;
     private Set<Zona> zonas = new HashSet<Zona>(0);
     private Set<Realizar> realizars = new HashSet<Realizar>(0);

    public Reservacion() {
    }

	
    public Reservacion(int id) {
        this.id = id;
    }
    public Reservacion(int id, Tipovisita tipovisita, Date fecha, Set<Zona> zonas, Set<Realizar> realizars) {
       this.id = id;
       this.tipovisita = tipovisita;
       this.fecha = fecha;
       this.zonas = zonas;
       this.realizars = realizars;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Tipovisita getTipovisita() {
        return this.tipovisita;
    }
    
    public void setTipovisita(Tipovisita tipovisita) {
        this.tipovisita = tipovisita;
    }
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public Set<Zona> getZonas() {
        return this.zonas;
    }
    
    public void setZonas(Set<Zona> zonas) {
        this.zonas = zonas;
    }
    public Set<Realizar> getRealizars() {
        return this.realizars;
    }
    
    public void setRealizars(Set<Realizar> realizars) {
        this.realizars = realizars;
    }




}


