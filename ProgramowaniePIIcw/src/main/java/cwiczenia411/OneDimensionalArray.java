package cwiczenia411;


import java.util.*;

public class OneDimensionalArray {
    Scanner skaner = new Scanner(System.in);

    public OneDimensionalArray() {

    }

    List<Integer> array = new ArrayList<>();
    static Integer[] examples = new Integer[]{1, 4, 7, 109, 28, 277, 11};

//    void show() {
//        for (int i = 0; i < listSize; i++) {
//            System.out.print(array(i));
//        }
//        System.out.println();
//    }

    void fillArray() {

        System.out.println("Podaj liczby");

        // for(int i=0;i<array.size();i++){
        int number = skaner.nextInt();
        while (number > 0) {

            array.add(number);
            number = skaner.nextInt();
        }
        if (number <= 0) {
            skaner.close();
            System.out.println("Podałeś cyfrę mniejszą lu równą zero");
        }
    }

    void show() {
        for (Integer elem : array
                ) {

        }
        System.out.println(array);

    }

//    void addToArray() {

    //for (int i = 0; i < array.size(); i++) {
//        if (array.isEmpty()) {
//            array.add(Arrays.asList(new Integer(1),
//                    new Integer(4),
//                    new Integer(7),
//                    new Integer(109),
//                    new Integer(28),
//                    new Integer(277),
//                    new Integer(11))
//            );
//        }
//
//        System.out.println(array);
//    }
    void minMax() {
        int min = array.get(0);
        int max = array.get(0);
        for(int i=0;i<array.size();i++){
            int liczba=array.get(i);
            if(min>liczba){
                min=liczba;
            }else if(max<liczba){
                max=liczba;
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
    void average(){
        double sum=0;

        for(int i=0;i<array.size();i++){
            sum+=array.get(i);
        }
        System.out.printf("%.2f",sum/array.size());
    }
    void stosunekSredniej(){
        double sum1=0;
        double av1=0;
        double sum2=0;
        double av2=0;
        for(int i=0;i<array.size();i+=2){
            sum1=array.get(i);
            av1=sum1/array.size();
        }
        for(int i=0;i<array.size();i+=3){
            sum2=array.get(i);
            av2=sum2/array.size();
        }
        System.out.println("stosunek 2 do 3 "+ av1/av2);
    }

}



