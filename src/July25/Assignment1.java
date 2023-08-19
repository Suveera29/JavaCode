package July25;

public class Assignment1 {
    public static void main(String[] args) {
        String name = "Pragra";
        String reversename = "";

       // char[] chars = name.toCharArray();

        for( int i = 0; i <name.length(); i++){
           reversename = name.charAt(i) +reversename;

        }
        System.out.println(reversename);
        System.out.println(name +" "+reversename);

        System.out.println(name.charAt(2));
        System.out.println(name.indexOf('g'));



    }
}
