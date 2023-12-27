import java.util.Scanner;

public class Lbq2v2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("***** INTEL CORP *****");
        System.out.print("Please enter your pointer: ");
		

        try {
            double pointer = scanner.nextDouble();
            if (pointer >= 3.00) {
                System.out.println("You can apply for Industrial Training in our website");
            } else {
                System.out.println("Sorry. You are not matching the requirement.");
            }
        } catch (Exception e) {
            System.out.println("ERROR. Please enter pointer in numeric value!!!");
        }

        scanner.close();
    }
}
