
//largest of three numbers
import java.util.Scanner;

class practiice21{

    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int a=scn.nextInt();
            int b=scn.nextInt();
            int c=scn.nextInt();
            if(a>=b && a>=c){
                System.out.print(a);
            }else if(b>=a && b>=c){
                System.out.print(b);
            }else{
                System.out.print(c);
            }
        }
        }
    }
