package July22;

public class Assignment3Reversearray {
    public static void main(String[] args) {
        /*int array[] = {2,3,4,5,6};
        for (int i = array.length-1; i>0 ; i--) {
            System.out.println(array[i]);
*/
        int[] arr = {11,12,13,14};
        for (int i = 0; i < arr.length-1; i++) {
            int temp;
            temp = arr[arr.length-1];
            arr[arr.length-1] = arr[i];
            arr[i] = temp;
             if(arr[i]==arr[arr.length/2])
            {
                    temp =arr[i-1];
                    arr[i-1]= arr[i];
                    arr[i]=temp;
                    break;
           }
        }
        for (int arr2: arr) {
            System.out.print(arr2 + " ");
        }
        }
    }
