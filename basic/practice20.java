import java.util.Scanner;
//even odd numbers
class practice20 {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int n = scn.nextInt();

            if (n % 2 == 0) {
                System.out.print("Opponent");
            } else {
                System.out.print("You");
            }
        }
    }
}
