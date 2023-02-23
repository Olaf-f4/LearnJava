package Section6.Challenges;

public class SwitchExpressionChallenge {

    public static void printDayOfWeek(int day) {
        String dayOfWeek = switch (day){
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Huh?";
        };
        System.out.println(day + " stands for " + dayOfWeek);
    }
    public static void printWeekDay(int day) {

        String dayOfWeek;
        if (day == 0){
            dayOfWeek = "Sunday";
        } else if (day == 1) {
            dayOfWeek = "Monday";
        } else if (day == 2) {
            dayOfWeek = "Tuesday";
        }else if (day == 3) {
            dayOfWeek = "Wednesday";
        }else if (day == 4) {
            dayOfWeek = "Thursday";
        }else if (day == 5) {
            dayOfWeek = "Friday";
        }else if (day == 6) {
            dayOfWeek = "Saturday";
        } else {
            dayOfWeek = "Rubbish";
        }
        System.out.println(dayOfWeek);

    }

    public static void main(String[] args) {
        printDayOfWeek(3);
        printWeekDay(5);
    }
}
