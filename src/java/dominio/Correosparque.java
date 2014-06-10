package dominio;

/**
 * Correosparque
 */
public class Correosparque {


     private CorreosparqueId id;
     private Parque parque;

    public Correosparque() {
    }

    public Correosparque(CorreosparqueId id, Parque parque) {
       this.id = id;
       this.parque = parque;
    }
   
    public CorreosparqueId getId() {
        return this.id;
    }
    
    public void setId(CorreosparqueId id) {
        this.id = id;
    }
    public Parque getParque() {
        return this.parque;
    }
    
    public void setParque(Parque parque) {
        this.parque = parque;
    }




}


