package basic;

import java.io.IOException;
import java.util.Scanner;

//check the numer if it is even,odd, positive, negative
class practice18
{ 
    public static void main(String[] args)throws IOException 
    { 
       try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter a num: ");
           int n= sc.nextInt();
           
          if( n > 0 )
          {
              System.out.print("Positive ");
              if(n%2==0)
              System.out.print("Even\n");
            
              else
              System.out.print("Odd\n");
          }
          else if( n < 0 )
          {
              System.out.print("Negative ");
              if(n%2==0)
              System.out.print("Even\n");
              
              else
              System.out.print("Odd\n");
          }
          else
          {
              System.out.print("Zero");
          }
    }
       
    } 
} 

