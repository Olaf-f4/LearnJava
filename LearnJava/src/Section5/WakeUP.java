package Section5;

import java.io.PrintStream;

public class WakeUP {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (barking && hourOfDay > -1 && hourOfDay < 8) {
            return true;
        } else return barking && hourOfDay == 23;
    }
    public static void main(String[] args) {
        try {
            PrintStream stream = new PrintStream(System.out);
            stream.println(shouldWakeUp(true,2));

            stream.flush();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}