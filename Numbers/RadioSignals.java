package Numbers;

public class RadioSignals {
    public static void main(String[] args) {
        // A B C D E  F  G  H
        // 1 2 4 8 16 32 64 128

        int signalABC = 1 | 2 | 4;
        int signalAD = 1 | 8;
        int signalADC = 1 | 8 | 4;

        // testing if signal D is in ADC
        System.out.println((13 & 8) == 8);

    }
}
