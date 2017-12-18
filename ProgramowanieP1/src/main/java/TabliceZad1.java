public class TabliceZad1 {
    public static void main(String[] args) {
        int[] tablica = new int[10];
        tablica = wypelnijTablice(tablica);
        Tablice.wyswietlListe(tablica);
        tablica = zwiekszWartosc(tablica);
        Tablice.wyswietlListe(tablica);
        tablica = podzielParzysta(tablica);
        Tablice.wyswietlListe(tablica);
        int suma = sumaLiczb(tablica);
        Tablice.wyswietlListe(tablica);
        System.out.println("Suma wynosi " + suma);



    }


    public static int[] wypelnijTablice(int[] tablica) {
        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = i + 1;

        }return tablica;
    }

    public static int[] zwiekszWartosc(int[] tablica) {
        for (int i = 2; i < tablica.length; i += 3)

        {
            tablica[i] = tablica[i] + tablica[i - 1];

            // System.out.println(tablica[i]);
        }
        return tablica;


    }

    public static int[] podzielParzysta(int[] tablica) {
        for (int i = 0; i < tablica.length; i++) {
            if (tablica[i] % 2 == 0) {
                tablica[i] = tablica[i] / 2;
            }

        }
        return tablica;

    }
     public static int  sumaLiczb(int [] tablica){
        int suma=0;
        for(int i=0;i<tablica.length;i++){
            suma+=tablica[i];
        }
        return suma;
     }
}





