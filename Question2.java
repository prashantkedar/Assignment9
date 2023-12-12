/*Given an n x n binary matrix image, 
flip the image horizontally, then invert it, and return the resulting image.
To flip an image horizontally means that each row of the image is reversed.
For example, flipping [1,1,0] horizontally results in [0,1,1].
To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.
For example, inverting [0,1,1] results in [1,0,0]. 
Input: image = [[1,1,0],[1,0,1],[0,0,0]]
Output: [[1,0,0],[0,1,0],[1,1,1]]
*/

import java.util.Arrays;
import java.util.Scanner;

class Question2 {

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter the n*n binary matrix value (row and column value) : ");
int value = sc.nextInt();
    int [][] m = new int[value][value];
    System.out.print("Enter the value of square matrix: ");
    for (int s = 0; s < value; s++) {
        for(int k=0;k<value;k++) {
            m[s][k]=sc.nextInt();
        }
       // m = [[1,1,0],[1,0,1],[0,0,0]]
    }
    int i = 0;
    int j = 0;
    for(i = 0; i < m.length; i++) {            
        for(int left = 0, right = m[i].length-1; left <= right; left++, right--) {
                int temp = m[i][left];
                m[i][left] = m[i][right];
                m[i][right] = temp;
            }
        } for(i = 0; i <m.length; i++) {
            for(j = 0; j <m[i].length; j++) {
                m[i][j] = m[i][j]==0 ? 1 : 0;
            }
        }
        System.out.println(Arrays.deepToString(m) + "\t");
    }
}
