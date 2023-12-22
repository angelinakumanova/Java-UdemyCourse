package Numbers;

public class FormattingInputs {
    public static void main(String[] args) {
        // Direct print
        System.out.printf("$%,.2f%n", 123456.783);
        System.out.printf("%(.3f%n", -9876.32532);
        System.out.printf("%ef%n", 23.19283928394829182);
        System.out.printf("%010d%n", 123456);
        System.out.printf("%,.1f%n", -9876.35532);

        // Storing in String variables
        String v1 = String.format("$%,.2f", 123456.783);
        String v2 = String.format("%(.3f", -9876.32532);
        String v3 = String.format("%ef", 23.19283928394829182);
        String v4 = String.format("%010d", 123456);
        String v5 = String.format("%,.1f", -9876.35532);

        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
        System.out.println(v4);
        System.out.println(v5);
    }
}
