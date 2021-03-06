package dominio;

/**
 * CaractvehiculoId
 */
public class CaractvehiculoId {


     private int idvehiculo;
     private int idcaract;

    public CaractvehiculoId() {
    }

    public CaractvehiculoId(int idvehiculo, int idcaract) {
       this.idvehiculo = idvehiculo;
       this.idcaract = idcaract;
    }
   
    public int getIdvehiculo() {
        return this.idvehiculo;
    }
    
    public void setIdvehiculo(int idvehiculo) {
        this.idvehiculo = idvehiculo;
    }
    public int getIdcaract() {
        return this.idcaract;
    }
    
    public void setIdcaract(int idcaract) {
        this.idcaract = idcaract;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof CaractvehiculoId) ) return false;
		 CaractvehiculoId castOther = ( CaractvehiculoId ) other; 
         
		 return (this.getIdvehiculo()==castOther.getIdvehiculo())
 && (this.getIdcaract()==castOther.getIdcaract());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getIdvehiculo();
         result = 37 * result + this.getIdcaract();
         return result;
   }   


}


