package output;

public class output {
   
    private String name;
   
    private String type;
    
    private Boolean is_created;

    
    public output(String name, String type, Boolean is_created) {
        this.name = name;
        this.type = type;
        this.is_created = is_created;
    }

    public String getName() {
        return name;
    }

    public Boolean getIs_created() {
        return is_created;
    }

    public void setIs_created(Boolean is_created) {
        this.is_created = is_created;
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
    
    
    
}
