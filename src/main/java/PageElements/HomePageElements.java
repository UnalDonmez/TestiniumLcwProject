package PageElements;

import org.openqa.selenium.By;

public class HomePageElements {

    public By basketIcon = By.xpath("//*[@href='https://www.lcwaikiki.com/tr-TR/TR/sepetim']");
    public By homePageContainer = By.xpath("//*[@class='container-fluid homepage-container']");
    public By searchInput = By.xpath("//*[@id='search_input']");
    public By searchButton = By.xpath("//*[@class='searchButton']");
    public By showMoreButton = By.xpath("//*[@class='lazy-load-button']");
    public By products = By.xpath("//*[@class='product-lazy-image  lazyloaded']");
    public By selectSize = By.xpath("//*[@data-tracking-label='BedenSecenekleri']");
    public By selectHeight = By.xpath("//*[@data-tracking-label='BoySecenekleri']");
    public By addToBasketButton = By.xpath("//*[@data-tracking-label='SepeteEkle']");
    public By productPriceDiscount = By.xpath("//*[@class='basket-discount']");
}
