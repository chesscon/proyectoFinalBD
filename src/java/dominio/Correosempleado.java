package dominio;
// Generated 09-jun-2014 20:30:13 by Hibernate Tools 3.6.0



/**
 * Correosempleado generated by hbm2java
 */
public class Correosempleado  implements java.io.Serializable {


     private CorreosempleadoId id;
     private Empleado empleado;

    public Correosempleado() {
    }

    public Correosempleado(CorreosempleadoId id, Empleado empleado) {
       this.id = id;
       this.empleado = empleado;
    }
   
    public CorreosempleadoId getId() {
        return this.id;
    }
    
    public void setId(CorreosempleadoId id) {
        this.id = id;
    }
    public Empleado getEmpleado() {
        return this.empleado;
    }
    
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }




}


