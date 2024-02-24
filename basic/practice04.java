package basic;

import java.util.Scanner;

class inputScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s= sc.next();
        System.out.println("You entered a string: "+s);
        int x=sc.nextInt();
        System.out.println("You entered a integer: "+x);
        float f= sc.nextFloat();
        System.out.println("You entered a float value: "+f);
        sc.close();
    }
}
