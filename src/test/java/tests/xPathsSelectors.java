package tests;

import configuration.ReadProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class xPathsSelectors {
    private WebDriver driver;

    @Test
    public void basicXPathSelectors (){
        driver.get(ReadProperties.getUrl());
        // абсолютный xpath
        Assert.assertTrue(driver.findElement(By.xpath()));
         // Все элементы страницы
        Assert.assertTrue(driver.findElement(By.xpath("//h1")).isDisplayed());
        //аналог родительского div и на один уровень ниже p1
        Assert.assertTrue(driver.findElement(By.xpath("//div//div")).isDisplayed());
        // поиск элемента у которого есть атрибут id со значением
        Assert.assertTrue(driver.findElement(By.xpath("//div[@id]")).isDisplayed());
        // поиск элемента
        Assert.assertTrue(driver.findElement(By.xpath("//div[@id]")).isDisplayed());
    }
@Test
    public void axesPathTest(){
        driver.get(ReadProperties.getUrl());

        // поиск родителя у элемента с тэгом h1
    Assert.assertTrue(driver.findElement(By.xpath("//h1/..")).isDisplayed());
            Assert.assertTrue(driver.findElement(By.xpath("//h1/parent::div")).isDisplayed());
    // поиск всех предков с тэгом div у элемента с тэгом h1
    Assert.assertTrue(driver.findElement(By.xpath("//h1/ancector::div")).isDisplayed());
    // использование child - все дочерние элементы с тэгом a от div
    Assert.assertTrue(driver.findElement(By.xpath("//h1/child::a")).isDisplayed());
    // использование following - выбирает все в документе после закрытия тэга  текущего узла
    Assert.assertTrue(driver.findElement(By.xpath("//*[class='dialjg-title']/folloving)).isDisplayed());
}

}
