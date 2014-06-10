package dominio;

/**
 * AuxiliarId
 */
public class AuxiliarId {


     private int idzona;
     private String rfcempleado;

    public AuxiliarId() {
    }

    public AuxiliarId(int idzona, String rfcempleado) {
       this.idzona = idzona;
       this.rfcempleado = rfcempleado;
    }
   
    public int getIdzona() {
        return this.idzona;
    }
    
    public void setIdzona(int idzona) {
        this.idzona = idzona;
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
		 if ( !(other instanceof AuxiliarId) ) return false;
		 AuxiliarId castOther = ( AuxiliarId ) other; 
         
		 return (this.getIdzona()==castOther.getIdzona())
 && ( (this.getRfcempleado()==castOther.getRfcempleado()) || ( this.getRfcempleado()!=null && castOther.getRfcempleado()!=null && this.getRfcempleado().equals(castOther.getRfcempleado()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getIdzona();
         result = 37 * result + ( getRfcempleado() == null ? 0 : this.getRfcempleado().hashCode() );
         return result;
   }   


}


