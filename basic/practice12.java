package basic;

import java.util.Scanner;
import java.lang.Math;

class practice12 {
    //find last digit of number
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int n= scn.nextInt();
        int m= Math.abs(n);
        int ans=m%10;
        System.out.println(ans);
    }
}
