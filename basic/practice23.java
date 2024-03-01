import java.util.Scanner;

//calculator
class calc{

    public static void main(String[] args)  {
        try (Scanner scn = new Scanner(System.in)) {
            System.out.print("SELECT THE OPERATION:\n" +
                                "1. Addition\n" +
                                "2. Subtraction\n" +
                                "3. Multiplication \n");

            int operation=scn.nextInt();

            if(operation!=1 && operation!=2 && operation!=3){
                System.out.print("Invalid input");
            }else{
                System.out.print("Enter first num: ");
                int a=scn.nextInt();
                System.out.print("Enter second num: ");
                int b=scn.nextInt();

                if(operation==1){
                    System.out.print(a+b);
                }else if(operation==2){
                    System.out.print(a-b);
                }else if(operation==3){
                    System.out.print(a*b);
                }
            }
        }
    }
}
