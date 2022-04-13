import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupsTest {
    @Test (groups = "smoke")
    public void stepB() {
        System.out.println("stepB...");
    }

    @Test (groups = "regration")
    public void stepsA() {
        System.out.println("stepA...");
        Assert.assertTrue(false);
    }

    @Test(groups = "regration")
    public void stepD() {
        System.out.println("stepD...");
    }

    @Test (groups = {"smoke","regration"})
    public void stepC() {
        System.out.println("stepC...");
    }
}