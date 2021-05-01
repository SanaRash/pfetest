package commonCharacteristic;


public class commonCharacteristic {
    
    private String type;
    
    private String category;
    
    private String updateDate;
    
    private String creationDate;
    
    private String state;
    
    private String version;
    
    private String initialBalance;
    
    private String lifeCycle;


    public commonCharacteristic(String type, String category, String updateDate, String creationDate, String state,
            String version, String initialBalance, String lifeCycle) {
        this.type = type;
        this.category = category;
        this.updateDate = updateDate;
        this.creationDate = creationDate;
        this.state = state;
        this.version = version;
        this.initialBalance = initialBalance;
        this.lifeCycle = lifeCycle;
    }

    public String getType() {
        return type;
    }

    public String getLifeCycle() {
        return lifeCycle;
    }

    public void setLifeCycle(String lifeCycle) {
        this.lifeCycle = lifeCycle;
    }

    public String getInitialBalance() {
        return initialBalance;
    }

    public void setInitialBalance(String initialBalance) {
        this.initialBalance = initialBalance;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getcreationDate() {
        return creationDate;
    }

    public void setcreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    
}
