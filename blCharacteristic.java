package blCharacteristic;

public class blCharacteristic {
    
  
    private String name;
   
    private String type;
    
    private String currency;

    private String consensus;

    public blCharacteristic(String name, String type, String currency, String consensus) {
        this.name = name;
        this.type = type;
        this.currency = currency;
        this.consensus = consensus;
    }
    
    public String getName() {
        return name;
    }

    public String getConsensus() {
        return consensus;
    }

    public void setConsensus(String consensus) {
        this.consensus = consensus;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }
    
  
    // private technicalPerspective ;
    

    
    
    // public technicalPerspective getinvalid() {
        // return this.;
    // }
    
  
    // public technicalPerspective setinvalid(technicalPerspective ) {
        // this. = ;
    // }
    
}
