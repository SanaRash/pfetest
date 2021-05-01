package scCharacteristics;

import commonCharacteristic.commonCharacteristic;
import documentationCharacteristic.documentationCharacteristic;

public class scCharacteristics {
    
    private commonCharacteristic commonCharacteristic;
   
    private documentationCharacteristic documentationCharacteristic;
    
    public scCharacteristics(commonCharacteristic.commonCharacteristic commonCharacteristic,
    documentationCharacteristic.documentationCharacteristic documentationCharacteristic) {
this.setCommonCharacteristic(commonCharacteristic);
this.setDocumentationCharacteristic(documentationCharacteristic);
}

    public documentationCharacteristic getDocumentationCharacteristic() {
        return documentationCharacteristic;
    }

    public void setDocumentationCharacteristic(documentationCharacteristic documentationCharacteristic) {
        this.documentationCharacteristic = documentationCharacteristic;
    }

    public commonCharacteristic getCommonCharacteristic() {
        return commonCharacteristic;
    }

    public void setCommonCharacteristic(commonCharacteristic commonCharacteristic) {
        this.commonCharacteristic = commonCharacteristic;
    }
    
}
