import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class CalсTest extends BaseTest{
    @Test
    public void testSum (){
        Assert.assertEquals(Calculator.sum (2,3), 5, "неверная сумма...");//исходные данные, ожидаемый результат
    }
    @Test (enabled=false)
    public void testSum1 (){
        Assert.assertEquals(Calculator.sum (2,3), 5, "неверная сумма...");//исходные данные, ожидаемый результат
    }
    @Test (description = "Тест с описанием")
    public void testSum2 (){
        Assert.assertEquals(Calculator.sum (2,3), 5, "неверная сумма...");//исходные данные, ожидаемый результат
    }
    @Test (testName = "Test with name")
    public void testSum3 (){
        Assert.assertEquals(Calculator.sum (2,3), 5, "неверная сумма...");//исходные данные, ожидаемый результат
    }
    @Test (timeOut = 1000)
    public void waitLongTimeTest () throws InterruptedException{
    Thread.sleep(800);}
    @Test (dataProvider = "dataForSum")
    public void testDataProvider (int a,int b, int expectedResult){
        Assert.assertEquals(Calculator.sum (2,3), 5, "неверная сумма...");}
    @Test
    public void testExceptions (){
         List
    }
}
