package cwiczenia1811wzorce_projektowe.strategy;

public class Calculator {
    private Strategy strategy;


    public Calculator(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int numberOne, int numberTwo) throws Exception {
        int result = strategy.doOperation(numberOne, numberTwo);
        return result;
    }
}
