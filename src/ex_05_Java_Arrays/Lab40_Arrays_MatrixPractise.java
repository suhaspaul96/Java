package ex_05_Java_Arrays;

public class Lab40_Arrays_MatrixPractise {
    public static void main(String[] args) {

        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println(matrix[i][j]);
            }

        }
    }

}
