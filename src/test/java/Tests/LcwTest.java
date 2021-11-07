package Tests;

import Pages.BasketPage;
import Pages.HomePage;
import Pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class LcwTest extends BaseTest {
    BasketPage basketPage = new BasketPage(driver);
    HomePage homePage = new HomePage(driver);
    LoginPage loginPage = new LoginPage(driver);

    @Test
    public void LcwTest(){
        homePage.homePageControl();
        loginPage.Login();
        homePage.homePageControl();
        String price = homePage.searchFor("Pantolon");
        basketPage.basketPageControl();
        basketPage.comparePrices(price);
    }


}
