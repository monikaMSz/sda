package cwiczenia1811wzorce_projektowe.factory;
import cwiczenia1811wzorce_projektowe.factory.DocumentGenerator.DocumentType;

public class HtmlDocument extends Document {
    public HtmlDocument(String textToSave, DocumentType type) {
        super(formatText(textToSave),type);
    }
    private static String formatText(String textToSave){
        return String.format("<h1>%s</h1>", textToSave.replaceAll("\r\n", "<br>"));
    }
}
