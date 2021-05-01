package businessPerspective;

import legal.legal;
import operationalPerpective.operationalPerpective;
import participants.participants;
import qosCharacteristics.qosCharacteristics;
import scCharacteristics.scCharacteristics;
import udlSc.udlSc;

public class businessPerspective
 {
    
     private legal legal ;

    private qosCharacteristics qosCharacteristics ;
    
    
    private scCharacteristics scCharacteristics ;
    

    private participants participants ;

    private udlSc udlSc ;
   
   
    
    
    public businessPerspective(legal.legal legal, qosCharacteristics.qosCharacteristics qosCharacteristics,
            scCharacteristics.scCharacteristics scCharacteristics, participants.participants participants,
            udlSc.udlSc udlSc, operationalPerpective.operationalPerpective operationalPerpective) {
        this.setLegal(legal);
        this.setQosCharacteristics(qosCharacteristics);
        this.setScCharacteristics(scCharacteristics);
        this.setParticipants(participants);
        this.setUdlSc(udlSc);
        
    }




    public udlSc getUdlSc() {
        return udlSc;
    }


    public void setUdlSc(udlSc udlSc) {
        this.udlSc = udlSc;
    }


    public participants getParticipants() {
        return participants;
    }


    public void setParticipants(participants participants) {
        this.participants = participants;
    }


    public scCharacteristics getScCharacteristics() {
        return scCharacteristics;
    }


    public void setScCharacteristics(scCharacteristics scCharacteristics) {
        this.scCharacteristics = scCharacteristics;
    }


    public qosCharacteristics getQosCharacteristics() {
        return qosCharacteristics;
    }


    public void setQosCharacteristics(qosCharacteristics qosCharacteristics) {
        this.qosCharacteristics = qosCharacteristics;
    }


    public legal getLegal() {
        return legal;
    }


    public void setLegal(legal legal) {
        this.legal = legal;
    }
    
   
    
}
