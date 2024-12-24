public class UncommonErrorExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // Potential ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.err.println("ArithmeticException caught: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Unexpected Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed");
        }
        String str = null;
        System.out.println(str.length()); //Potential NullPointerException
    }
}