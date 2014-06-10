package dominio;

import java.util.HashSet;
import java.util.Set;

/**
 * Tipoboleto
 */
public class Tipoboleto {


     private int clave;
     private String descripcion;
     private Set<Boleto> boletos = new HashSet<Boleto>(0);

    public Tipoboleto() {
    }

	
    public Tipoboleto(int clave, String descripcion) {
        this.clave = clave;
        this.descripcion = descripcion;
    }
    public Tipoboleto(int clave, String descripcion, Set<Boleto> boletos) {
       this.clave = clave;
       this.descripcion = descripcion;
       this.boletos = boletos;
    }
   
    public int getClave() {
        return this.clave;
    }
    
    public void setClave(int clave) {
        this.clave = clave;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Set<Boleto> getBoletos() {
        return this.boletos;
    }
    
    public void setBoletos(Set<Boleto> boletos) {
        this.boletos = boletos;
    }




}


