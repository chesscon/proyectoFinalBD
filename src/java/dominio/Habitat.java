package dominio;

import java.util.HashSet;
import java.util.Set;

/**
 * Habitat
 */
public class Habitat {


     private int id;
     private String nombre;
     private String vegetacion;
     private String clima;
     private Set<Dinosaurio> dinosaurios = new HashSet<Dinosaurio>(0);

    public Habitat() {
    }

	
    public Habitat(int id, String nombre, String vegetacion, String clima) {
        this.id = id;
        this.nombre = nombre;
        this.vegetacion = vegetacion;
        this.clima = clima;
    }
    public Habitat(int id, String nombre, String vegetacion, String clima, Set<Dinosaurio> dinosaurios) {
       this.id = id;
       this.nombre = nombre;
       this.vegetacion = vegetacion;
       this.clima = clima;
       this.dinosaurios = dinosaurios;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getVegetacion() {
        return this.vegetacion;
    }
    
    public void setVegetacion(String vegetacion) {
        this.vegetacion = vegetacion;
    }
    public String getClima() {
        return this.clima;
    }
    
    public void setClima(String clima) {
        this.clima = clima;
    }
    public Set<Dinosaurio> getDinosaurios() {
        return this.dinosaurios;
    }
    
    public void setDinosaurios(Set<Dinosaurio> dinosaurios) {
        this.dinosaurios = dinosaurios;
    }




}


