import java.util.Scanner;

//leap year
class practice22 {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int year = scn.nextInt();

            if (year % 4 == 0 && year % 100 != 0) {
                System.out.print("Yes");
            } else if (year % 400 == 0) {
                System.out.print("Yes");
            } else {
                System.out.print("No");
            }
        }
    }
}

