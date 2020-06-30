package ua.zp.brainacad;

import ua.zp.brainacad.typesData.BinaryData;
import ua.zp.brainacad.typesData.NumericData;
import ua.zp.brainacad.typesData.XMLData;

import static ua.zp.brainacad.DocumentProcessorUtil.build;


public class Main {
    public static void main(String[] args) {
//        XMLData xmlData = new XMLData(DocumentProcessorUtil.ID_COUNTER);
//        BinaryData binaryData = new BinaryData(DocumentProcessorUtil.ID_COUNTER);
//        NumericData numericData = new NumericData(DocumentProcessorUtil.ID_COUNTER);




        build(xmlData,);
        build(binaryData,);
        build(numericData,);

        DocumentProcessorUtil.convert(xmlData);
        DocumentProcessorUtil.convert(binaryData);
        DocumentProcessorUtil.convert(numericData);

    }
}
