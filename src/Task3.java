import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int[] array = new int[100];
        int i = 0;
        Scanner in = new Scanner(System.in);
        String input = "";
        while(!input.equals("stop")) {
            input = in.nextLine();
            array[0] = Integer.valueOf(input);
            i++;
            if(input.equals("status")) {
                Arrays.sort(array);
                System.out.println("\nSorted array is: ");
                for (int num : array) {
                    System.out.print(num + " ");
                }
            }
        }
        in.close();
    }
}
//    Необходимо реализовать программу, которая будет считывать
//        числа, введенные пользователем, пока пользователь не введет
//        "stop" слово. по команде "status" необходимо вывести введенные
//        цифры в отсортированном виде (от меньшего к большему).
