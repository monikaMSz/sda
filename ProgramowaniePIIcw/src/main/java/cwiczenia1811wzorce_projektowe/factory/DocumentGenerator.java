package cwiczenia1811wzorce_projektowe.factory;

import static cwiczenia1811wzorce_projektowe.factory.DocumentGenerator.DocumentType.HTML;
import static cwiczenia1811wzorce_projektowe.factory.DocumentGenerator.DocumentType.TXT;
import static cwiczenia1811wzorce_projektowe.factory.DocumentGenerator.DocumentType.XML;

public class DocumentGenerator {

    public Document createDocument(String textToSave, DocumentType type) {
        Document document;

        switch (type) {
            case TXT:
                document = new TxtDocument(textToSave, TXT);
                break;
            case HTML:
                document = new HtmlDocument(textToSave, HTML);
                break;
            case XML:
                document = new XmlDocument(textToSave, XML);
                break;
            default:
                document = null;
                break;
        }return document;
    }

    public enum DocumentType {
        TXT("txt"), HTML("html"), XML("xml");

        private String extension;

        DocumentType(String extension) {
            this.extension = extension;
        }

        public String getExtension() {
            return extension;
        }
    }

}
