package pl.sda.java4.primes;

public class AppError extends RuntimeException /*Throwable*/{//wszytskie wyjatki w javie sa pochodna throwable

    public AppError(Throwable t){
        super(t);
    }

}
