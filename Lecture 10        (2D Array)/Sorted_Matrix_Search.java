public class Sorted_Matrix_Search {
    public static void main(String[] args) {
        // In this question we use STAIRCASE SEARCHING and TIME COMPLEXITY is O(log(n+m))
        int[][] matrix = {{10, 20, 30, 40},
                          {15, 25, 35, 45},
                          {27, 29, 37, 48},
                          {32, 33, 39, 50}};
        int key = 33;

        // int row = 0, col = matrix[0].length - 1;

        // while (row < matrix.length && col >= 0) {
        //     if (key == matrix[row][col]) {
        //         System.out.println("Found Element at (" + row + "," + col + ")");
        //         return;
        //     } else if(key < matrix[row][col]){
        //         col--;
        //     } else {
        //         row++;
        //     }
        // }


        // HOMEWORK CONDITION

        int row = matrix.length - 1, col = 0;
        
        while (col < matrix[0].length && row >= 0) {
                if (key == matrix[row][col]) {
                    System.out.println("Found Element at (" + row + "," + col + ")");
                    return;
                } else if(key < matrix[row][col]){
                    row--;
                } else {
                    col++;
                }
            }

        System.out.println("Element not found");
    }
}
