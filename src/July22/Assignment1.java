package July22;

import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array length");
        int input = sc.nextInt();
        int arr[] = new int[input];
        System.out.println("enter the element");
        for (int i = 0; i < input; i++) {
            arr[i] = sc.nextInt();
        }
        for (int j = 0; j< input ; j++) {
            for (int z = j+1; z < input; z++) {
                if(arr[j]<arr[z]){
                    int temp = arr[j];
                    arr[j]= arr[z];
                    arr[z]=temp;
                }

            }


        }
    }

    }
