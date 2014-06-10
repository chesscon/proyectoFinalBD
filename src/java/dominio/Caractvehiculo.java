package dominio;

/**
 * Caractvehiculo
 */
public class Caractvehiculo {

     private CaractvehiculoId id;
     private Vehiculo vehiculo;
     private String caracteristica;

    public Caractvehiculo() {
    }

    public Caractvehiculo(CaractvehiculoId id, Vehiculo vehiculo, String caracteristica) {
       this.id = id;
       this.vehiculo = vehiculo;
       this.caracteristica = caracteristica;
    }
   
    public CaractvehiculoId getId() {
        return this.id;
    }
    
    public void setId(CaractvehiculoId id) {
        this.id = id;
    }
    public Vehiculo getVehiculo() {
        return this.vehiculo;
    }
    
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    public String getCaracteristica() {
        return this.caracteristica;
    }
    
    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }




}


