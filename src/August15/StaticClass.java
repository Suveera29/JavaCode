package August15;

public class StaticClass {
    public static void main(String[] args) {
       Bottle.Water water = new Bottle.Water();
       water.colour();

    }


    public class Bottle {
        static class Water{
            public void colour(){
                System.out.println("water has no colour");
            }

        }

    }
}
