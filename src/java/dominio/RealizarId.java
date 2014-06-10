package dominio;

/**
 * RealizarId
 */
public class RealizarId  implements java.io.Serializable {


     private String curppersona;
     private int idreser;

    public RealizarId() {
    }

    public RealizarId(String curppersona, int idreser) {
       this.curppersona = curppersona;
       this.idreser = idreser;
    }
   
    public String getCurppersona() {
        return this.curppersona;
    }
    
    public void setCurppersona(String curppersona) {
        this.curppersona = curppersona;
    }
    public int getIdreser() {
        return this.idreser;
    }
    
    public void setIdreser(int idreser) {
        this.idreser = idreser;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof RealizarId) ) return false;
		 RealizarId castOther = ( RealizarId ) other; 
         
		 return ( (this.getCurppersona()==castOther.getCurppersona()) || ( this.getCurppersona()!=null && castOther.getCurppersona()!=null && this.getCurppersona().equals(castOther.getCurppersona()) ) )
 && (this.getIdreser()==castOther.getIdreser());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getCurppersona() == null ? 0 : this.getCurppersona().hashCode() );
         result = 37 * result + this.getIdreser();
         return result;
   }   


}


