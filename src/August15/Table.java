package August15;

public class Table implements Furniture {
    @Override
    public void sit() {
        System.out.println("sit on chair");

    }

    @Override
    public void stand() {
        System.out.println("don't stand please");

    }
}
