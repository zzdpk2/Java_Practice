import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class Chapter2_25 {
    public static void main(String[] args) {
        System.out.print(" Enter the time offset: ");
        Scanner scanner = new Scanner(System.in);
        int offset = scanner.nextInt();
        long totalMilliseconds = System.currentTimeMillis();

        long totalSeconds = totalMilliseconds / 1000;
        long currentSeconds = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinutes = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHours = (totalHours + offset) % 24;

        System.out.println("Time: " + currentHours + " : " + currentMinutes + " : " + currentSeconds);

    }
}
