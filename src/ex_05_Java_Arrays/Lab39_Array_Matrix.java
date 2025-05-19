package ex_05_Java_Arrays;

public class Lab39_Array_Matrix {
    public static void main(String[] args) {

        int [][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for(int i =0;i<matrix.length;i++) //here matrox.lemghth always refers to rows

        {
            for(int j = 0;j < matrix[i].length;j++) //here j is for columns to iterate over it
            {
                System.out.println(matrix[i][j]);
            }
        }

    }
}
