package Section5;

public class SecondsAndMinutes {
    public static String getDurationString (int seconds) {

        if (seconds <= 0) {
            return ("Time God");
        }

        while (seconds > 0 && seconds >= 3600) {
            int hours = seconds / 60;
            seconds = seconds % 60;
        }


        if (seconds > 0 && seconds >= 60) {
            if (seconds >= 3600) {
                seconds = seconds % 60;
                return (""+  "h 0m " + seconds + "s");
            }
            int hour = seconds / 3600;
            seconds = seconds % 3600;

            return (""+ hour + "h 0m " + seconds + "s");

        }
        return ("0h 0m " + seconds + "s");
    }

    public static String getDurationString (int minutes, int seconds) {
        int minToSeconds = (minutes * 60) + seconds;
        return (getDurationString(minToSeconds));

    }

    public static void main(String[] args) {
        System.out.println(getDurationString(70));
        System.out.println(getDurationString(65, 45));
    }

    /*
    public Static String getDurationString(int seconds) {
            int minutes = seconds/60;
            int hours = minutes/60;

            int remainingMinutes = minutes%60;
            int remainingSeconds = seconds%60;
        }
     */





}
