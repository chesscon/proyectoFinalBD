package dominio;
// Generated 09-jun-2014 20:30:13 by Hibernate Tools 3.6.0


import java.util.Date;

/**
 * Realizar generated by hbm2java
 */
public class Realizar  implements java.io.Serializable {


     private RealizarId id;
     private Persona persona;
     private Reservacion reservacion;
     private Date fecha;
     private String medio;

    public Realizar() {
    }

	
    public Realizar(RealizarId id, Persona persona, Reservacion reservacion, String medio) {
        this.id = id;
        this.persona = persona;
        this.reservacion = reservacion;
        this.medio = medio;
    }
    public Realizar(RealizarId id, Persona persona, Reservacion reservacion, Date fecha, String medio) {
       this.id = id;
       this.persona = persona;
       this.reservacion = reservacion;
       this.fecha = fecha;
       this.medio = medio;
    }
   
    public RealizarId getId() {
        return this.id;
    }
    
    public void setId(RealizarId id) {
        this.id = id;
    }
    public Persona getPersona() {
        return this.persona;
    }
    
    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    public Reservacion getReservacion() {
        return this.reservacion;
    }
    
    public void setReservacion(Reservacion reservacion) {
        this.reservacion = reservacion;
    }
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public String getMedio() {
        return this.medio;
    }
    
    public void setMedio(String medio) {
        this.medio = medio;
    }




}

