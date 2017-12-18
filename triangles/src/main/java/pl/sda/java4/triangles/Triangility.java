package pl.sda.java4.triangles;

public class Triangility {
    //zrobic implementacje
    public boolean isTriangle(int a, int b, int c) {
        return a > 0 && b > 0 && c > 0 && (long) a + b > c && (long) b + c > a && (long) a + c > b;
    }

    public boolean isNotTraingle(int a, int b, int c) {
        return a > 0 && b > 0 && c > 0 && (long) a + b < c || (long) b + c < a || (long) a + c < b;
    }

    public boolean takKiedyWszystkieBokiRowne(int a, int b, int c) {
//        for (int i = 1; i <= 3; i++) {
//            if (i == i) {
//
//            }
//        }return true;

        if (a == b && a == c) {

        }
        return true;


    }

    public boolean takKiedyJedenZDrugimRowny(int a, int b, int c) {
        if (a == b || b==c || a==c) {
        }
        return true;

    }
    public boolean nieBokRownyZero (int a, int b, int c){
        if(a==0 || b==0 || c==0){

        }
            return false;
    }
    public boolean nieBokMniejszyOdZero (int a, int b, int c) {
        return a<0 || b< 0 || c< 0;
    }
    public boolean nieWszystkieBokiZero ( int a, int b, int c) {
        return a==0 && b==0 && c==0;
    }

    public boolean nieKiedyJedenIDrugiBokRowneOstatniemu(int a, int b, int c) {

        return (long) a+b == c || (long) b+c==a || (long) a+c ==b;
    }
    public boolean nieKiedyMniejszeOdZeraIRowne (int a,int b,int c) {
        if(a<0&& b<0 && c<0 && a==b && a==c){}
        return false ;
    }
}


