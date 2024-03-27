import java.util.Scanner;
public class OddSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();
        int odd = 1;
        for (int i = 1; i <= number; i+=2) {
            odd += i;
        }
        System.out.println("Factorial with odds " + number + " is: " + odd);
        scanner.close();
    }
}