import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryTest {
    private int attempt=1;
    @Test (retryAnalyzer = Retry.class)
    public void flaryTest(){
        if (attempt == 4) {

            Assert.assertTrue(true);
        }
        else{
            attempt++;
            System.out.println("Attempt  is:"+ attempt);
            throw new NullPointerException();
        }
    }
}
