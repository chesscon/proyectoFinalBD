package dominio;

/**
 * TelescuelaId
 */
public class TelescuelaId {


     private int codesc;
     private String telefono;

    public TelescuelaId() {
    }

    public TelescuelaId(int codesc, String telefono) {
       this.codesc = codesc;
       this.telefono = telefono;
    }
   
    public int getCodesc() {
        return this.codesc;
    }
    
    public void setCodesc(int codesc) {
        this.codesc = codesc;
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
		 if ( !(other instanceof TelescuelaId) ) return false;
		 TelescuelaId castOther = ( TelescuelaId ) other; 
         
		 return (this.getCodesc()==castOther.getCodesc())
 && ( (this.getTelefono()==castOther.getTelefono()) || ( this.getTelefono()!=null && castOther.getTelefono()!=null && this.getTelefono().equals(castOther.getTelefono()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getCodesc();
         result = 37 * result + ( getTelefono() == null ? 0 : this.getTelefono().hashCode() );
         return result;
   }   


}


