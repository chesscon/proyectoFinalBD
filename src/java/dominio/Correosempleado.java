package dominio;

/**
 * Correosempleado
 */
public class Correosempleado {


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


