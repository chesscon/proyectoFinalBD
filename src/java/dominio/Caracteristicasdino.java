package dominio;

/**
 * Caracteristicasdino
 */
public class Caracteristicasdino  {


     private CaracteristicasdinoId id;
     private Dinosaurio dinosaurio;
     private String nombre;
     private String valor;

    public Caracteristicasdino() {
    }

    public Caracteristicasdino(CaracteristicasdinoId id, Dinosaurio dinosaurio, String nombre, String valor) {
       this.id = id;
       this.dinosaurio = dinosaurio;
       this.nombre = nombre;
       this.valor = valor;
    }
   
    public CaracteristicasdinoId getId() {
        return this.id;
    }
    
    public void setId(CaracteristicasdinoId id) {
        this.id = id;
    }
    public Dinosaurio getDinosaurio() {
        return this.dinosaurio;
    }
    
    public void setDinosaurio(Dinosaurio dinosaurio) {
        this.dinosaurio = dinosaurio;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getValor() {
        return this.valor;
    }
    
    public void setValor(String valor) {
        this.valor = valor;
    }




}


