package August12.Abstract;

public class Eagle extends Bird {

    public Eagle(String colour) {
        super(colour);
    }

    @Override
    public void eat() {
        System.out.println("Eagle is eating"+colour);
    }

    @Override
    public void drink() {
        System.out.println("Eagle is drinking");

    }

    @Override
    public void fly() {
        System.out.println("Eagle is flying");

    }
}
