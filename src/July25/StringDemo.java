package July25;

public class StringDemo {
    public static void main(String[] args) {
        //String sc = new String("pragra");

        String s1 = "pragra";
        String s2 = "pragra";
        String s3 = new String("pragra");
        String s4 = new String("pragra1");

        System.out.println(s1 == s2); //true  check memory address - content
        System.out.println(s1 == s3);//false   different memory address, but content address
        System.out.println(s1.equals(s2));//true only check content
        System.out.println(s1.equals(s3));//true only check content
        System.out.println(s3.equals(s4));//true only check content


    }
}
