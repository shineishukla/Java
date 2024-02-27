package basic;

import java.util.Scanner;

//sum of first n natural numbers. if user enters a negative number, print invalid and exit. 

class practice17 {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            System.out.println("Enter a num: ");
            int n= scn.nextInt();
            if(n<0){
                System.out.println("Invalid input");
                return;
            }
            System.out.println(n*(n+1)/2);
        }
    }
}
