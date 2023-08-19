package August15;

public class Annaymous {
    public static void main(String[] args) {

        //we can assign child class object to parent ref
        Furniture furniture = new Furniture() {
            @Override
            public void sit() {
                System.out.println("sit on chair");

            }
            @Override
            public void stand() {
                System.out.println("stand");

            }
        };


    }
}
