package dominio;

import java.util.HashSet;
import java.util.Set;

/**
 * Zona 
 */
public class Zona {


     private int id;
     private Empleado empleadoByRfcresponsable;
     private Dinosaurio dinosaurio;
     private Empleado empleadoByRfcrespseguridad;
     private Empleado empleadoByRfcresplimpieza;
     private Parque parque;
     private Integer superficie;
     private Integer numejem;
     private Set<Auxiliar> auxiliars = new HashSet<Auxiliar>(0);
     private Set<Reservacion> reservacions = new HashSet<Reservacion>(0);

    public Zona() {
    }

	
    public Zona(int id) {
        this.id = id;
    }
    public Zona(int id, Empleado empleadoByRfcresponsable, Dinosaurio dinosaurio, Empleado empleadoByRfcrespseguridad, Empleado empleadoByRfcresplimpieza, Parque parque, Integer superficie, Integer numejem, Set<Auxiliar> auxiliars, Set<Reservacion> reservacions) {
       this.id = id;
       this.empleadoByRfcresponsable = empleadoByRfcresponsable;
       this.dinosaurio = dinosaurio;
       this.empleadoByRfcrespseguridad = empleadoByRfcrespseguridad;
       this.empleadoByRfcresplimpieza = empleadoByRfcresplimpieza;
       this.parque = parque;
       this.superficie = superficie;
       this.numejem = numejem;
       this.auxiliars = auxiliars;
       this.reservacions = reservacions;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Empleado getEmpleadoByRfcresponsable() {
        return this.empleadoByRfcresponsable;
    }
    
    public void setEmpleadoByRfcresponsable(Empleado empleadoByRfcresponsable) {
        this.empleadoByRfcresponsable = empleadoByRfcresponsable;
    }
    public Dinosaurio getDinosaurio() {
        return this.dinosaurio;
    }
    
    public void setDinosaurio(Dinosaurio dinosaurio) {
        this.dinosaurio = dinosaurio;
    }
    public Empleado getEmpleadoByRfcrespseguridad() {
        return this.empleadoByRfcrespseguridad;
    }
    
    public void setEmpleadoByRfcrespseguridad(Empleado empleadoByRfcrespseguridad) {
        this.empleadoByRfcrespseguridad = empleadoByRfcrespseguridad;
    }
    public Empleado getEmpleadoByRfcresplimpieza() {
        return this.empleadoByRfcresplimpieza;
    }
    
    public void setEmpleadoByRfcresplimpieza(Empleado empleadoByRfcresplimpieza) {
        this.empleadoByRfcresplimpieza = empleadoByRfcresplimpieza;
    }
    public Parque getParque() {
        return this.parque;
    }
    
    public void setParque(Parque parque) {
        this.parque = parque;
    }
    public Integer getSuperficie() {
        return this.superficie;
    }
    
    public void setSuperficie(Integer superficie) {
        this.superficie = superficie;
    }
    public Integer getNumejem() {
        return this.numejem;
    }
    
    public void setNumejem(Integer numejem) {
        this.numejem = numejem;
    }
    public Set<Auxiliar> getAuxiliars() {
        return this.auxiliars;
    }
    
    public void setAuxiliars(Set<Auxiliar> auxiliars) {
        this.auxiliars = auxiliars;
    }
    public Set<Reservacion> getReservacions() {
        return this.reservacions;
    }
    
    public void setReservacions(Set<Reservacion> reservacions) {
        this.reservacions = reservacions;
    }




}


