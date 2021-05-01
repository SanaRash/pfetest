package technicalPerspective;

import blCharacteristic.blCharacteristic;
import protocolInformation.protocolInformation;

public class technicalPerspective {
    
    private protocolInformation protocolInformation;
   
    private blCharacteristic blCharacteristic;

    public technicalPerspective(protocolInformation.protocolInformation protocolInformation,
    blCharacteristic.blCharacteristic blCharacteristic) {
this.setProtocolInformation(protocolInformation);
this.setBlCharacteristic(blCharacteristic);
}

    public blCharacteristic getBlCharacteristic() {
        return blCharacteristic;
    }

    public void setBlCharacteristic(blCharacteristic blCharacteristic) {
        this.blCharacteristic = blCharacteristic;
    }

    public protocolInformation getProtocolInformation() {
        return protocolInformation;
    }

    public void setProtocolInformation(protocolInformation protocolInformation) {
        this.protocolInformation = protocolInformation;
    }
}
