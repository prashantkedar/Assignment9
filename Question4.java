/*Given an m x n matrix of distinct numbers, return all lucky numbers in the matrix in any order.
A lucky number is an element of the matrix such that it is the minimum element in its row and maximum in its column.
Input: matrix = [[3,7,8],[9,11,13],[15,16,17]]
Output: [15]
Explanation: 15 is the only lucky number since it is the minimum in its row and the maximum in its column.
*/

import java.util.Scanner;
public class Question4 {
    public  static void main(String[] args) {
        int rows = 0;
        int colomn = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows : ");
        rows = sc.nextInt();
        System.out.println("Enter the no of colomn : ");
        colomn = sc.nextInt();
        int[][] matrix = new int[rows][colomn] ;
        System.out.println("Enter the matrix values : ");
        for ( int i = 0 ; i < rows ; i++){
            for ( int j =0 ; j < colomn ; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int[] minimumRow = new int[m];
        for (int i = 0; i < m; i++) {
            int min = matrix[i][0];
            for (int j = 1; j < n; j++) {
                min = Math.min(min, matrix[i][j]);
            }
            minimumRow[i] = min;
        }
        int[] maximumColumn = new int[n];
        for (int j = 0; j < n; j++) {
            int max = matrix[0][j];
            for (int i = 1; i < m; i++) {
                max = Math.max(max, matrix[i][j]);
            }
            maximumColumn[j] = max;
        } for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == minimumRow[i] && matrix[i][j] == maximumColumn[j]) {
                    System.out.println("Lucky Number: " + matrix[i][j]);
                }
            }
        }
    }

    
}