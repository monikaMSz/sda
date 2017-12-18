package cwiczenia1811wzorce_projektowe.strategy;

public class OperationDivide implements Strategy {
    @Override
    public int doOperation(int numberOne, int numberTwo) throws Exception {
        if (numberTwo == 0) {
            throw new Exception("Wrong value");
        }

        return numberOne / numberTwo;
    }
}
