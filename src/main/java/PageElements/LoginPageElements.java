package PageElements;

import org.openqa.selenium.By;

public class LoginPageElements {
    public By loginIcon = By.xpath("//*[@href='https://www.lcwaikiki.com/tr-TR/TR/giris']");
    public By loginPageTitle = By.xpath("//*[@class='ul-title']");
    public By loginEmailInput = By.xpath("//*[@id='LoginEmail']");
    public By loginPasswordInput = By.xpath("//*[@id='Password']");
    public By loginButton = By.xpath("//*[@id='loginLink']");
}
