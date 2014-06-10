package dominio;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Empleado
 */
public class Empleado {


     private String rfc;
     private String rfcsupervisor;
     private String nombre;
     private String apaterno;
     private String amaterno;
     private Date fechaNac;
     private String calle;
     private String numero;
     private String colonia;
     private String ciudad;
     private String estado;
     private int cp;
     private String cargo;
     private Set<Telefonosempleado> telefonosempleados = new HashSet<Telefonosempleado>(0);
     private Set<Zona> zonasForRfcrespseguridad = new HashSet<Zona>(0);
     private Set<Auxiliar> auxiliars = new HashSet<Auxiliar>(0);
     private Set<Zona> zonasForRfcresponsable = new HashSet<Zona>(0);
     private Set<Trabajar> trabajars = new HashSet<Trabajar>(0);
     private Set<Zona> zonasForRfcresplimpieza = new HashSet<Zona>(0);
     private Set<Correosempleado> correosempleados = new HashSet<Correosempleado>(0);

    public Empleado() {
    }

	
    public Empleado(String rfc, String rfcsupervisor, String nombre, String apaterno, String amaterno, Date fechaNac, String calle, String numero, String colonia, String ciudad, String estado, int cp, String cargo) {
        this.rfc = rfc;
        this.rfcsupervisor = rfcsupervisor;
        this.nombre = nombre;
        this.apaterno = apaterno;
        this.amaterno = amaterno;
        this.fechaNac = fechaNac;
        this.calle = calle;
        this.numero = numero;
        this.colonia = colonia;
        this.ciudad = ciudad;
        this.estado = estado;
        this.cp = cp;
        this.cargo = cargo;
    }
    public Empleado(String rfc, String rfcsupervisor, String nombre, String apaterno, String amaterno, Date fechaNac, String calle, String numero, String colonia, String ciudad, String estado, int cp, String cargo, Set<Telefonosempleado> telefonosempleados, Set<Zona> zonasForRfcrespseguridad, Set<Auxiliar> auxiliars, Set<Zona> zonasForRfcresponsable, Set<Trabajar> trabajars, Set<Zona> zonasForRfcresplimpieza, Set<Correosempleado> correosempleados) {
       this.rfc = rfc;
       this.rfcsupervisor = rfcsupervisor;
       this.nombre = nombre;
       this.apaterno = apaterno;
       this.amaterno = amaterno;
       this.fechaNac = fechaNac;
       this.calle = calle;
       this.numero = numero;
       this.colonia = colonia;
       this.ciudad = ciudad;
       this.estado = estado;
       this.cp = cp;
       this.cargo = cargo;
       this.telefonosempleados = telefonosempleados;
       this.zonasForRfcrespseguridad = zonasForRfcrespseguridad;
       this.auxiliars = auxiliars;
       this.zonasForRfcresponsable = zonasForRfcresponsable;
       this.trabajars = trabajars;
       this.zonasForRfcresplimpieza = zonasForRfcresplimpieza;
       this.correosempleados = correosempleados;
    }
   
    public String getRfc() {
        return this.rfc;
    }
    
    public void setRfc(String rfc) {
        this.rfc = rfc;
    }
    public String getRfcsupervisor() {
        return this.rfcsupervisor;
    }
    
    public void setRfcsupervisor(String rfcsupervisor) {
        this.rfcsupervisor = rfcsupervisor;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApaterno() {
        return this.apaterno;
    }
    
    public void setApaterno(String apaterno) {
        this.apaterno = apaterno;
    }
    public String getAmaterno() {
        return this.amaterno;
    }
    
    public void setAmaterno(String amaterno) {
        this.amaterno = amaterno;
    }
    public Date getFechaNac() {
        return this.fechaNac;
    }
    
    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }
    public String getCalle() {
        return this.calle;
    }
    
    public void setCalle(String calle) {
        this.calle = calle;
    }
    public String getNumero() {
        return this.numero;
    }
    
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getColonia() {
        return this.colonia;
    }
    
    public void setColonia(String colonia) {
        this.colonia = colonia;
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
    public int getCp() {
        return this.cp;
    }
    
    public void setCp(int cp) {
        this.cp = cp;
    }
    public String getCargo() {
        return this.cargo;
    }
    
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public Set<Telefonosempleado> getTelefonosempleados() {
        return this.telefonosempleados;
    }
    
    public void setTelefonosempleados(Set<Telefonosempleado> telefonosempleados) {
        this.telefonosempleados = telefonosempleados;
    }
    public Set<Zona> getZonasForRfcrespseguridad() {
        return this.zonasForRfcrespseguridad;
    }
    
    public void setZonasForRfcrespseguridad(Set<Zona> zonasForRfcrespseguridad) {
        this.zonasForRfcrespseguridad = zonasForRfcrespseguridad;
    }
    public Set<Auxiliar> getAuxiliars() {
        return this.auxiliars;
    }
    
    public void setAuxiliars(Set<Auxiliar> auxiliars) {
        this.auxiliars = auxiliars;
    }
    public Set<Zona> getZonasForRfcresponsable() {
        return this.zonasForRfcresponsable;
    }
    
    public void setZonasForRfcresponsable(Set<Zona> zonasForRfcresponsable) {
        this.zonasForRfcresponsable = zonasForRfcresponsable;
    }
    public Set<Trabajar> getTrabajars() {
        return this.trabajars;
    }
    
    public void setTrabajars(Set<Trabajar> trabajars) {
        this.trabajars = trabajars;
    }
    public Set<Zona> getZonasForRfcresplimpieza() {
        return this.zonasForRfcresplimpieza;
    }
    
    public void setZonasForRfcresplimpieza(Set<Zona> zonasForRfcresplimpieza) {
        this.zonasForRfcresplimpieza = zonasForRfcresplimpieza;
    }
    public Set<Correosempleado> getCorreosempleados() {
        return this.correosempleados;
    }
    
    public void setCorreosempleados(Set<Correosempleado> correosempleados) {
        this.correosempleados = correosempleados;
    }




}


