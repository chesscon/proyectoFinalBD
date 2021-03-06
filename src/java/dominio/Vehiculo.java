package dominio;

import java.util.HashSet;
import java.util.Set;

/**
 * Vehiculo 
 */
public class Vehiculo {


     private int id;
     private Parque parque;
     private String tipo;
     private Integer capacidad;
     private Set<Caractvehiculo> caractvehiculos = new HashSet<Caractvehiculo>(0);

    public Vehiculo() {
    }

	
    public Vehiculo(int id, String tipo) {
        this.id = id;
        this.tipo = tipo;
    }
    public Vehiculo(int id, Parque parque, String tipo, Integer capacidad, Set<Caractvehiculo> caractvehiculos) {
       this.id = id;
       this.parque = parque;
       this.tipo = tipo;
       this.capacidad = capacidad;
       this.caractvehiculos = caractvehiculos;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Parque getParque() {
        return this.parque;
    }
    
    public void setParque(Parque parque) {
        this.parque = parque;
    }
    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public Integer getCapacidad() {
        return this.capacidad;
    }
    
    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }
    public Set<Caractvehiculo> getCaractvehiculos() {
        return this.caractvehiculos;
    }
    
    public void setCaractvehiculos(Set<Caractvehiculo> caractvehiculos) {
        this.caractvehiculos = caractvehiculos;
    }




}


