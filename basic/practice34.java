//print a * pattern triangle 

import java.util.Scanner;

class practice34 {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int n=scn.nextInt();
            int i=1;
            while(i<=n){
                int j=1;
                while(j<=i){
                    System.out.print("*");
                    j++;
                }
            i++;    
            System.out.println();        
            }
        }
    }
}
