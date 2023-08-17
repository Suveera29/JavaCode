package July25;

public class StringMehthods {
    public static void main(String[] args) {
        String s1 = "suveera";
        String s2 = "pragra";
        String s3 = "keyboard";

        System.out.println(s1.compareToIgnoreCase(s2));
        System.out.println(s1.concat(s2));
        System.out.println(s1.replace("suveera", "visu"));
        System.out.println(s1.contains("suveera"));
        System.out.println(s1.indexOf("v"));
        System.out.println(s1.isEmpty());
        System.out.println(s1.length());
        System.out.println(s1.lastIndexOf("a"));
        System.out.println(s1.substring(2));
        System.out.println(s2.replace("pra", "Nia"));
        System.out.println(s1);
        System.out.println(s1.trim());

        int num = 10;
        String s = String.valueOf(num);
        System.out.println(s + 20);


        //array length? arr.length ----property
        //length()--method
    }
}
