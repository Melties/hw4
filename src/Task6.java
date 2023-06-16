import java.io.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args)
            throws java.io.FileNotFoundException {
        Scanner in = new Scanner(new File("src/matrix.txt"));
        int rows = in.nextInt();
        int columns = in.nextInt();
        int [][] firstArray = new int[rows][columns];
        int [][] secondArray = new int[rows][columns];
        while(in.hasNextLine()) {
            for (int i = 0; i < firstArray.length; i++) {
                String[] line = in.nextLine().trim().split(" ");
                for (int j = 0; j < line.length; j++) {
                    firstArray[i][j] = Integer.valueOf(line[j]);
                }
            }
            for (int i = 0; i < secondArray.length; i++) {
                String[] line = in.nextLine().trim().split(" ");
                for (int j = 0; j < line.length; j++) {
                    secondArray[i][j] = Integer.valueOf(line[j]);
                }
            }
        }
        System.out.println(Arrays.deepToString(firstArray));
        System.out.println(Arrays.deepToString(secondArray));
    }
}
//Задача #5, но матрицы необходимо считывать из файла (INPUT).
//        Матрицы в фаиле хранятся в ледующем виде:
//        3 3
//        1 2 3
//        1 2 3
//        1 2 3
//
//        1 2 3
//        1 2 3
//        1 2 3
//        Первая строка содержит размерность матриц.
//        Далее идут сами матрицы разделенные пустой строкой.

