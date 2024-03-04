//table of a number

import java.util.Scanner;

class practice31 {

    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int n = scn.nextInt();
            int i=1;
            while (i<11) {
                System.out.println(i*n);
                i=i+1;
            }
        } 
    }
}
