import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {
        int hour;
        int minutes;

        System.out.println("Wie spät ist es? Bitte gib erst die Stunden und dann die Minuten an:");
        do {
            Scanner scanner = new Scanner(System.in);
            hour = scanner.nextInt();
            if (hour < 0) {
                System.out.println("Wenn du negative Zeit entdeckt hast, gehe nach Stockholm und hole dir" +
                        "deinen Nobelpreis ab. Bei der Überprüfung ob Arbeitszeit ist, ist sie aber unangebracht!");
            } else if (hour > 23) {
                System.out.println("Hier, auf der Erde, ist der Tag nach 23 Stunden und 59 Minuten vorbei. Bitte " +
                        "gewöhne dich daran.");
            }
        }
        while (hour<0 || hour >23);
        System.out.println("Und jetzt die Minuten:");
        do {
            Scanner scanner2 = new Scanner(System.in);
            minutes = scanner2.nextInt();
            if (minutes < 0) {
                System.out.println("Du sollst hier die Minuten angeben, nicht deinen Intelligenzquotienten!");
            } else if (minutes > 59) {
                System.out.println("Wenn deine Uhr " + minutes + " Minuten anzeigt, würde ich sie zurückgeben...");
            }

        }while (minutes<0 || minutes>59);
            if(hour>=8 && hour<12 || hour >=13 && hour<16){
            System.out.println("Du befindest dich in der Arbeitszeit");
        }
        else if (hour == 12){
            System.out.println("Du hast Mittagspause!");
        }
        else{
            System.out.println("FREIZEIT!!! JUHUUUU!!!");
        }
    }
}
