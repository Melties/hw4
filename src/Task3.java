import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        while(true) {
            String input = in.nextLine();
            if(input.equals("stop")) {
                break;
            } else if (input.matches("[-+]?\\d+")) {
                array.add(Integer.parseInt(input));
            } else if (input.equals("status")) {
                Collections.sort(array);
                for(int i = 0; i < array.size(); i++) {
                    System.out.print(array.get(i) + " ");
                }
            }
        }
        in.close();
    }
}
