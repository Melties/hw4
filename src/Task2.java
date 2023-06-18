import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int counter = 0;
        while (true) {
            String input = in.nextLine();
            if (input.equals("stop")) {
                break;
            } else {
                if(input.matches("[-+]?\\d+")) {
                    counter++;
                    sum += Integer.parseInt(input);
                }
            }
        }
        System.out.println(sum / counter);
        in.close();
    }
}

