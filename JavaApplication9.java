/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

/**
 *
 * @author pavet
 */
public class JavaApplication9 {

    /**
     * @param args the command line arguments
     */
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
