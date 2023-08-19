package August15;

public class InnerClass {

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        OuterClass.InClass inClassObj = outerClass.new InClass();
        inClassObj.insideMethod();


    }
}
