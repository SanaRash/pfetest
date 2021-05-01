package serviceLevel ;


public class serviceLevel  {
 
    private String lanecy;
    
    private String gasConsommation;
    
    private String contractGasPrice;
    
    // private qosCharacteristics ;
    public serviceLevel(String lanecy, String gasConsommation, String contractGasPrice) {
        this.lanecy = lanecy;
        this.gasConsommation = gasConsommation;
        this.contractGasPrice = contractGasPrice;
    }
    public String getLanecy() {
        return this.lanecy;
    }
    

    public String setLanecy(String lanecy) {
        this.lanecy = lanecy;
    }
   
    public String getGasConsommation() {
        return this.gasConsommation;
    }
  
    public String setGasConsommation(String gasConsommation) {
        this.gasConsommation = gasConsommation;
    }
    

    public String getContractGasPrice() {
        return this.contractGasPrice;
    }
    
    public String setContractGasPrice(String contractGasPrice) {
        this.contractGasPrice = contractGasPrice;
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
