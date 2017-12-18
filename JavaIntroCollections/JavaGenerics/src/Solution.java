import java.lang.reflect.Method;

class Printer{

    //tutaj napisz kod tak, aby projekt si� skompilowa� i uruchomi� poprawnie
	//nale�y utworzy� tylko jedn� metod�
 public void printArray (Object[]objects){
       for(Object x : objects)
     System.out.println(x);
 }
 //public void printArray (String [] strings){
  //   for(String y : strings)
   //      System.out.println(y);
 //}
}

public class Solution {

    public static void main( String args[] ) {
        Printer myPrinter = new Printer();
        Integer[] intArray = { 1, 2, 3 };//tablica Integer
        String[] stringArray = {"Hello", "World"};//tablica String object łaczy Integer i String bo jedna metoa jest potrzebna
        //bo tak to trzebaby było zrobic dwie metody dla Integera i Stringa a tak to robimy jedna dla Object
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;

        for (Method method : Printer.class.getDeclaredMethods()) {//pobierane wszytskie metody z klasy printer i ich nazwy
            // i sprawdza czy jest rowna printarray i zwieksza jej liczbe
            String name = method.getName();

            if(name.equals("printArray"))
                count++;
        }

        if(count > 1)System.out.println("Tworzenie dw�ch metod printArray nie jest dozwolone");
      
    }
}