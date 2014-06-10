package dominio;

/**
 * Telefonosparque
 */
public class Telefonosparque {


     private TelefonosparqueId id;
     private Parque parque;

    public Telefonosparque() {
    }

    public Telefonosparque(TelefonosparqueId id, Parque parque) {
       this.id = id;
       this.parque = parque;
    }
   
    public TelefonosparqueId getId() {
        return this.id;
    }
    
    public void setId(TelefonosparqueId id) {
        this.id = id;
    }
    public Parque getParque() {
        return this.parque;
    }
    
    public void setParque(Parque parque) {
        this.parque = parque;
    }




}


