package EED;

public class Matematicas {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(Object a, Object b) {
        if (!(a instanceof Integer) || !(b instanceof Integer)) {
            throw new IllegalArgumentException("Los argumentos deben ser enteros.");
        }
        return (Integer) a - (Integer) b;
    }
        
    public static int multiply(int a, int b) {
        return a * b;
    }
    public static int divide(int a, int b) {
        return b != 0 ? a / b : 0;
    }
    public static int modulo(int a, int b) {
        return a % b;
    }
    public static int power(int a, int b) {
        return (int) Math.pow(a, b);
    }
    public static int factorial(int a) {
        if (a == 0) {
            return 1;
        }
        return a * factorial(a - 1);
    }
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
    public static int isPrime(int a) {
        if (a <= 1) {
            return 0;
        }
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        System.out.println(add(5, 3));
        System.out.println(subtract(5, 3));
        System.out.println(multiply(5, 3));
        System.out.println(divide(5, 3));
        System.out.println(modulo(5, 3));
        System.out.println(power(5, 3));
        System.out.println(factorial(5));
        System.out.println(gcd(5, 3));
        System.out.println(lcm(5, 3));
        System.out.println(isPrime(5));
    }

}
