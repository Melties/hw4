import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0; int counter = 0;
        String input = "";
        while(!input.equals("stop")) {
            input = in.nextLine();
            sum += Integer.valueOf(input);
            counter++;
        }
        System.out.println(sum / counter);
        in.close();
    }
}
