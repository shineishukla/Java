package basic;

import java.util.Scanner;

public class practice13 {
    public static void main(String[] args) {
        try (//day before n days
        Scanner scn = new Scanner(System.in)) {
            int d= scn.nextInt();
            int n= scn.nextInt();
            int x= n%7;
            int ans=d-x;
            if(ans>0){
                System.out.println(ans);
            }
            else{
                System.out.println(ans+7);
            }
        }
        }
}
