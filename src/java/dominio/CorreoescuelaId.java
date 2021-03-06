package dominio;

/**
 * CorreoescuelaId
 */
public class CorreoescuelaId {


     private int codesc;
     private String correo;

    public CorreoescuelaId() {
    }

    public CorreoescuelaId(int codesc, String correo) {
       this.codesc = codesc;
       this.correo = correo;
    }
   
    public int getCodesc() {
        return this.codesc;
    }
    
    public void setCodesc(int codesc) {
        this.codesc = codesc;
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
		 if ( !(other instanceof CorreoescuelaId) ) return false;
		 CorreoescuelaId castOther = ( CorreoescuelaId ) other; 
         
		 return (this.getCodesc()==castOther.getCodesc())
 && ( (this.getCorreo()==castOther.getCorreo()) || ( this.getCorreo()!=null && castOther.getCorreo()!=null && this.getCorreo().equals(castOther.getCorreo()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getCodesc();
         result = 37 * result + ( getCorreo() == null ? 0 : this.getCorreo().hashCode() );
         return result;
   }   


}


