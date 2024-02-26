package basic;
//geometric progression

import java.util.Scanner;
import java.lang.Math;

class practice15 {
    public static int Nth_term (int a, int b, int C){
        int ans= a*(int)(Math.pow(b,C-1));
        return ans;
    }
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int a= scn.nextInt();
        int b= scn.nextInt();
        int c= scn.nextInt();
        System.out.println(Nth_term(a,b,c));

    }

}
