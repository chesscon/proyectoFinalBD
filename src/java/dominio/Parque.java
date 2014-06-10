package dominio;

import java.util.HashSet;
import java.util.Set;

/**
 * Parque
 */
public class Parque {


     private int id;
     private String nombre;
     private String calle;
     private String num;
     private String colonia;
     private int cp;
     private String ciudad;
     private String estado;
     private Set<Zona> zonas = new HashSet<Zona>(0);
     private Set<Trabajar> trabajars = new HashSet<Trabajar>(0);
     private Set<Vehiculo> vehiculos = new HashSet<Vehiculo>(0);
     private Set<Correosparque> correosparques = new HashSet<Correosparque>(0);
     private Set<Telefonosparque> telefonosparques = new HashSet<Telefonosparque>(0);

    public Parque() {
    }

	
    public Parque(int id, String nombre, String calle, String num, String colonia, int cp, String ciudad, String estado) {
        this.id = id;
        this.nombre = nombre;
        this.calle = calle;
        this.num = num;
        this.colonia = colonia;
        this.cp = cp;
        this.ciudad = ciudad;
        this.estado = estado;
    }
    public Parque(int id, String nombre, String calle, String num, String colonia, int cp, String ciudad, String estado, Set<Zona> zonas, Set<Trabajar> trabajars, Set<Vehiculo> vehiculos, Set<Correosparque> correosparques, Set<Telefonosparque> telefonosparques) {
       this.id = id;
       this.nombre = nombre;
       this.calle = calle;
       this.num = num;
       this.colonia = colonia;
       this.cp = cp;
       this.ciudad = ciudad;
       this.estado = estado;
       this.zonas = zonas;
       this.trabajars = trabajars;
       this.vehiculos = vehiculos;
       this.correosparques = correosparques;
       this.telefonosparques = telefonosparques;
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
    public String getCalle() {
        return this.calle;
    }
    
    public void setCalle(String calle) {
        this.calle = calle;
    }
    public String getNum() {
        return this.num;
    }
    
    public void setNum(String num) {
        this.num = num;
    }
    public String getColonia() {
        return this.colonia;
    }
    
    public void setColonia(String colonia) {
        this.colonia = colonia;
    }
    public int getCp() {
        return this.cp;
    }
    
    public void setCp(int cp) {
        this.cp = cp;
    }
    public String getCiudad() {
        return this.ciudad;
    }
    
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public Set<Zona> getZonas() {
        return this.zonas;
    }
    
    public void setZonas(Set<Zona> zonas) {
        this.zonas = zonas;
    }
    public Set<Trabajar> getTrabajars() {
        return this.trabajars;
    }
    
    public void setTrabajars(Set<Trabajar> trabajars) {
        this.trabajars = trabajars;
    }
    public Set<Vehiculo> getVehiculos() {
        return this.vehiculos;
    }
    
    public void setVehiculos(Set<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }
    public Set<Correosparque> getCorreosparques() {
        return this.correosparques;
    }
    
    public void setCorreosparques(Set<Correosparque> correosparques) {
        this.correosparques = correosparques;
    }
    public Set<Telefonosparque> getTelefonosparques() {
        return this.telefonosparques;
    }
    
    public void setTelefonosparques(Set<Telefonosparque> telefonosparques) {
        this.telefonosparques = telefonosparques;
    }




}


