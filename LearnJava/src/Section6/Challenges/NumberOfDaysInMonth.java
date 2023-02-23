package Section6.Challenges;

import java.io.PrintStream;

public class NumberOfDaysInMonth {

    public static void main(String[] args) {

        System.out.println(getDaysInMonth(7, 2244));

        try {
            PrintStream stream = new PrintStream(System.out);
            stream.println(isLeapYear(2005));

            stream.flush();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            if ((year % 4) == 0) {
                if (year % 100 == 0) {
                    return year % 400 == 0;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public static int getDaysInMonth(int month, int year) {

        if (isLeapYear(year) && month == 2) {
            System.out.println("29");
        } else return switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 2 -> 28;
            case 4, 6, 9, 11 -> 30;
            default -> -1;
        };
        return month;
    }
}

/*
else {
        System.out.println(notLeap);
        }
 */