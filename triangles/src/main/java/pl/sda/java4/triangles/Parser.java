package pl.sda.java4.triangles;

public class Parser {
    //"   3    4         \t\t               5"
    public int[] parseTriple(String s) {
        if (s == null) {
            throw new IllegalArgumentException("Don't give me nulls");
        }
        String clear = s
                .replaceAll("\\s+", " ")
                //" 3 4 5"zamienia s+ciagi znaków we wszytskie białe s pojedyncza bialy znak s+ jeden lub wiecej
                .trim();//usuwa biale znaki
        String[] tokens = clear.split(" ");//"new String[]{3, 4, 5}


        if (tokens.length != 3) {
            throw new IllegalArgumentException("Must have 3 numbers");

        }


        int[]tablica = new int[3];
        for(int i=0;i<tablica.length;i++){
            tablica[i]=Integer.parseInt(tokens[i]);

            }


        return tablica;
    }




}