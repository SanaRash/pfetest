package operationalPerpective;

import businessPerspective.businessPerspective;

public class operationalPerpective {
    
   private businessPerspective businessPerspective;

public operationalPerpective(businessPerspective.businessPerspective businessPerspective) {
    this.setBusinessPerspective(businessPerspective);
}

public businessPerspective getBusinessPerspective() {
    return businessPerspective;
}

public void setBusinessPerspective(businessPerspective businessPerspective) {
    this.businessPerspective = businessPerspective;
}
    
}
