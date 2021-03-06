package dominio;

/**
 * CorreosempleadoId
 */
public class CorreosempleadoId {


     private String rfcempleado;
     private String correo;

    public CorreosempleadoId() {
    }

    public CorreosempleadoId(String rfcempleado, String correo) {
       this.rfcempleado = rfcempleado;
       this.correo = correo;
    }
   
    public String getRfcempleado() {
        return this.rfcempleado;
    }
    
    public void setRfcempleado(String rfcempleado) {
        this.rfcempleado = rfcempleado;
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
		 if ( !(other instanceof CorreosempleadoId) ) return false;
		 CorreosempleadoId castOther = ( CorreosempleadoId ) other; 
         
		 return ( (this.getRfcempleado()==castOther.getRfcempleado()) || ( this.getRfcempleado()!=null && castOther.getRfcempleado()!=null && this.getRfcempleado().equals(castOther.getRfcempleado()) ) )
 && ( (this.getCorreo()==castOther.getCorreo()) || ( this.getCorreo()!=null && castOther.getCorreo()!=null && this.getCorreo().equals(castOther.getCorreo()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getRfcempleado() == null ? 0 : this.getRfcempleado().hashCode() );
         result = 37 * result + ( getCorreo() == null ? 0 : this.getCorreo().hashCode() );
         return result;
   }   


}


