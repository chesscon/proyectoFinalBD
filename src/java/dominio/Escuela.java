package dominio;

import java.util.HashSet;
import java.util.Set;

/**
 * Escuela
 */
public class Escuela {


     private int codigo;
     private String nombre;
     private String calle;
     private String numero;
     private String colonia;
     private int cp;
     private String ciudad;
     private String estado;
     private Set<Pertenecer> pertenecers = new HashSet<Pertenecer>(0);
     private Set<Correoescuela> correoescuelas = new HashSet<Correoescuela>(0);
     private Set<Telescuela> telescuelas = new HashSet<Telescuela>(0);

    public Escuela() {
    }
    
    public Escuela(int codigo, String nombre) {
      this.codigo = codigo;
      this.nombre = nombre;
    }
	
    public Escuela(int codigo, String nombre, String calle, String numero, String colonia, int cp, String ciudad, String estado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.calle = calle;
        this.numero = numero;
        this.colonia = colonia;
        this.cp = cp;
        this.ciudad = ciudad;
        this.estado = estado;
    }
    public Escuela(int codigo, String nombre, String calle, String numero, String colonia, int cp, String ciudad, String estado, Set<Pertenecer> pertenecers, Set<Correoescuela> correoescuelas, Set<Telescuela> telescuelas) {
       this.codigo = codigo;
       this.nombre = nombre;
       this.calle = calle;
       this.numero = numero;
       this.colonia = colonia;
       this.cp = cp;
       this.ciudad = ciudad;
       this.estado = estado;
       this.pertenecers = pertenecers;
       this.correoescuelas = correoescuelas;
       this.telescuelas = telescuelas;
    }
   
    public int getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
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
    public Set<Pertenecer> getPertenecers() {
        return this.pertenecers;
    }
    
    public void setPertenecers(Set<Pertenecer> pertenecers) {
        this.pertenecers = pertenecers;
    }
    public Set<Correoescuela> getCorreoescuelas() {
        return this.correoescuelas;
    }
    
    public void setCorreoescuelas(Set<Correoescuela> correoescuelas) {
        this.correoescuelas = correoescuelas;
    }
    public Set<Telescuela> getTelescuelas() {
        return this.telescuelas;
    }
    
    public void setTelescuelas(Set<Telescuela> telescuelas) {
        this.telescuelas = telescuelas;
    }




}


