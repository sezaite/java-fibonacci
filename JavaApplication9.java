package javaapplication9;

public class JavaApplication9 {

    public static void main(String[] args) {
        fib(1, 1, 55);
    }

    public static void fib(long sk1, long sk2, long max) {
        if (sk1 + sk2 >= max) {
            System.out.println(max);
        } else {
            System.out.println(sk1 + sk2);
            fib(sk2, sk1 + sk2, max);
        }
    }
}
