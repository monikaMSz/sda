package pl.sda.java4.primes;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MainTest {
   // private Main sut;
    private Sieve mock;

    @Before
    public void setUp() throws Exception {

        mock = mock(Sieve.class);//odniesienie do klasy Sieve (mock potrzebuje klasy w argumencie)

    }

    @Test
    public void runSuccessfulAction() {
        final boolean[] methodWasRun = {false};

        Main sut = new Main(mock,
                x -> {
            methodWasRun[0] = true;//jednoelementowa tablica zainicjowana false nie mozemy przypisac innej tablicy do methodwasrun ale mozemy zmodyfikowac jej zawartosc
            }, x-> { Assert.fail("Failure action calles");
                        });
        when(mock.isPrime(anyInt())).thenReturn(true);
        sut.run();

        Assert.assertTrue(methodWasRun[0]);

    }

    @Test
    public void runFailureAction() {
        final boolean[] methodWasRun = {false};

        Main sut = new Main(mock,
                x -> {Assert.fail("Failure action calles");

                    }, x-> {  methodWasRun[0] = true;
        });

        when(mock.isPrime(anyInt())).thenReturn(false);
        sut.run();

        Assert.assertTrue(methodWasRun[0]);

    }


    @Test(expected = AppError.class)
    public void /*run()*/ repackageExceptions() throws Exception {
        Main sut = new Main(mock, null, null);//w metofdzie run jezlei cos pojdzie nie tak niewazne co to wyskoczy wyjatek apperrpr
        when(mock.isPrime(anyInt())).thenThrow(new IllegalArgumentException());//kiedy ta metoda bedzie wywolana wyrzucaj blad
        sut.run();

    }

}