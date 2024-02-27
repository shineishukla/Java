//given a number, check whether even or odd
package basic;

import java.util.Scanner;
class evenOdd{
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            System.out.println(("Enter a num: "));
            int n= scn.nextInt();
            if(n%2==0){
                System.out.println("Even");
            }
            else{
                System.out.println("Odd");
            }
        }
    }
}