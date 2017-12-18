package cwiczenia1811wzorce_projektowe.factory;
import cwiczenia1811wzorce_projektowe.factory.DocumentGenerator.DocumentType;

public class XmlDocument extends Document {
    public XmlDocument(String textToSave, DocumentType type) {
        super(textToSave,type);
    }
}
