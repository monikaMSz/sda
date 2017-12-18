package pl.sda.java4.primes;

import java.util.function.IntConsumer;

public class Main {

    private final Sieve sieve;//jezeli finalk to musi byc zainicjpowane w konstruktorze,
    // ani zmienic tego na co wskazuje ta zmienna ta zmienna zawsze bedzie wskazywac na ta konkrtena instancje sita
    private final IntConsumer success;//consumer jest interfejsem
    private final IntConsumer failure;

    public static void main(String[] args) {
       new Main(new Sieve(), /*new IntConsumer() {
           @Override
           public void accept(int inputNumber) {
               System.out.println("prime");
               to samo z not prime
           }
       }*/
               inputNumber -> {
                   System.out.println(inputNumber + " is prime");
               },
               inputNumber -> {
                   System.out.println(inputNumber + "is NOT prime");
               }).run();
   }

    public Main(Sieve sieve, IntConsumer success, IntConsumer failure) {
        this.sieve = sieve;
        this.success = success;
        this.failure = failure;
    }

    void run()/*throws AppError*/ {//kod wykonujący operację/zależnosć,nie ma w sobie slowa new.wszystko co bedzie mialo new bedzie w
        // konstruktorze.podzial zależności.wszytskie new jak najwyżej.
        int input = 7;
        boolean isPrime;
        try {

            isPrime = sieve.isPrime(input);
        }
        catch(IllegalArgumentException e){
            throw new AppError(e);
        }

        if (isPrime) {
            success.accept(input);
        } else {
            failure.accept(input);
        }
    }
}
