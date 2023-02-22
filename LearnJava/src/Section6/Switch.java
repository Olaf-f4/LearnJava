package Section6;

public class Switch {
    public static void main(String[] args) {
/*
        int value = 5;
        if (value == 1) {
            System.out.println("Value is = 1");
        } else if (value == 2) {
            System.out.println("Value is = 2");
        } else {
            System.out.println("Value equal to nothing");
        }

 */
        int switchValue = 5;

        switch (switchValue) {
            case 1 -> System.out.println("Value is = 1");
            case 2 -> System.out.println("value is = 3");
            case 3, 4, 5, 6 -> {
                System.out.println("Value is 3-6");
                System.out.println("Value is precisely " + switchValue);
            }
            default -> System.out.println("Value is none");
        }

        String month = "octavius";
        System.out.println(month + " is in the " + getQuarter(month) + " quarter.");
    }

    public static String getQuarter(String month) {

        return switch (month) {
            case "January", "February", "March" -> "1st";
            case "April", "May", "June" -> "2nd";
            case "July", "August", "September" -> "3rd";
            case "October", "November", "December" -> "4th";
            default -> {
                String badResponse = (month + " is not valid");
                yield badResponse;
            }
        };
    }
}
