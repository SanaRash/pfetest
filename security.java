package security;

public class security {
   
    private Boolean signed;
    
    private Boolean tested;
    
    private String link;
    
    //private qosCharacteristics ;
    
    public security(Boolean signed, Boolean tested, String link) {
        this.signed = signed;
        this.tested = tested;
        this.link = link;
    }


    
    public Boolean getSigned() {
        return signed;
    }

    public Boolean getTested() {
        return tested;
    }

    public void setTested(Boolean tested) {
        this.tested = tested;
    }

    public void setSigned(Boolean signed) {
        this.signed = signed;
    }

    
    
    public String getLink() {
        return this.link;
    }
     /**
    public String setLink(String link) {
        this.link = link;
    }
    
    public qosCharacteristics getinvalid() {
        return this.;
    }
    
    public qosCharacteristics setinvalid(qosCharacteristics ) {
        this. = ;
    }
    */
}
