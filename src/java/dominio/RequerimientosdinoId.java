package dominio;

/**
 * RequerimientosdinoId
 */
public class RequerimientosdinoId {


     private int iddino;
     private int id;

    public RequerimientosdinoId() {
    }

    public RequerimientosdinoId(int iddino, int id) {
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
		 if ( !(other instanceof RequerimientosdinoId) ) return false;
		 RequerimientosdinoId castOther = ( RequerimientosdinoId ) other; 
         
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


