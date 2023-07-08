public class Calculator {

    public static void main(String[] args) {
        String result = "a = %s, b = %s, %s = %s\n";
        double a = 60;
        double b = 4;
        System.out.printf(result, a, b, "sum", sum(a, b));
        System.out.printf(result, a, b, "subtract", subtract(a, b));
        System.out.printf(result, a, b, "divide", divide(a, b));
        System.out.printf(result, a, b, "multiply", multiply(a, b));
        System.out.printf(result, a, b, "reminder", reminder(a, b));
        System.out.printf(result, a, b, "power", power(a, b));


    }

    public static double sum(double a, double b) {
        return a + b;

    }

    public static double subtract(double a, double b) {

        return a - b;
    }

    public static double divide(double a, double b) {

        return a / b;
    }

    public static double multiply(double a, double b) {

        return a * b;
    }
    public static double reminder(double a, double b) {
        return a % b;
    }

    public static double power(double a, double b) {
        return Math.pow(a, b);
    }
}







