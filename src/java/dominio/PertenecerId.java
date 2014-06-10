package dominio;

/**
 * PertenecerId
 */
public class PertenecerId {

     private int codesc;
     private String curppersona;

    public PertenecerId() {
    }

    public PertenecerId(int codesc, String curppersona) {
       this.codesc = codesc;
       this.curppersona = curppersona;
    }
   
    public int getCodesc() {
        return this.codesc;
    }
    
    public void setCodesc(int codesc) {
        this.codesc = codesc;
    }
    public String getCurppersona() {
        return this.curppersona;
    }
    
    public void setCurppersona(String curppersona) {
        this.curppersona = curppersona;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof PertenecerId) ) return false;
		 PertenecerId castOther = ( PertenecerId ) other; 
         
		 return (this.getCodesc()==castOther.getCodesc())
 && ( (this.getCurppersona()==castOther.getCurppersona()) || ( this.getCurppersona()!=null && castOther.getCurppersona()!=null && this.getCurppersona().equals(castOther.getCurppersona()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getCodesc();
         result = 37 * result + ( getCurppersona() == null ? 0 : this.getCurppersona().hashCode() );
         return result;
   }   


}


