package cwiczenia1811wzorce_projektowe.strategy;

public class OperationMultiply implements Strategy {
    @Override
    public int doOperation(int numberOne, int numberTwo) {
        return numberOne*numberTwo;
    }
}
