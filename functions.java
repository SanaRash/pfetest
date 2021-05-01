package functions;

import operationalPerpective.operationalPerpective;

public class functions {
    
    private String name;
   
    private String description;
    
    private String scope;
    
    private String type;

    private operationalPerpective operationalPerpective;
    
   

    public functions(String name, String description, String scope, String type,
            operationalPerpective.operationalPerpective operationalPerpective) {
        this.name = name;
        this.description = description;
        this.scope = scope;
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

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
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
