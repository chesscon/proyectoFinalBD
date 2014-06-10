package dominio;

/**
 * Correoescuela
 */
public class Correoescuela {


     private CorreoescuelaId id;
     private Escuela escuela;

    public Correoescuela() {
    }

    public Correoescuela(CorreoescuelaId id, Escuela escuela) {
       this.id = id;
       this.escuela = escuela;
    }
   
    public CorreoescuelaId getId() {
        return this.id;
    }
    
    public void setId(CorreoescuelaId id) {
        this.id = id;
    }
    public Escuela getEscuela() {
        return this.escuela;
    }
    
    public void setEscuela(Escuela escuela) {
        this.escuela = escuela;
    }




}


