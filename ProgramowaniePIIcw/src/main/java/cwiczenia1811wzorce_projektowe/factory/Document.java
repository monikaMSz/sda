package cwiczenia1811wzorce_projektowe.factory;
import cwiczenia1811wzorce_projektowe.factory.DocumentGenerator.DocumentType;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Document {
    private String textToSave;
    private DocumentType type;

    public Document(String textToSave, DocumentType type) {
        this.textToSave = textToSave;
        this.type = type;
    }

    public void setTextToSave(String textToSave) {
        this.textToSave = textToSave;
    }

    public String getTextToSave() {
        return textToSave;
    }
    public void saveFile(String fileName){
        String path ="C:/Users/RENT/Desktop";

        String outputPath = String.format("%s/%s.%s", path,fileName,type.getExtension());

        System.out.println("Plik zostanie zapisane w: "+outputPath);
        System.out.println("Tekst do zapisania: "+ textToSave);

        try {
            File file = new File(outputPath);
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(textToSave);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
