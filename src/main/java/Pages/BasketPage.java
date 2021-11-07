package Pages;

import Abstract.AbstractBase;
import PageElements.BasketPageElements;
import org.openqa.selenium.WebDriver;
import org.apache.log4j.Logger;

public class BasketPage extends AbstractBase
{
    static Logger log = Logger.getLogger(HomePage.class);
    BasketPageElements basketPageElements = new BasketPageElements();
    public BasketPage(WebDriver driver) {
        super(driver);
    }

    public void basketPageControl() {
        find(basketPageElements.basketPageContainer);
        System.out.println("Sepet sayfasının açıldığı görüldü");
    }

    public void comparePrices(String price) {
          String totalPrice = getText(basketPageElements.basketTotalPrice);
          System.out.println("Toplam fiyat: "+totalPrice);
          if(totalPrice.contains(price)){
              System.out.println("Fiyatlar eşleşti");
          }else{
              System.out.println("Fiyatlar eşleşmedi");
          }
          click(basketPageElements.addProductCount);
          System.out.println("Ürün miktarı 1 arttırıldı");
          if(getText(basketPageElements.productCount) == "2"){
              System.out.println("Sepetteki ürün miktarı 2 olduğu görüldü");
          }else{
              System.out.println("Sepetteki ürün miktarı 2 olduğu görülmedi");
          }
          click(basketPageElements.productTrachIcon);
          System.out.println("Sepet boşaltma butonuna tıklandı");
          click(basketPageElements.productApproveDeleteButton);
          System.out.println("Silmeyi onaylama butonuna tıklandı");
          if(isDisplayed(basketPageElements.emptyBasket)){
              System.out.println("Sepetin boş olduğu görüldü");
          }else{
              System.out.println("Sepet boş değil");
          }

    }
}
