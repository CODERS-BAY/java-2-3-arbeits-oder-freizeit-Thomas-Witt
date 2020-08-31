import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {
        System.out.println("You are about to check, if the time falls within your work-hours. But first, du you want to use military-time (like 1430 hours), than press '1'. \n" +
                "Do you want to use standard European time (like 14:30), than press '2'.\n" +
                "If you want to use silly american time (like 2:30 pm), than press '3':");
        int timeFormat;
        Scanner scanner = new Scanner(System.in);
        timeFormat = scanner.nextInt();

        if (timeFormat == 1) {
            System.out.println("Thank you. Now please input the time you want to check:");
            int time = scanner.nextInt();
            if (time >= 800 && time < 1200 || time >= 1300 && time < 1600) {
                System.out.println("You are in the work time.");
            } else if (time >= 1200 && time < 1300) {
                System.out.println("You are in your lunch break.");
            } else {
                System.out.println("You are in your free time.");
            }
        } else if (timeFormat == 2) {
            System.out.println("Thank you. Now please put in the hour:");
            int hour = scanner.nextInt();
            System.out.println("Alright. Now please the minutes:");
            int minutes = scanner.nextInt();                                    //minutes are not needed to calculate the work hours, but the user feels better if he can type minutes too, so i give him the option
            if (hour >= 8 && hour < 12 || hour >= 13 && hour < 16) {
                System.out.println("You are in the work time.");
            } else if (hour == 12) {
                System.out.println("You are in your lunch break.");
            } else {
                System.out.println("You are in your free time.");
            }

        } else if (timeFormat == 3) {
            System.out.println("Thank you. Now please put in the hour:");
            int hour = scanner.nextInt();
            System.out.println("Is that am or pm");
            String amOrPm = scanner.next();
            System.out.println("Alright. Now please the minutes:");
            int minutes = scanner.nextInt();
            if (hour >= 8 && hour < 12 && amOrPm.equals("am") || hour >= 1 && hour < 4 && amOrPm.equals("pm")) {
                System.out.println("You are in the work time.");
            } else if (hour == 12 && amOrPm.equals("am")) {
                System.out.println("You are in your lunch break.");
            } else {
                System.out.println("You are in your free time.");
            }


        }

    }
}
