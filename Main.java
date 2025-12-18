abstract class Calculator {
    abstract void add();
    abstract void sub();
    abstract void mul();
    abstract void div();
}

class MyCalculator extends Calculator {

    int number1 = 20;
    int number2 = 30;

    void add() {
        System.out.println("The sum is: " + (number1 + number2));
    }

    void sub() {
        System.out.println("The difference is: " + (number1 - number2));
    }

    void mul() {
        System.out.println("The product is: " + (number1 * number2));
    }

    void div() {
        System.out.println("The quotient is: " + (number1 / number2));
    }
}

public class Main {
    public static void main(String[] args) {
        MyCalculator mc = new MyCalculator();

        mc.add();
        mc.sub();
        mc.mul();
        mc.div();
    }
}
