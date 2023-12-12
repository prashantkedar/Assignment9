/*You are given an m x n matrix grid consisting of positive integers.

Perform the following operation until grid becomes empty:

Delete the element with the greatest value from each row. If multiple such elements exist, delete any of them.
Add the maximum of deleted elements to the answer.
Note that the number of columns decreases by one after each operation.

Return the answer after performing the operations described above.
input : 
Input: grid = [[1,2,4],[3,3,1]]
4+3+1 = 8
Output: 8 */
import java.util.Arrays;
import java.util.Scanner;
class Question5 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int rows = 0;
        int column = 0;
        System.out.println("Enter the no of rows : ");
        rows = sc.nextInt();
        System.out.println("Enter the no of colomn : ");
        column = sc.nextInt();
        int[][] grid = new int[rows][column];
        System.out.println("Enter matrix values : ");
        for (int i = 0 ; i <= grid.length ; i++){
            for (int j = 0 ; j < grid.length ; j++) {
                grid[j][i] = sc.nextInt();
            }
        }
        int sum=0;
        for(int i =0;i<grid.length;i++) {
            Arrays.sort(grid[i]);
        } for(int i= grid[0].length-1;i>=0;i--) {
            int max = 0;
            for(int j=0;j<grid.length;j++){

                max = Math.max(max, grid[j][i]);
            }
            sum = sum + max;
        }
        System.out.println(sum);
    }
}
