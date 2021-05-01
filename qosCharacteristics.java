package qosCharacteristics;

import pricing.pricing;
import security.security;
import serviceLevel.serviceLevel;

public class qosCharacteristics {
    
    private pricing pricing;
    
    private security security;
    private serviceLevel serviceLevel;

    public qosCharacteristics(pricing.pricing pricing, security.security security,
            serviceLevel.serviceLevel serviceLevel) {
        this.setPricing(pricing);
        this.setSecurity(security);
        this.setServiceLevel(serviceLevel);
    }

    public serviceLevel getServiceLevel() {
        return serviceLevel;
    }

    public void setServiceLevel(serviceLevel serviceLevel) {
        this.serviceLevel = serviceLevel;
    }

    public security getSecurity() {
        return security;
    }

    public void setSecurity(security security) {
        this.security = security;
    }

    public pricing getPricing() {
        return pricing;
    }

    public void setPricing(pricing pricing) {
        this.pricing = pricing;
    }

    
    
  
    
}
