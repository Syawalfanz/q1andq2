public class ExceptionHandlingExample {

    public static void main(String[] args) {

        // Case 1: Number is not valid.
        String strNumber1 = "123abc";
        try {
            int intNumber1 = Integer.parseInt(strNumber1);
        } catch (NumberFormatException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }

        // Case 2: Number is valid.
        String strNumber2 = "123";
        try {
            int intNumber2 = Integer.parseInt(strNumber2);
        } catch (NumberFormatException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }

        // Case 3: Dividing by zero.
        int intNumber3 = 10;
        int intNumber4 = 0;
        try {
            int intResult = intNumber3 / intNumber4;
        } catch (ArithmeticException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        } finally {
            System.out.println("Finally block is executed!");
        }
    }
}