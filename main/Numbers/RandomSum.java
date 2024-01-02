package Numbers;

import java.util.Random;

public class RandomSum {
    private int sum = 0;

    public int next() {
        this.sum += new Random().nextInt(10);
        return  this.sum;
    }

    public static void main(String[] args) {
        RandomSum randomSum = new RandomSum();
        System.out.println(randomSum.next());
        System.out.println(randomSum.next());
        System.out.println(randomSum.next());
        System.out.println(randomSum.next());
        System.out.println(randomSum.next());
        System.out.println(randomSum.next());
        System.out.println(randomSum.next());
        System.out.println(randomSum.next());
        System.out.println(randomSum.next());
        System.out.println(randomSum.next());
    }
}
