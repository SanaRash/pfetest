package participants;



public class participants {
    
    private String Provider;
  
    private String futureUserType;

    public participants(String provider, String futureUserType) {
        Provider = provider;
        this.futureUserType = futureUserType;
    }
    
    public String getProvider() {
        return Provider;
    }

    public String getFutureUserType() {
        return futureUserType;
    }

    public void setFutureUserType(String futureUserType) {
        this.futureUserType = futureUserType;
    }

    public void setProvider(String provider) {
        this.Provider = provider;
    }
    
   
    
}
