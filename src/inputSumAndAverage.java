import java.util.Scanner;

public class inputSumAndAverage {

    public static void main(String[] args) {

        int sum = 0;
        long avg = 0;
        int count = 1;

        Scanner scanner = new Scanner(System.in);

        while(true) {

            System.out.println("Enter value");
            String a = scanner.nextLine();

            try {
                int x = Integer.parseInt(a);
                sum += x;
                avg = Math.round((double)sum / count);
            } catch(NumberFormatException nfe) {
                System.out.println("SUM = " + sum + " " + "AVG = " + avg);
                break;
            }
            count++;
        }
    }
}
