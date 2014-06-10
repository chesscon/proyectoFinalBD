package dominio;

/**
 * CaracteristicasdinoId 
 */
public class CaracteristicasdinoId  {

     private int iddino;
     private int id;

    public CaracteristicasdinoId() {
    }

    public CaracteristicasdinoId(int iddino, int id) {
       this.iddino = iddino;
       this.id = id;
    }
   
    public int getIddino() {
        return this.iddino;
    }
    
    public void setIddino(int iddino) {
        this.iddino = iddino;
    }
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof CaracteristicasdinoId) ) return false;
		 CaracteristicasdinoId castOther = ( CaracteristicasdinoId ) other; 
         
		 return (this.getIddino()==castOther.getIddino())
 && (this.getId()==castOther.getId());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getIddino();
         result = 37 * result + this.getId();
         return result;
   }   


}


