public class Diagonal_Sum {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3, 4, 5 },
                           {6, 7, 8, 9, 10 },
                           {11, 12, 13, 14, 15 },
                           {16, 17, 18, 19, 20 },
                           {21, 22, 23, 24, 25} };

        int primary_diagonal_sum = 0;
        int secondary_diagonal_sum = 0;

        // for (int i = 0; i < matrix.length; i++) {    // THIS NOT OPTIMIZED BECAUSE ITS TIME COMPLEXITY IS O(n^2)
        //     for (int j = 0; j < matrix[0].length; j++) {
        //         if(i == j){
        //             primary_diagonal_sum += matrix[i][j];
        //         } else if( i + j == matrix.length - 1){
        //             secondary_diagonal_sum += matrix[i][j];
        //         }
        //     }
        // }

        for (int i = 0; i < matrix.length; i++) {
            primary_diagonal_sum += matrix[i][i];
            if(i != matrix.length - i - 1)
                secondary_diagonal_sum += matrix[i][matrix.length - i - 1];
        }

        int total_diagonal_sum = primary_diagonal_sum + secondary_diagonal_sum;
        System.out.println("Total Diagonal Sum is = " + total_diagonal_sum);
    }
}
