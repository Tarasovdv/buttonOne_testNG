package hw_1;

public class Calculator {
    public static void main(String[] args) {
        System.out.println(sum(5, 5));
        System.out.println(multiply(5, 5));
        System.out.println(division(5, 5));
        System.out.println(substract(5, 5));

    }

    static int sum(int x, int y) {
        return x + y;
    }
    static int multiply(int x, int y) {
        return x * y;
    }
    static int division(int x, int y) {
        return x / y;
    }
    static int substract(int x, int y) {
        return x - y;
    }
}