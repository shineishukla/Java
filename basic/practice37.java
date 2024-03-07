//pyramid pattern

import java.util.Scanner;

class practice37 {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int n=scn.nextInt();
            int i=1;
            while(i<=n){
                int j=1;
                while(j<=n-i){
                    System.out.print(" ");
                    j++;
                }
                int k=1;
                while(k<=2*i-1){
                    System.out.print("*");
                    k++;
                }
                i++;
                System.out.println();
            }
        }
    }
}

