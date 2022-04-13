import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamTest {
    @Parameters ({"Login-value","paw-value"})
    @Test
    public void paramTest (@Optional("Defaut login") String lengh, @Optional ("11111") String paw){

    }

}

