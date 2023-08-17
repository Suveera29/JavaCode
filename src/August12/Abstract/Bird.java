package August12.Abstract;

public abstract class Bird {

    String colour;

    public Bird(String colour) {
        this.colour = colour;
    }

    public abstract void eat();

    public abstract void drink();
    public abstract void fly();

}
