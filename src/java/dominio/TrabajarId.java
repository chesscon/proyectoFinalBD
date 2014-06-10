package dominio;

/**
 * TrabajarId
 */
public class TrabajarId {


     private int idparque;
     private String rfcempleado;

    public TrabajarId() {
    }

    public TrabajarId(int idparque, String rfcempleado) {
       this.idparque = idparque;
       this.rfcempleado = rfcempleado;
    }
   
    public int getIdparque() {
        return this.idparque;
    }
    
    public void setIdparque(int idparque) {
        this.idparque = idparque;
    }
    public String getRfcempleado() {
        return this.rfcempleado;
    }
    
    public void setRfcempleado(String rfcempleado) {
        this.rfcempleado = rfcempleado;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof TrabajarId) ) return false;
		 TrabajarId castOther = ( TrabajarId ) other; 
         
		 return (this.getIdparque()==castOther.getIdparque())
 && ( (this.getRfcempleado()==castOther.getRfcempleado()) || ( this.getRfcempleado()!=null && castOther.getRfcempleado()!=null && this.getRfcempleado().equals(castOther.getRfcempleado()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getIdparque();
         result = 37 * result + ( getRfcempleado() == null ? 0 : this.getRfcempleado().hashCode() );
         return result;
   }   


}


