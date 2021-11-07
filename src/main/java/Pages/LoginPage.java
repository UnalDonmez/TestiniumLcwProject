package Pages;

import Abstract.AbstractBase;
import PageElements.HomePageElements;
import PageElements.LoginPageElements;
import Properties.UserInfo;
import org.openqa.selenium.WebDriver;
import org.apache.log4j.Logger;

public class LoginPage extends AbstractBase {

    LoginPageElements loginPageElements = new LoginPageElements();
    UserInfo userInfo = new UserInfo();
    static Logger log = Logger.getLogger(LoginPage.class);
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    public void Login(){
        click(loginPageElements.loginIcon);
        System.out.println("Login iconuna tıklandı.");
        Wait(3);
        find(loginPageElements.loginPageTitle);
        System.out.println("Login sayfasının geldiği görüldü");
        clear(loginPageElements.loginEmailInput);
        type(loginPageElements.loginEmailInput,userInfo.email);
        System.out.println("Email kısmına değer yazıldı: "+userInfo.email);
        clear(loginPageElements.loginPasswordInput);
        type(loginPageElements.loginPasswordInput,userInfo.password);
        System.out.println("Şifre kısmına değer yazıldı");
        click(loginPageElements.loginButton);
        System.out.println("Login butonuna tıklandı");
    }
}
