package com.xcartmobile.demo.testsuite;

import com.xcartmobile.demo.pages.BestSellerPage;
import com.xcartmobile.demo.pages.SalesPage;
import com.xcartmobile.demo.testbase.TestBase;
import org.testng.annotations.Test;

public class HotDealsTest extends TestBase {
    SalesPage salePage = new SalesPage();
    BestSellerPage bestSellersPage=new BestSellerPage();

    @Test
    public void verifySaleProductsArrangeAlphabetically() {
        salePage.navigateToSales();
        salePage.verifySaleTxt();
        salePage.sortAToZ();
        salePage.verifyAToZ();
    }
    @Test
    public void verifySaleProductsPriceArrangeLowToHigh() {
        salePage.navigateToSales();
        salePage.verifySaleTxt();
        salePage.selectLowToHigh();
        salePage.verifyLowToHigh();
    }
    @Test
    public void verifyBestSellersProductsArrangeByZToA() throws InterruptedException {
        bestSellersPage.clickOnBestSellers();
        bestSellersPage.verifyBestSellerTxt();
        bestSellersPage.selectZToA();
        Thread.sleep(2000);
        bestSellersPage.verifyZToA();
    }

    @Test
    public void verifyBestSellersProductsPriceArrangeHighToLow() throws InterruptedException {
        bestSellersPage.clickOnBestSellers();
        bestSellersPage.verifyBestSellerTxt();
        bestSellersPage.selectHighToLow();
        Thread.sleep(2000);
        bestSellersPage.verifyHighToLow();
    }
    @Test
    public void verifyBestSellersProductsArrangeByRates() throws InterruptedException {
        bestSellersPage.clickOnBestSellers();
        bestSellersPage.verifyBestSellerTxt();
        bestSellersPage.selectRates();
        Thread.sleep(2000);
        bestSellersPage.verifyRates();

    }
    @Test
    public void vefirySalesProductsArrangedByRates() throws InterruptedException {
        salePage.navigateToSales();
        salePage.verifySaleTxt();
        salePage.selectRates();
        Thread.sleep(2000);
        salePage.verifyRates();
    }


}
