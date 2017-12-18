package cwiczenia1811wzorce_projektowe.factory;
import cwiczenia1811wzorce_projektowe.factory.DocumentGenerator.DocumentType;


public class TxtDocument extends Document {
    TxtDocument(String textToSave, DocumentType type) {
        super(textToSave,type);
    }
}
