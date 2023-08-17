package July25;

public class ReverseString {
    public static void main(String[] args) {
        String s1 = new String("Pragra");
        char[] charArray = s1.toCharArray();

        for(char ch: charArray){
            System.out.print(ch+ " ");
        }
        System.out.println(" ");
        for (int i = charArray.length-1; i>=0 ; i--) {
            System.out.print(charArray[i]+ " ");

        }
    }
    }
