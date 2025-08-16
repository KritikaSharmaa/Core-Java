public class Calculator {
    public static void main(String[] args) {
        Aithmetics a1 = new Aithmetics();
        System.out.println("Result: " + a1.SquareNum(6));
    }
}

abstract class Operations {
    abstract int SquareNum(int num1);
}

class Aithmetics extends Operations {
    @Override
    int SquareNum(int num1) {
        return num1 * num1;
    }
}