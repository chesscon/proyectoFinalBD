package dominio;

/**
 * Pertenecer
 */
public class Pertenecer {


     private PertenecerId id;
     private Escuela escuela;
     private Persona persona;
     private String grado;
     private String tipo;

    public Pertenecer() {
    }

    public Pertenecer(PertenecerId id, Escuela escuela, Persona persona, String grado, String tipo) {
       this.id = id;
       this.escuela = escuela;
       this.persona = persona;
       this.grado = grado;
       this.tipo = tipo;
    }
   
    public PertenecerId getId() {
        return this.id;
    }
    
    public void setId(PertenecerId id) {
        this.id = id;
    }
    public Escuela getEscuela() {
        return this.escuela;
    }
    
    public void setEscuela(Escuela escuela) {
        this.escuela = escuela;
    }
    public Persona getPersona() {
        return this.persona;
    }
    
    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    public String getGrado() {
        return this.grado;
    }
    
    public void setGrado(String grado) {
        this.grado = grado;
    }
    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }




}


