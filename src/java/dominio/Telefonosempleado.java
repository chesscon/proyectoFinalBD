package dominio;

/**
 * Telefonosempleado
 */
public class Telefonosempleado {


     private TelefonosempleadoId id;
     private Empleado empleado;

    public Telefonosempleado() {
    }

    public Telefonosempleado(TelefonosempleadoId id, Empleado empleado) {
       this.id = id;
       this.empleado = empleado;
    }
   
    public TelefonosempleadoId getId() {
        return this.id;
    }
    
    public void setId(TelefonosempleadoId id) {
        this.id = id;
    }
    public Empleado getEmpleado() {
        return this.empleado;
    }
    
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }




}


