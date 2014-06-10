package dominio;

/**
 * CorreosparqueId
 */
public class CorreosparqueId {


     private int idparque;
     private String correo;

    public CorreosparqueId() {
    }

    public CorreosparqueId(int idparque, String correo) {
       this.idparque = idparque;
       this.correo = correo;
    }
   
    public int getIdparque() {
        return this.idparque;
    }
    
    public void setIdparque(int idparque) {
        this.idparque = idparque;
    }
    public String getCorreo() {
        return this.correo;
    }
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof CorreosparqueId) ) return false;
		 CorreosparqueId castOther = ( CorreosparqueId ) other; 
         
		 return (this.getIdparque()==castOther.getIdparque())
 && ( (this.getCorreo()==castOther.getCorreo()) || ( this.getCorreo()!=null && castOther.getCorreo()!=null && this.getCorreo().equals(castOther.getCorreo()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getIdparque();
         result = 37 * result + ( getCorreo() == null ? 0 : this.getCorreo().hashCode() );
         return result;
   }   


}


