import org.testng.annotations.Test;

public class PriorityTest {
    @Test (priority = 1)
    public void stepB() {
        System.out.println("stepB...");
    }

    @Test(priority = 2)
    public void stepsA2() {
        System.out.println("stepA2...");
    }
    @Test(priority = 3)
    public void stepsA11() {
        System.out.println("stepA11...");
    }
    @Test(priority = 4)
    public void stepsD() {
        System.out.println("stepD...");
    }

    @Test(priority = 5)
    public void stepsC() {
        System.out.println("stepC...");
    }
}