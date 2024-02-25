//System.out.format() or System.out.printf()
package basic;

import java.io.*;
import java.lang.Math;


class practice06 {
    public static void main(String[] args) throws IOException {
        int p = 100, q = 200;
        System.out.format("Value of p is %d\n", p);
        float r = (float) Math.PI;

        System.out.println(q);

        System.out.format("Value of PI = %.2f\n", r);
        System.out.format("Value of PI = %5.2f\n", r);
        System.out.format("Value of PI = %05.2f\n", r);
        System.out.printf("p = %d, q = %d", p, q);
    }
}

