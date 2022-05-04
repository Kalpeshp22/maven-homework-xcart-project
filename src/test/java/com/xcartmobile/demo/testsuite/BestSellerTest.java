package com.xcartmobile.demo.testsuite;

import com.xcartmobile.demo.pages.BestSellerPage;
import com.xcartmobile.demo.pages.ShoppingCartPage;
import com.xcartmobile.demo.testbase.TestBase;
import org.testng.annotations.Test;

public class BestSellerTest extends TestBase {
    BestSellerPage bestSellersPage = new BestSellerPage();
    ShoppingCartPage shoppingCartPage =new ShoppingCartPage();


    @Test
    public void verifyThatUserShouldClearShoppingCartSuccessfully() throws InterruptedException {
        bestSellersPage.clickOnBestSellers();
        bestSellersPage.verifyBestSellerTxt();
        bestSellersPage.selectAToZ();
        bestSellersPage.addProductToCart();
        bestSellersPage.verifyProductAddedMSg();
        bestSellersPage.clickOnXBtn();
        bestSellersPage.clickOnYourCart();
        bestSellersPage.clickOnViewCart();

        shoppingCartPage.verifyShoppingCartMSg();
        shoppingCartPage.clickOnEmptyCart();
        shoppingCartPage.verifyAlertMSg();
        shoppingCartPage.verifyIfItemsDeleted();
        shoppingCartPage.verifyIfCartIsEmpty();

    }
}

