package AssignmetAugust12;

public class Lion extends Animal implements ClimbAnimal {

    @Override
    public void feed() {
        System.out.println("Eating grass");

    }
/*
    @Override
    public void makesound() {
        System.out.println("roaring");

    }*/

    @Override
    public void climb() {
        System.out.println("Climbing");

    }
}
