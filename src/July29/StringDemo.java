package July29;

public class StringDemo {
    public static void main(String[] args) {

        String st = "Pragra";
        String snew = "toronto";
        System.out.println(st);
        System.out.println(snew);

        StringBuilder sb = new StringBuilder("pragra");
        sb.append(" in missi");
        System.out.println(sb.reverse());

        System.out.println(sb);

        StringBuffer stringbuffer = new StringBuffer("Account");
        stringbuffer.append(" micro");
        System.out.println(stringbuffer);
    }
}
