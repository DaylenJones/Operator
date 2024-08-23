public class Operator {
    public static void main(String[] args) {
        double num1 = 20.00;
        double num2 = 80.00;
        double result = (num1 + num2) * 100.00;
        double remainder = result % 40.00;
        boolean isZeroRemainder = (remainder == 0.00);

        System.out.println("Remainder is zero: " + isZeroRemainder);
        if (isZeroRemainder) {
             System.out.println("Got some remainder");
        }
    }
}
