import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SolutionJavaArrayList {
    /*
    5 - pierwsza warto�� wczytana z konsoli - oznacza ile element�w b�dzie mie� tablica pocz�tkowa
	12 0 1 78 12 - elementy tablicy (wczytane z konsoli)
	2 - ile operacji chcesz wykona� (wczytane z konsoli)
	Insert - nazwa pierwszej operacji (wczytane z konsoli)
	5 23 - indeks, do kt�rego ma zosta� przypisana warto�� (wczytane z konsoli)
	Delete - nazwa drugiej operacji (wczytane z konsoli)
	0 - indeks elementy do usuni�cia
     */

    /*
     Kroki do wykonania:
     1) zapytaj u�ytkownika ile element�w b�dzie mie� tablica pocz�tkowa
     2) popro� u�ytkownika o wpisanie element�w, dodaj je do tablicy
     3) zapytaj ile operacji u�ytkownik chce wykona�
     4) wczytaj nazw� operacji
     5) wczytaj liczb� b�d� liczby podane przez u�ytkownika (zale�y od wybranej operacji)
     6) kroki 4) i 5) powt�rz dla ka�dej operacji
     7) wy�wietl wynik
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<Integer> lista = new ArrayList<>();
        for (int i = 0; i < 5; i++) {

            System.out.println("Podaj liczbę o indeksie " + (i + 1));
            int liczba = s.nextInt();
            lista.add(liczba);
        }
        // System.out.println("Podaj polecenie:");
        //String polecenie = s.nextLine();
        //if("Insert".equals(polecenie)){
        //   System.out.println("Podaj liczbę:");
        //  int liczba = s.nextInt(); // 6 została wczytana tutaj i dodana do listy
        // lista.add(liczba);//lista jest obiektem, dlatego możemy metodę zastsować i dodać liczbę do listy
        System.out.println(lista);

    }
}
