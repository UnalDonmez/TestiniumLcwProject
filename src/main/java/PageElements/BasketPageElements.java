package PageElements;

import org.openqa.selenium.By;

public class BasketPageElements {
    public By basketPageContainer = By.xpath("//*[@class='products-area']");
    public By basketIcon = By.xpath("//*[@href='https://www.lcwaikiki.com/tr-TR/TR/sepetim']");
    public By basketTotalPrice = By.xpath("//*[@class='row grand-total mt-10 mb-10']");
    public By addProductCount = By.xpath("//*[@class='oq-up plus']");
    public By productCount = By.xpath("//*[@class='item-quantity-input ignored']");
    public By productTrachIcon = By.xpath("//*[@class='fa fa-trash-o']");
    public By productApproveDeleteButton = By.xpath("//*[@class='inverted-modal-button sc-delete ins-init-condition-tracking']");
    public By emptyBasket = By.xpath("//*[@class='cart-empty-title']");
}
