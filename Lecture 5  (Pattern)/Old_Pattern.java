class Old_Pattern {
    public static void main(String[] args) {
        // PATTERN 1
        // for(int i = 1; i<=4; i++){
        // for(int j = 1; j<=5; j++){
        // System.out.print("*");
        // }
        // System.out.println("");
        // }

        // Printed loop
        // *****
        // *****
        // *****
        // *****

        // PATTERN 2
        // for (int i = 1; i <= 4; i++) {
        // for (int j = 1; j <= 5; j++) {
        // if (i == 1 || j == 1 || i == 4 || j == 5){
        // System.out.print("*");
        // } else{
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // Printed loop
        // *****
        // *   *
        // *   *
        // *****

        // PATTERN 3
        // for (int i = 1; i <= 4; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // Printed loop
        // *
        // **
        // ***
        // ****

        // PATTERN 4
        // for (int i = 1; i <= 4; i++) {
        // for (int j = 4; j >= i; j--) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // Printed loop
        // ****
        // ***
        // **
        // *

        // PATTERN 5
        // MY SOLUTION
        // for (int i = 1; i <= 4; i++) {
        // for (int j = 1; j <= 4; j++) {
        // if(i == 4 || j == 4 || i == 3 && j == 3 || i == 3 && j == 2 || i == 2 && j ==
        // 3){
        // System.out.print("*");
        // } else{
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // Shradha Didi Solution;
        // int n = 6;
        // for(int i = 1; i<= n; i++){

        // // inner loop --> space print
        // for(int j = 1; j<= (n-i); j++){
        // System.out.print(" ");
        // }

        // // 2nd inner loop --> star print
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // Printed loop
        // *
        // **
        // ***
        // ****

        // PATTERN 6
        // for (int i = 1; i <= 5 ; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(j + " ");
        // }
        // System.out.println();
        // }

        // Printed loop
        // 1
        // 1 2
        // 1 2 3
        // 1 2 3 4
        // 1 2 3 4 5

        // PATTERN 7
        // int n = 5;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n-i+1 ; j++) {
        // System.out.print(j + " ");
        // }
        // System.out.println();
        // }

        // Printed loop
        // 1 2 3 4 5
        // 1 2 3 4
        // 1 2 3
        // 1 2
        // 1

        // PATTERN 8 --> FLOYD'S TRIANGLE
        // int x = 1;
        // int n = 5;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(x + " ");
        // x++;
        // }
        // System.out.println();
        // }

        // Printed loop
        // 1
        // 2 3
        // 4 5 6
        // 7 8 9 10
        // 11 12 13 14 15

        // PATTERN 9 --> 0-1 Triangle
        // MY SOLUTION
        // for (int i = 1; i <= 10; i++) {
        // for (int j = 1; j <= i; j++) {
        // if( (i-j) % 2 != 0 ){
        // System.out.print("0" + " ");
        // }
        // else{
        // System.out.print("1" + " ");
        // }
        // }
        // System.out.println();
        // }

        // SHRADHA DIDI SOLUTION
        // int n = 5;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // if ((i+j) % 2 == 0 ) {
        // System.out.print("1" + " ");
        // }
        // else{
        // System.out.print("0" + " ");
        // }
        // }
        // System.out.println();
        // }

        // Printed loop
        // 0
        // 0 1
        // 1 0 1
        // 0 1 0 1
        // 1 0 1 0 1 ...

        // HOMERWORK
        // int n = 5;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= (n-i); j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= n ; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // int n = 5;
        // for (int i = 1; i <= n; i++) {
        // for (int j = n; j >= i; j--) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= (i); j++) {
        // System.out.print(i + " ");
        // }
        // System.out.println();
        // }

        // int n = 5;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j < n-1; j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i ; j++) {
        // System.out.print(j);
        // }
        // System.out.println();
        // }

        // Advanced Pattern question

        // Pattern 1
        // *             *
        // * *         * *
        // * * *     * * *
        // * * * * * * * *
        // * * * * * * * *
        // * * *     * * *
        // * *         * *
        // *             *

        // Solution
        // int n = 4 ;
        // // Upper Half
        // for (int i = 1; i <= n; i++) {
        // // First Star
        // for (int j = 1; j <= i; j++) {
        // System.out.print("* ");
        // }
        // // Spaces
        // // for (int j = (n*2)-(i*2); j >= 1; j--) { // My logic
        // for (int j = ((n-i)*2)*2; j >= 1; j--) { // Shradha didi logic
        // System.out.print(" ");
        // }
        // // Second Star
        // for (int j = 1; j<=i; j++) {
        // System.out.print("* ");

        // }
        // System.out.println();
        // }

        // // Lower Half
        // for (int i = n; i >= 1; i--) {
        // // First Star
        // for (int j = 1; j <= i; j++) {
        // System.out.print("* ");
        // }
        // // Spaces
        // for (int j = ((n-i)*2)*2; j >= 1; j--) {
        // System.err.print(" ");
        // }
        // // Second Star
        // for (int j = 1; j<=i; j++) {
        // System.out.print("* ");

        // }
        // System.out.println();
        // }

        // Pattern 2
        //     *****
        //    *****
        //   *****
        //  *****
        // *****

        // Solution
        // int n = 5;
        // for (int i = 1; i <= n; i++) {
        // Print Spaces
        // for (int j = 1; j <= (n-i); j++) {
        // System.out.print(" ");
        // }
        // Print Star
        // for (int j = 1; j <= n ; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // Pattern 3
        //    1
        //   2 2
        //  3 3 3
        // 4 4 4 4
        //5 5 5 5 5

        // Solution
        //int n = 5;
        //for (int i = 1; i <= n; i++) {
        //Print Spaces
        //for (int j = 1; j <= n-i; j++) {
        //    System.out.print(" ");
        //}
        //Print Number
        //for (int j = 1; j <= i; j++) {
        //     System.out.print(i + " ");
        //}
        //  System.out.println();
        //}



        // Pattern 4
        //        1
        //      2 1 2
        //    3 2 1 2 3
        //  4 3 2 1 2 3 4 
        //5 4 3 2 1 2 3 4 5

        // int n = 5 ;
        // for (int i = 1; i <= n; i++) {
        //     //  Print spaces
        //     for (int j = 1; j <= (n-i)*2; j++) {
        //         System.out.print(" ");
        //     }

            // My solution
            // for printing numbers except 1
            // for (int j = 0; j < i-1; j++) {
            //     System.out.print(i-j + " ");
            // }
            // // Print "1"
            // for (int j = 0; j < 1; j++) {
            //     System.out.print("1 ");
            // }
            // // for printing numbers except 1
            // for (int j = 0; j < i-1; j++) {
            //     System.out.print(i-j + " ");
            // }



            // Shradha didi Solution
            // for (int j = i; j >= 1; j--) {
            //     System.out.print(j + " ");
            // }

            // for (int j = 2; j <= i; j++) {
            //     System.out.print(j + " ");
            // }
//             System.out.println();
      //  }


      // Pattern 5 
      //      *
      //    * * *
      //  * * * * *
      //* * * * * * * 
      //* * * * * * * 
      //  * * * * *
      //    * * *
      //      *


      // Solution
    //   int n = 4;
    //   for (int i = 1; i <= n; i++) {
    //     for (int j = 1; j <= (n-i)*2; j++) {
    //         System.out.print(" ");
    //     }
    //     for (int j = 1; j <= (2 * i) - 1; j++) {
    //         System.out.print("* ");
    //     }
    //     System.out.println();
    //   }

    //   for (int i = n; i >= 1; i--) {
    //     for (int j = 1; j <= (n-i)*2; j++) {
    //         System.out.print(" ");
    //     }
    //     for (int j = 1; j <= (2 * i) - 1; j++) {
    //         System.out.print("* ");
    //     }
    //     System.out.println();
    //   }



    // HOMERWORK


    // Pattern 1
    // 12 3 4 5 6 7 8 
    // *            *
    // **          **
    // * *        * *
    // *   *    *   *
    // *     **     *
    // *     **     *
    // *   *    *   *
    // * *        * *
    // **          **
    // *            *


    // Solution 

    // int n = 5;
    // for (int i = 1; i <= n; i++) {
    //     //Upper half
    //     // First star
    //     for (int j = 1; j <= i ; j++) {
    //         if(i==j || i==1 ){
    //             System.out.print("* ");
    //         }
    //     }
    //     // Print spaces
    //     for (int j = 1; j < ((n-i)*2)*2; j++) {
    //         System.out.print(" ");
    //     }
    //     // Second Star
    //     for (int j = 1; j <= i ; j++) {
    //         if( j==16 || j == 16-i){
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }
    // }



    // Pattern 2
    //     *****
    //    *   *
    //   *   *
    //  *   *
    // *****

    // Solution
    // int n = 5;
    // for (int i = 1; i <= n; i++) {
    //     for (int j = 1; j <= n-i; j++) {
    //         System.out.print(" ");
    //     }
    //     for (int j = 1; j <= n; j++) {
    //         if(i==1 || i==n || j == n-i+1 || j == (n*2)-i){
    //             System.out.print("*");
    //         }// else{
    //         //     System.out.print(" ");
    //         // }
    //     }
    //     System.out.println();
    // }


    // Pattern 3
//      1 
//     1 1 
//    1 2 1 
//   1 3 3 1
//  1 4 6 4 1

    // Solution
    // int n = 5;
    // for (int i = 0; i < n; i++) {
    //     for (int j = 1; j <= n-i; j++) {
    //         System.out.print(" ");
    //     }
    //     for (int j = 1; j <= 1; j++) {
    //         double power = Math.pow(11, i);
    //         String number = Integer.toString((int) power);  // Convert the number to a string
            
    //         // Loop through each digit in the string and print it with a space
    //         for (int k = 0; k < number.length(); k++) {
    //             System.out.print(number.charAt(k) + " ");
    //         }
    //     System.out.println();
    // }
    // }

    // Pattern 4
}
}
