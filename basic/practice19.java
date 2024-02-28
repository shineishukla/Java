//switch statement

package basic;
import java.util.Scanner;

class practiice{
    y--; break;
    public static void main(String[] args) {
        int x = 0, y = 0;
        System.out.println("Enter a move: ");
        Scanner scn = new Scanner(System.in);
        char move = scn.next().charAt(0);
        switch(move){
            case 'L': x--; 
            break;
            case 'R': x++; 
            break;
            case 'U':y++; 
            break;
            case 'D': 
            default: 
            System.out.println("Invalid");
            }
            System.out.println(x+" "+y);
        }
}
