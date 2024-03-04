//count digits

import java.util.Scanner;

class practice30 {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int n = scn.nextInt();
            int count=0;
            while (n>0) {
                n=n/10;
                count=count+1;
            } System.out.print(count);
        }
    }
}
