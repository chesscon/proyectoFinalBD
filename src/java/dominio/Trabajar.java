package dominio;

/**
 * Trabajar
 */
public class Trabajar {


     private TrabajarId id;
     private Empleado empleado;
     private Parque parque;
     private Double sueldo;
     private String diadescanso;

    public Trabajar() {
    }

	
    public Trabajar(TrabajarId id, Empleado empleado, Parque parque) {
        this.id = id;
        this.empleado = empleado;
        this.parque = parque;
    }
    public Trabajar(TrabajarId id, Empleado empleado, Parque parque, Double sueldo, String diadescanso) {
       this.id = id;
       this.empleado = empleado;
       this.parque = parque;
       this.sueldo = sueldo;
       this.diadescanso = diadescanso;
    }
   
    public TrabajarId getId() {
        return this.id;
    }
    
    public void setId(TrabajarId id) {
        this.id = id;
    }
    public Empleado getEmpleado() {
        return this.empleado;
    }
    
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
    public Parque getParque() {
        return this.parque;
    }
    
    public void setParque(Parque parque) {
        this.parque = parque;
    }
    public Double getSueldo() {
        return this.sueldo;
    }
    
    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }
    public String getDiadescanso() {
        return this.diadescanso;
    }
    
    public void setDiadescanso(String diadescanso) {
        this.diadescanso = diadescanso;
    }




}


