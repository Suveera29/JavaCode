package August15;

public class OuterClass {
    public void insideMethod(){
        System.out.println("outer class");
    }


    String name = "Mike";
    class InClass{
        int x = 10;

        public void insideMethod(){
            System.out.println("inner class");
        }

    }
}
