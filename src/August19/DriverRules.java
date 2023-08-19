package August19;

import com.sun.source.tree.BreakTree;

public class DriverRules {

    String name = "Mike";


    public int rule(int age) throws AgeLimitException {
        if(age<18) {
            throw new AgeLimitException(name +"your age is less than 18");
        }
        return age;

    }

}

