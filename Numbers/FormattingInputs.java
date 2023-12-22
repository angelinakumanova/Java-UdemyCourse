package Numbers;

public class FormattingInputs {
    public static void main(String[] args) {
        System.out.printf("$%,.2f%n", 123456.783);
        System.out.printf("%(.3f%n", -9876.32532);
        System.out.printf("%ef%n", 23.19283928394829182);
        System.out.printf("%010d%n", 123456);
        System.out.printf("%,.1f", -9876.35532);
    }
}
