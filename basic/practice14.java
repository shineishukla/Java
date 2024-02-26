package basic;

import java.util.Scanner;

public class practice14 {
    public static int Nth_term (int a, int b, int c){
        int ans= a +(c-1)*b;
        return ans;
    }
    public static void main(String[] args) {
        try (//nth term of arithmetic progression series
        Scanner scn = new Scanner(System.in)) {
            int a =scn.nextInt();
            int b= scn.nextInt();
            int c=scn.nextInt();
            System.out.println(Nth_term(a, b, c));
        } 

    }
}
