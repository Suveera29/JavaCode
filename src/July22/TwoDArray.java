package July22;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {

        int arr[][] = {{1,2,3}, {2,3,4}, {4,5,6}};
        int matirx[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value:");

        for (int i = 0; i < arr.length; i++) {
            // arr[0] = new int[].length; {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");

            }

            System.out.println(" ");
        }
        }
    }
