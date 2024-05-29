package S1_08.N2Ejercicio3;

public class Main {
    public static void main(String[] args) {
        Operation sum = (a, b) -> a + b;
        Operation subtraction = (a, b) -> a - b;
        Operation multiplication = (a, b) -> a * b;
        Operation division = (a, b) -> {
            if (b == 0) {
                throw new ArithmeticException("Division by zero");
            }
            return a / b;
        };
        float num1 = 10.0f;
        float num2 = 5.0f;

        System.out.println("Sum: " + sum.operate(num1, num2));
        System.out.println("Subtraction: " + subtraction.operate(num1, num2));
        System.out.println("Multiplication: " + multiplication.operate(num1, num2));
        System.out.println("Division: " + division.operate(num1, num2));
    }

}


