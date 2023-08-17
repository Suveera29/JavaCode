package AssignmetAugust12;

public class Penguin extends Animal implements Aquatic{
    @Override
    public void feed() {
        System.out.println("Eating");

    }

  /*  @Override
    public void makesound() {
        System.out.println("Sound");


    }*/

    @Override
    public void Swim() {
        System.out.println("Swimming");

    }
}
