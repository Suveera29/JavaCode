package August12.Abstract;

public class CcellInterface implements ComputerInterface, MobileInterface{


    @Override
    public void Call() {
        System.out.println("Calling");

    }

    @Override
    public void Video() {
        System.out.println("Video");

    }

    @Override
    public void Calculator() {
        System.out.println("Doing sum");

    }
}