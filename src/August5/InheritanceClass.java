package August5;


class Vehicles {
    String colour;
    int speed;
    int numOfTyres;


    public void display() {                             //method

        System.out.println("colour: " + colour);
        System.out.println("speed:  " + 100);
        System.out.println("num of tyres:  " + numOfTyres);

    }
}

class Cars extends Vehicles {

    String fuleType;
    public void display2(){

        System.out.println("fule type:  "+ fuleType);
    }


}


public class InheritanceClass {
    public static void main(String[] args) {
     /*   Vehicle vehicle = new Vehicle();
        vehicle.display();
*/
        Cars car = new Cars();
        car.display2();

        car.colour = "red";

        car.display();




    }
}
