package July29;

class Car {
    private String name;
    private String brand;
    private int engine = 201;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getEngine() {
        return engine;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }
}


public class CarGetterSetter {
    public static void main(String[] args) {
        Car model = new Car();
        model.setName("Accord");
        model.setBrand("Honda");

        System.out.println(model.getBrand());
        System.out.println(model.getName());
        System.out.println(model.getEngine());


    }

}
