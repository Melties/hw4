import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns in your matrix: ");
        String size = in.nextLine();
        int sizeOfMatrix;
        if(size.matches("[-+]?\\d+")) {
            sizeOfMatrix = Integer.parseInt(size);
        } else {
            System.out.println("Invalid input, please, enter integer number");
            sizeOfMatrix = in.nextInt();
        }
        int firstMatrix[][] = new int[sizeOfMatrix][sizeOfMatrix];
        int secondMatrix[][] = new int[sizeOfMatrix][sizeOfMatrix];
        int sumMatrix[][] = new int[sizeOfMatrix][sizeOfMatrix];
        int difMatrix[][] = new int[sizeOfMatrix][sizeOfMatrix];
        System.out.println("Enter the first matrix");
        for(int i = 0; i < sizeOfMatrix; i++){
            for(int j = 0; j < sizeOfMatrix; j++){
                String input = in.nextLine();
                if(input.matches("[-+]?\\d+")) {
                    firstMatrix[i][j] = Integer.parseInt(input);
                } else {
                    System.out.println("INVALID input");
                }
            }
        }
        System.out.println("Enter the second matrix");
        for(int i = 0; i < sizeOfMatrix; i++){
            for(int j = 0; j < sizeOfMatrix; j++){
                String input = in.nextLine();
                if(input.matches("[-+]?\\d+")) {
                    secondMatrix[i][j] = Integer.parseInt(input);
                } else {
                    System.out.println("INVALID input");
                }
            }
        }
        System.out.println("First Matrix:");
        for (int i = 0; i < sizeOfMatrix; i++) {
            for (int j = 0; j < sizeOfMatrix; j++) {
                System.out.print(firstMatrix[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("Second Matrix:");
        for (int i = 0; i < sizeOfMatrix; i++) {
            for (int j = 0; j < sizeOfMatrix; j++) {
                System.out.print(secondMatrix[i][j]+" ");
            }
            System.out.println("");
        }
        for (int i = 0; i < sizeOfMatrix; i++) {
            for (int j = 0; j < sizeOfMatrix; j++) {
                sumMatrix[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }
        System.out.println("the sum of Matrix:");
        for (int i = 0; i < sizeOfMatrix; i++) {
            for (int j = 0; j < sizeOfMatrix; j++) {
                System.out.print(sumMatrix[i][j]+" ");
            }
            System.out.println("");
        }
        for (int i = 0; i < sizeOfMatrix; i++) {
            for (int j = 0; j < sizeOfMatrix; j++) {
                difMatrix[i][j] = firstMatrix[i][j] - secondMatrix[i][j];
            }
        }
        System.out.println("the difference of Matrix:");
        for (int i = 0; i < sizeOfMatrix; i++) {
            for (int j = 0; j < sizeOfMatrix; j++) {
                System.out.print(difMatrix[i][j]+" ");
            }
            System.out.println("");
        }
    }
}

