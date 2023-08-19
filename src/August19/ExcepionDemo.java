package August19;

import javax.lang.model.type.ArrayType;
import java.util.Scanner;

public class ExcepionDemo {
    public static void main(String[] args) {
        String[] arr = new String[5];


            try {
                System.out.println(arr[5]);
            } catch (ArrayIndexOutOfBoundsException e) {
                e.printStackTrace();
            }
            finally {
                System.out.println("done");
            }
        System.out.println("hello");

    }

}

/*
try with resources
you don't nned to use finally word

            try(write here) {
                System.out.println(arr[5]);
            } catch (ArrayIndexOutOfBoundsException e) {
                e.printStackTrace();
            }

**/
