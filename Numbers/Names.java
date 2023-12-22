package Numbers;

public class Names {

    private String[] names = {"Alex", "John", "Martin", "Mark", "Eliot"};
    private int currentIdx = 0;

    public String next() {
        String person = names[currentIdx++];
        return person.substring(0,1).toUpperCase() + person.substring(1);
    }

    public static void main(String[] args) {
        Names name = new Names();
        System.out.println(name.next());
        System.out.println(name.next());
        System.out.println(name.next());
        System.out.println(name.next());
        System.out.println(name.next());
    }

}
