package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BankPage {
    
    public WebDriver driver;

    public BankPage(WebDriver driver) {
        this.driver = driver;
    }
public WebElement clickable (String locator){
    return driver.findElement(By.xpath("//*[text()='"+locator+"']"));
}
public WebElement inputValue (String locator){
    return driver.findElement(By.xpath("(//*[contains(text(),'"+locator+"')]/following::input)[1]"));
}
public WebElement button (String locator){
    return driver.findElement(By.xpath("//*[@value='"+locator+"']"));
}
public WebElement inputValueIndex (String locator, int index){
    return driver.findElement(By.xpath("(//*[contains(text(),'"+locator+"')]/following::input)['"+index+"']"));
}
}
