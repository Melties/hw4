import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res = 0;
        System.out.println("Enter first number");
        String num1 = in.nextLine();
        System.out.println("Enter second number");
        String num2 = in.nextLine();
        System.out.println("Enter sign of operation between them");
        String sign = in.nextLine();
        if (num1.matches("[-+]?\\d+") && num2.matches("[-+]?\\d+")) {
            if(sign.equals("+")) {
                res = Integer.parseInt(num1) + Integer.parseInt(num2);
                System.out.println(num1 + " + " + num2 + " = " + res);
            }
            if(sign.equals("-")) {
                res = Integer.parseInt(num1) - Integer.parseInt(num2);
                System.out.println(num1 + " - " + num2 + " = " + res);
            }
            if(sign.equals("*")) {
                res = Integer.parseInt(num1) * Integer.parseInt(num2);
                System.out.println(num1 + " * " + num2 + " = " + res);
            }
            if(sign.equals("/")) {
                res = Integer.parseInt(num1) / Integer.parseInt(num2);
                System.out.println(num1 + " / " + num2 + " = " + res);
            }
        } else {
            System.out.println("Invalid input");
        }
        in.close();
    }
}
