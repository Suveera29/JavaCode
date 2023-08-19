package August19;

public class MainDRiverRules {
    public static void main(String[] args) throws AgeLimitException {
      DriverRules driverRules = new DriverRules();
        System.out.println(driverRules.name+"your age"+driverRules.rule(12));
    }
}
