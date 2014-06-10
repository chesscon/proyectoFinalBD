package dominio;

import java.util.Date;

/**
 * Boleto
 */
public class Boleto {


     private int id;
     private Tipoboleto tipoboleto;
     private Persona persona;
     private Date fecha;
     private Double precio;

    public Boleto() {
    }

	
    public Boleto(int id) {
        this.id = id;
    }
    public Boleto(int id, Tipoboleto tipoboleto, Persona persona, Date fecha, Double precio) {
       this.id = id;
       this.tipoboleto = tipoboleto;
       this.persona = persona;
       this.fecha = fecha;
       this.precio = precio;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Tipoboleto getTipoboleto() {
        return this.tipoboleto;
    }
    
    public void setTipoboleto(Tipoboleto tipoboleto) {
        this.tipoboleto = tipoboleto;
    }
    public Persona getPersona() {
        return this.persona;
    }
    
    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public Double getPrecio() {
        return this.precio;
    }
    
    public void setPrecio(Double precio) {
        this.precio = precio;
    }




}


