package dominio;

/**
 * Requerimientosdino
 */
public class Requerimientosdino {


     private RequerimientosdinoId id;
     private Dinosaurio dinosaurio;
     private String nombre;
     private String valor;

    public Requerimientosdino() {
    }

    public Requerimientosdino(RequerimientosdinoId id, Dinosaurio dinosaurio, String nombre, String valor) {
       this.id = id;
       this.dinosaurio = dinosaurio;
       this.nombre = nombre;
       this.valor = valor;
    }
   
    public RequerimientosdinoId getId() {
        return this.id;
    }
    
    public void setId(RequerimientosdinoId id) {
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


