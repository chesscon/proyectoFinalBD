package dominio;

/**
 * Telescuela 
 */
public class Telescuela {


     private TelescuelaId id;
     private Escuela escuela;

    public Telescuela() {
    }

    public Telescuela(TelescuelaId id, Escuela escuela) {
       this.id = id;
       this.escuela = escuela;
    }
   
    public TelescuelaId getId() {
        return this.id;
    }
    
    public void setId(TelescuelaId id) {
        this.id = id;
    }
    public Escuela getEscuela() {
        return this.escuela;
    }
    
    public void setEscuela(Escuela escuela) {
        this.escuela = escuela;
    }




}


