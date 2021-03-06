package dominio;

import java.util.HashSet;
import java.util.Set;

/**
 * Dinosaurio
 */
public class Dinosaurio {

     private int id;
     private Habitat habitat;
     private String alimentacion;
     private String reino;
     private String filo;
     private String clase;
     private Set<Zona> zonas = new HashSet<Zona>(0);
     private Set<Requerimientosdino> requerimientosdinos = new HashSet<Requerimientosdino>(0);
     private Set<Caracteristicasdino> caracteristicasdinos = new HashSet<Caracteristicasdino>(0);

    public Dinosaurio() {
    }

	
    public Dinosaurio(int id, String alimentacion, String reino, String filo, String clase) {
        this.id = id;
        this.alimentacion = alimentacion;
        this.reino = reino;
        this.filo = filo;
        this.clase = clase;
    }
    public Dinosaurio(int id, Habitat habitat, String alimentacion, String reino, String filo, String clase, Set<Zona> zonas, Set<Requerimientosdino> requerimientosdinos, Set<Caracteristicasdino> caracteristicasdinos) {
       this.id = id;
       this.habitat = habitat;
       this.alimentacion = alimentacion;
       this.reino = reino;
       this.filo = filo;
       this.clase = clase;
       this.zonas = zonas;
       this.requerimientosdinos = requerimientosdinos;
       this.caracteristicasdinos = caracteristicasdinos;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Habitat getHabitat() {
        return this.habitat;
    }
    
    public void setHabitat(Habitat habitat) {
        this.habitat = habitat;
    }
    public String getAlimentacion() {
        return this.alimentacion;
    }
    
    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }
    public String getReino() {
        return this.reino;
    }
    
    public void setReino(String reino) {
        this.reino = reino;
    }
    public String getFilo() {
        return this.filo;
    }
    
    public void setFilo(String filo) {
        this.filo = filo;
    }
    public String getClase() {
        return this.clase;
    }
    
    public void setClase(String clase) {
        this.clase = clase;
    }
    public Set<Zona> getZonas() {
        return this.zonas;
    }
    
    public void setZonas(Set<Zona> zonas) {
        this.zonas = zonas;
    }
    public Set<Requerimientosdino> getRequerimientosdinos() {
        return this.requerimientosdinos;
    }
    
    public void setRequerimientosdinos(Set<Requerimientosdino> requerimientosdinos) {
        this.requerimientosdinos = requerimientosdinos;
    }
    public Set<Caracteristicasdino> getCaracteristicasdinos() {
        return this.caracteristicasdinos;
    }
    
    public void setCaracteristicasdinos(Set<Caracteristicasdino> caracteristicasdinos) {
        this.caracteristicasdinos = caracteristicasdinos;
    }




}


