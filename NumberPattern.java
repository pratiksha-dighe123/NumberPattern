import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String input = sc.nextLine();

        for (int i = 0; i < input.length(); i++) {
            int digit = input.charAt(i) - '0';

            for (int j = 0; j <= i; j++) {
                System.out.print(digit + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
