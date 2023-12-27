import java.util.Scanner;
import java.text.DecimalFormat;

public class Lbtskq1v1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#.00");

        System.out.println("-------- Account 1 --------");
        System.out.print("Enter your name: ");
        String name1 = scanner.nextLine();
        System.out.print("Enter your ID: ");
        int id1 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter your amount: ");
        double amount1 = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character

        System.out.println("Your name is: " + name1);
        System.out.println("Your ID is: " + id1);
        System.out.println("Your amount is: RM" + decimalFormat.format(amount1));

        System.out.println("-------- Account 2 --------");
        System.out.print("Enter your name: ");
        String name2 = scanner.nextLine();
        System.out.print("Enter your ID: ");
        int id2 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter your amount: ");
        double amount2 = scanner.nextDouble();

        System.out.println("Your name is: " + name2);
        System.out.println("Your ID is: " + id2);
        System.out.println("Your amount is: RM" + decimalFormat.format(amount2));
    }
}
