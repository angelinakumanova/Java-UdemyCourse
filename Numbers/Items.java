package Numbers;

public class Items {
    private int[] items = {13, 49, 90, 130, 175, 181,
            255, 310, 330, 359};
    private int currentIdx;

    private int next() {
        return items[currentIdx++] / 90;
    }

    public static void main(String[] args) {
        Items item = new Items();
        System.out.println(item.next());
        System.out.println(item.next());
        System.out.println(item.next());
        System.out.println(item.next());
        System.out.println(item.next());
        System.out.println(item.next());
        System.out.println(item.next());
        System.out.println(item.next());
        System.out.println(item.next());
        System.out.println(item.next());
    }
}
