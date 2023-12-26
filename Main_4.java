import java.util.Scanner;

interface Student {
    void Mark();
}

class StudGrade implements Student {
    private double[] marks = new double[5];

    public void Mark() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            try {
                System.out.print("Please Enter Your Mark " + (i + 1) + ": ");
                marks[i] = scanner.nextDouble();
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                i--; // Decrement i to re-enter the current mark
                scanner.nextLine(); // Consume the invalid input
            }
        }
        scanner.close();
    }

    public double CalculateAverage() {
        double sum = 0;
        for (double mark : marks) {
            sum += mark;
        }
        return sum / marks.length;
    }
}

public class Main_4 {
    public static void main(String[] args) {
        StudGrade grade = new StudGrade();
        try {
            grade.Mark();
            double average = grade.CalculateAverage();
            System.out.println("The average mark is: " + average);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        } finally {
            System.out.println("Program executed.");
        }
    }
}
