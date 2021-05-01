package events;

import operationalPerpective.operationalPerpective;

public class events {
    
    private String name;
   
    private String description;
    
    private String type;
    private operationalPerpective operationalPerpective;

    

    public events(String name, String description, String type,
            operationalPerpective.operationalPerpective operationalPerpective) {
        this.name = name;
        this.description = description;
        this.type = type;
        this.setOperationalPerpective(operationalPerpective);
    }

    public operationalPerpective getOperationalPerpective() {
        return operationalPerpective;
    }

    public void setOperationalPerpective(operationalPerpective operationalPerpective) {
        this.operationalPerpective = operationalPerpective;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
