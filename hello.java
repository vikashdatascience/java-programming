public class hello {

    public static void main(String[] args) {

        int a = 5;
        int b = 3;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("\nBitwise AND (&)");
        System.out.println("a & b = " + (a & b));

        System.out.println("\nBitwise OR (|)");
        System.out.println("a | b = " + (a | b));

        System.out.println("\nBitwise XOR (^)");
        System.out.println("a ^ b = " + (a ^ b));

        System.out.println("\nBitwise Complement (~)");
        System.out.println("~a = " + (~a));
        System.out.println("~b = " + (~b));
    }
}