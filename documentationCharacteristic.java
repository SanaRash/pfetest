package documentationCharacteristic;

public class documentationCharacteristic {
    
    
    private String usedCompiler;
    
   

    private String usedRessources;
   
    private String deployedBytecode;
    
    private String Contractdescription;
    
    private String metadata;
    
    private String ABI;
    
    private String hash;
    

    public documentationCharacteristic(String usedCompiler, String usedRessources, String deployedBytecode,
    String contractdescription, String metadata, String aBI, String hash) 
    {
this.usedCompiler = usedCompiler;
this.usedRessources = usedRessources;
this.deployedBytecode = deployedBytecode;
Contractdescription = contractdescription;
this.metadata = metadata;
ABI = aBI;
this.hash = hash;
}

    public String getUsedCompiler() {
        return usedCompiler;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getABI() {
        return ABI;
    }

    public void setABI(String aBI) {
        this.ABI = aBI;
    }

    public String getMetadata() {
        return metadata;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    public String getContractdescription() {
        return Contractdescription;
    }

    public void setContractdescription(String contractdescription) {
        this.Contractdescription = contractdescription;
    }

    public String getDeployedBytecode() {
        return deployedBytecode;
    }

    public void setDeployedBytecode(String deployedBytecode) {
        this.deployedBytecode = deployedBytecode;
    }

    public String getUsedRessources() {
        return usedRessources;
    }

    public void setUsedRessources(String usedRessources) {
        this.usedRessources = usedRessources;
    }

    public void setUsedCompiler(String usedCompiler) {
        this.usedCompiler = usedCompiler;
    }
    
    
    
}
