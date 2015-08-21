import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.*;

/**
 * Created by 945GCM on 11.8.2015 ã..
 */
public class MuhomorkaLoginTest {
    private WebDriver selenium;

    @Before

    public void setUp() {
        selenium = new FirefoxDriver();

    }

    @Test

    public  void cartPurchases() {
        selenium.get("http://mitove-i-legendi.net/Muhomorka.bg/");
        WebElement storeButton = selenium.findElement(By.xpath("/html/body/div[1]/div/div/div/header/div[2]/nav/div/ul/li[4]/a"));
        storeButton.click();
        assertEquals("http://mitove-i-legendi.net/Muhomorka.bg/shop/", selenium.getCurrentUrl());

        WebElement gamesButton = selenium.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/aside[2]/ul/li[7]/a"));
        gamesButton.click();

        WebElement marbleChess = selenium.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div/div/ul/li[1]/a[1]/img"));
        marbleChess.click();

        WebElement pressBuyButton = selenium.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div/div/div/div[2]/form/button"));
        pressBuyButton.click();

        WebElement cart = selenium.findElement(By.xpath("/html/body/div[1]/div/div/div/header/div[2]/div/a/span"));
        cart.click();

        assertEquals("http://mitove-i-legendi.net/Muhomorka.bg/%d0%ba%d0%be%d1%88%d0%bd%d0%b8%d1%86%d0%b0/", selenium.getCurrentUrl());

        WebElement purchaseButton = selenium.findElement(By.xpath("/html/body/div[2]/div/div/div/div/article/div/div/form/table/tbody/tr[2]/td/input[2]"));
        purchaseButton.click();

        WebElement login = selenium.findElement(By.xpath("/html/body/div[2]/div/div/div/div/article/div/div/div/a"));
        login.click();

        WebElement usernameField = selenium.findElement(By.id("username"));
        WebElement passwordField = selenium.findElement(By.id("password"));

        usernameField.clear();
        usernameField.sendKeys("mitrakov87");

        passwordField.clear();
        passwordField.sendKeys("muhomorkatest");

        WebElement loginButton = selenium.findElement(By.xpath("/html/body/div[2]/div/div/div/div/article/div/div/form[1]/p[4]/input[3]"));
        loginButton.click();

        WebElement purchaseFinalButton = selenium.findElement(By.xpath("/html/body/div[2]/div/div/div/div/article/div/div/form/div[2]/div/div[1]/input[3]"));
        //purchaseFinalButton.click();

    }



    @After
    public void tearDown() {
        //selenium.quit();
    }
}
