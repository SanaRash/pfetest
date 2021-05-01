package pricing;

public class pricing {
   
    private String gaslimit;
   
    private Real tokenprice;
    
    // private qosCharacteristics ;
   
    public pricing(String gaslimit, Real tokenprice) {
        this.gaslimit = gaslimit;
        this.tokenprice = tokenprice;
    }
    public String getGaslimit() {
        return this.gaslimit;
    }
    
    public String setGaslimit(String gaslimit) {
        this.gaslimit = gaslimit;
    }
    
    public Real getTokenprice() {
        return this.tokenprice;
    }
    
    public Real setTokenprice(Real tokenprice) {
        this.tokenprice = tokenprice;
    }
    
    /** 
    public qosCharacteristics getinvalid() {
        return this.;
    }
   
    public qosCharacteristics setinvalid(qosCharacteristics ) {
        this. = ;
    }
    */
}
