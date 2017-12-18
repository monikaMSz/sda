package cwiczenia411;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Rectangle {
    int sideA;
    int sideB;

    void readSize() {
        Scanner skaner = new Scanner(System.in);
        try {
            {
                while (sideA <= 0) {
                    System.out.println("Podaj długość pierwszego boku: ");
                    sideA = skaner.nextInt();
                }
                while (sideB <= 0) {
                    System.out.println("Podaj długosć drugiego boku: ");
                    sideB = skaner.nextInt();
                }

            }
        } catch (InputMismatchException e) {
            System.out.println("wrong input");
        }
    }

    void readSize(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    void printRectangle(String znak) {
        for (int i = 0; i < sideA; i++) {
            for (int j = 0; j < sideB; j++) {
                System.out.print(znak);
            }
            System.out.println();
        }

    }

    void printRectangle() {
        printRectangle("*");
    }

    void printFrame(String znak) {
        for (int i = 0; i < sideA; i++) {
            for (int j = 0; j < sideB; j++) {
                if (i == 0 || i == sideA - 1) {
                    System.out.print(znak);
                } else if (j == 0 || j == sideB - 1) {
                    System.out.print(znak);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    void printFrame() {
        printFrame("*");
    }

    int area(int a, int b ){
       return a*b;
    }
    void  area(){
        System.out.println(sideA*sideB);
    }
}

