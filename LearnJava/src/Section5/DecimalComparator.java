package Section5;

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces (double one, double two) {
        int a = (int) (one * 1000);
        int b = (int) (two * 1000);

        return a == b;
    }

    public static void main(String[] args) {
        DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756, -3.175);
    }
}
