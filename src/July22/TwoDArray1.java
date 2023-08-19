package July22;

import java.util.Scanner;

public class TwoDArray1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array");
       int row = sc.nextInt();
        int colum = sc.nextInt();
        int matrix[][]= new int[row][colum];

        System.out.println("enter your value");

        for(int i = 0; i < row;i++){
            for (int j = 0; j < colum; j++) {
                matrix[row][colum] = sc.nextInt();

                System.out.println("enetr the matrix");
                for ( i = 0; i < row; i++) {
                    for ( j = 0; j < colum; j++) {
                        System.out.print(matrix[i][j]+" ");
                        System.out.println();
                    }

                }
            }
        }
    }

}
