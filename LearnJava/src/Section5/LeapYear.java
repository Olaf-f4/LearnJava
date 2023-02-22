package Section5;

import java.io.PrintStream;

public class LeapYear {
    public static boolean isLeapYear (int year) {
        if (year >= 1 && year <= 9999) {
            if ((year % 4) == 0) {
                if (year % 100 == 0) {
                    return year % 400 == 0;
                } return true;
            } return false;
        } return false;
    }

    public static void main(String[] args) {
        try {
            PrintStream stream = new PrintStream(System.out);
            stream.println(isLeapYear(2000));

            stream.flush();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
