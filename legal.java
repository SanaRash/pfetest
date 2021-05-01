package legal;


public class legal {
   
    private String name ;
  
    private String type;
  
    private String link;
    
    public legal(String name, String type, String link) {
        this.name = name;
        this.type = type;
        this.link = link;
    }

    public String getName() {
        return name;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
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
    

    //private businessPerspective ;
    
   
   
     /**
    public businessPerspective getinvalid() {
        return this.;
    }
    
    public businessPerspective setinvalid(businessPerspective ) {
        this. = ;
    }
    */
}
