package dominio;

/**
 * TelefonosempleadoId 
 */
public class TelefonosempleadoId {


     private String rfcempleado;
     private String telefono;

    public TelefonosempleadoId() {
    }

    public TelefonosempleadoId(String rfcempleado, String telefono) {
       this.rfcempleado = rfcempleado;
       this.telefono = telefono;
    }
   
    public String getRfcempleado() {
        return this.rfcempleado;
    }
    
    public void setRfcempleado(String rfcempleado) {
        this.rfcempleado = rfcempleado;
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
		 if ( !(other instanceof TelefonosempleadoId) ) return false;
		 TelefonosempleadoId castOther = ( TelefonosempleadoId ) other; 
         
		 return ( (this.getRfcempleado()==castOther.getRfcempleado()) || ( this.getRfcempleado()!=null && castOther.getRfcempleado()!=null && this.getRfcempleado().equals(castOther.getRfcempleado()) ) )
 && ( (this.getTelefono()==castOther.getTelefono()) || ( this.getTelefono()!=null && castOther.getTelefono()!=null && this.getTelefono().equals(castOther.getTelefono()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getRfcempleado() == null ? 0 : this.getRfcempleado().hashCode() );
         result = 37 * result + ( getTelefono() == null ? 0 : this.getTelefono().hashCode() );
         return result;
   }   


}


