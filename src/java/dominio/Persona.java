package dominio;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Persona
 */
public class Persona {

  private String curp;
  private Date fechaNac;
  private String nombre;
  private String apaterno;
  private String amaterno;
  private Set<Realizar> realizars = new HashSet<Realizar>(0);
  private Set<Boleto> boletos = new HashSet<Boleto>(0);
  private Set<Pertenecer> pertenecers = new HashSet<Pertenecer>(0);
  private String grado;
  private int idEscuela;
  private String tipo;

  public Persona() {
  }

  public Persona(String curp, Date fechaNac, String nombre, String apaterno, String amaterno) {
    this.curp = curp;
    this.fechaNac = fechaNac;
    this.nombre = nombre;
    this.apaterno = apaterno;
    this.amaterno = amaterno;
  }

  public Persona(String curp, Date fechaNac, String nombre, String apaterno, String amaterno, Set<Realizar> realizars, Set<Boleto> boletos, Set<Pertenecer> pertenecers) {
    this.curp = curp;
    this.fechaNac = fechaNac;
    this.nombre = nombre;
    this.apaterno = apaterno;
    this.amaterno = amaterno;
    this.realizars = realizars;
    this.boletos = boletos;
    this.pertenecers = pertenecers;
  }

  public String getGrado() {
    return grado;
  }

  public void setGrado(String grado) {
    this.grado = grado;
  }

  public int getIdEscuela() {
    return idEscuela;
  }

  public void setIdEscuela(int idEscuela) {
    this.idEscuela = idEscuela;
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public String getCurp() {
    return this.curp;
  }

  public void setCurp(String curp) {
    this.curp = curp;
  }

  public Date getFechaNac() {
    return this.fechaNac;
  }

  public void setFechaNac(Date fechaNac) {
    this.fechaNac = fechaNac;
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

  public Set<Realizar> getRealizars() {
    return this.realizars;
  }

  public void setRealizars(Set<Realizar> realizars) {
    this.realizars = realizars;
  }

  public Set<Boleto> getBoletos() {
    return this.boletos;
  }

  public void setBoletos(Set<Boleto> boletos) {
    this.boletos = boletos;
  }

  public Set<Pertenecer> getPertenecers() {
    return this.pertenecers;
  }

  public void setPertenecers(Set<Pertenecer> pertenecers) {
    this.pertenecers = pertenecers;
  }

}
