package Pages;

import Abstract.AbstractBase;
import PageElements.HomePageElements;
import Properties.UserInfo;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class HomePage extends AbstractBase {
    static Logger log = Logger.getLogger(HomePage.class);
    HomePageElements homePageElements = new HomePageElements();
    UserInfo userInfo = new UserInfo();
    public HomePage(WebDriver driver){
        super(driver);
    }

    public void homePageControl(){
        //Control Home Page
        find(homePageElements.homePageContainer);
        System.out.println("Ana sayfanın açıldığı görüldü");
    }
    public String searchFor(String searchKey){
        //Control Home Page
        String price = "";
        clear(homePageElements.searchInput);
        type(homePageElements.searchInput,searchKey);
        System.out.println("Arama kısmına değer girildi: "+searchKey);
        click(homePageElements.searchButton);
        System.out.println("Ara butonuna tıklandı");
        scrollDownToBottom();
        System.out.println("Sayfanın sonuna scroll işlem ile gidildi.");
        click(homePageElements.showMoreButton);
        System.out.println("Daha Fazla Ürün Gör butonuna tıklandı");
        scrollDownToBottom();
        System.out.println("Sayfanın sonuna scroll işlem ile gidildi.");
        List<WebElement> List = findAll(homePageElements.products);
        int productCount = List.size();
        Random r = new Random();
        int result = r.nextInt(productCount-1) + 1;
        click(List.get(result));
        System.out.println("Random "+result+". ürüne tıklandı");
        Wait(3);
            String isDisabled = "";
            List<WebElement> elementsSize = findAll(homePageElements.selectSize);
            for(int i=0;i<elementsSize.size();i++) {
                if (elementsSize.get(i).isDisplayed()) {
                    isDisabled = elementsSize.get(i).getAttribute("class");
                    if (isDisabled != "") {

                    } else {
                        elementsSize.get(i).click();
                        System.out.println("Beden seçildi");
                    }
                }
            }

            List<WebElement> elementsHeight = findAll(homePageElements.selectHeight);
            for(int i=0;i<elementsHeight.size();i++){
                if(elementsHeight.get(i).isDisplayed()){
                isDisabled = elementsHeight.get(i).getAttribute("class");
                if(isDisabled != ""){

                }else{
                    elementsHeight.get(i).click();
                    System.out.println("Boy seçildi");
                }
            }
        }
        price = getText(homePageElements.productPriceDiscount);
        System.out.println("Ürün fiyatı : "+price);
        click(homePageElements.addToBasketButton);
        System.out.println("Sepete ekle butonuna tıklandı");
        click(homePageElements.basketIcon);
        System.out.println("Sepet butonuna tıklandı");
        return price;

    }
}
