package udlSc;

import technicalPerspective.technicalPerspective;

public class udlSc {
   
    private String name;
   
    private String creationDate;
   
    private String udl_SC_Version;

    private technicalPerspective technicalPerspective;


     
   

    public udlSc(String name, String creationDate, String udl_SC_Version,
            technicalPerspective.technicalPerspective technicalPerspective) {
        this.name = name;
        this.creationDate = creationDate;
        this.udl_SC_Version = udl_SC_Version;
        this.setTechnicalPerspective(technicalPerspective);
    }
    

    public technicalPerspective getTechnicalPerspective() {
        return technicalPerspective;
    }


    public void setTechnicalPerspective(technicalPerspective technicalPerspective) {
        this.technicalPerspective = technicalPerspective;
    }


    public String getName() {
        return name;
    }

    public String getUdl_SC_Version() {
        return udl_SC_Version;
    }

    public void setUdl_SC_Version(String udl_SC_Version) {
        this.udl_SC_Version = udl_SC_Version;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
    
}
