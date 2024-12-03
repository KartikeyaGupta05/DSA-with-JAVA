import java.util.Scanner;

public class Array_2D_Basics {
    public static void search(Scanner sc, int matrix[][]) {
        System.out.print("Enter a number for search : ");
        int search = sc.nextInt();
        System.out.print("Search element at ... ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (search == matrix[i][j]) {
                    System.out.print("(" + i + "," + j + ")");
                } else {
                    System.out.println("Searched element didi not found");
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row number : ");
        int rows = sc.nextInt();
        System.out.print("Enter column number : ");
        int cols = sc.nextInt();
        int matrix[][] = new int[rows][cols];
        System.out.println("Enter element of matrix : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // System.out.println("Printing element of matrix ...");
        // for (int i = 0; i < rows; i++) {
        // for (int j = 0; j < cols; j++) {
        // System.out.print(matrix[i][j] + " ");
        // }
        // System.out.println();
        // }

        search(sc, matrix);

        sc.close();
    }
}
