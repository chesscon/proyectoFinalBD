package dominio;

/**
 * Auxiliar 
 */
public class Auxiliar {

     private AuxiliarId id;
     private Empleado empleado;
     private Zona zona;
     private String nombramiento;

    public Auxiliar() {
    }

    public Auxiliar(AuxiliarId id, Empleado empleado, Zona zona, String nombramiento) {
       this.id = id;
       this.empleado = empleado;
       this.zona = zona;
       this.nombramiento = nombramiento;
    }
   
    public AuxiliarId getId() {
        return this.id;
    }
    
    public void setId(AuxiliarId id) {
        this.id = id;
    }
    public Empleado getEmpleado() {
        return this.empleado;
    }
    
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
    public Zona getZona() {
        return this.zona;
    }
    
    public void setZona(Zona zona) {
        this.zona = zona;
    }
    public String getNombramiento() {
        return this.nombramiento;
    }
    
    public void setNombramiento(String nombramiento) {
        this.nombramiento = nombramiento;
    }




}


