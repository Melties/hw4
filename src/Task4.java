import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res = 0;
        int input = in.nextInt();
        String sign = in.nextLine();
        if(sign.equals("+")) {
            res = input + in.nextInt();
        } else if(sign.equals("-")) {
            res = input - in.nextInt();
        } else if(sign.equals("*")) {
            res = input * in.nextInt();
        }
        System.out.println(res);
        in.close();
    }
}
//    Необходимо реализовать программу "калькулятор".
//        Поддерживаемые операции +-/* выбор операции и ввод данных
//осуществляется пользователем с клавиатуры.
