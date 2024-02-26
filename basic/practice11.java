package basic;

import java.util.Scanner;

class practice11 {
    //sum of n natural numbers    
    //n*(n+1)/2
    
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int n= scn.nextInt();
            int sum= n*(n+1)/2;
            System.out.println(sum); //output 5050
        }
    }
}
