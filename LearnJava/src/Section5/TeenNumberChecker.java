package Section5;

public class TeenNumberChecker {
    public static boolean hasTeen(int one, int two, int three) {
        int[] age = {one, two, three};
        if (age[0] >= 13 && age[0] <= 19) {
            return true;
        } else if (age[1] >= 13 && age[1] <= 19) {
            return true;
        } else return age[2] >= 13 && age[2] <= 19;
    }

    public static boolean isTeen(int one) {
        return one >= 13 && one <= 19;
    }
}
