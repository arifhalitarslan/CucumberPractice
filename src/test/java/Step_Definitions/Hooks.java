package Step_Definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

@Before // it runs before every Scenerio
    public void setUp(){
    System.out.println("Before Method is running...");
}

@After // it runs after every Scenerio
    public void tearDown() {
    System.out.println("After method is running..");
}

}
