package dominio;

/**
 * TelefonosparqueId
 */
public class TelefonosparqueId {


     private int idparque;
     private String telefono;

    public TelefonosparqueId() {
    }

    public TelefonosparqueId(int idparque, String telefono) {
       this.idparque = idparque;
       this.telefono = telefono;
    }
   
    public int getIdparque() {
        return this.idparque;
    }
    
    public void setIdparque(int idparque) {
        this.idparque = idparque;
    }
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof TelefonosparqueId) ) return false;
		 TelefonosparqueId castOther = ( TelefonosparqueId ) other; 
         
		 return (this.getIdparque()==castOther.getIdparque())
 && ( (this.getTelefono()==castOther.getTelefono()) || ( this.getTelefono()!=null && castOther.getTelefono()!=null && this.getTelefono().equals(castOther.getTelefono()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getIdparque();
         result = 37 * result + ( getTelefono() == null ? 0 : this.getTelefono().hashCode() );
         return result;
   }   


}


