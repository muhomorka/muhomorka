import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.assertEquals;


/**
 * Created by tapetkov on 8/13/15.
 */
public class MuhomorkaTestContact {

    private WebDriver selenium;


    @Before

    public void setUp (){
selenium = new FirefoxDriver();

    }
    @Test

    public void TestEmail () {

        selenium.get("http://mitove-i-legendi.net/Muhomorka.bg/");
        WebElement facebook = selenium.findElement(By.className("facebook"));

        facebook.click();

        assertEquals("https://www.facebook.com/shrooms.bg", selenium.getCurrentUrl());

        // Here I have to put command for close to new window.

        selenium.get("http://mitove-i-legendi.net/Muhomorka.bg/");
     WebElement email = selenium.findElement(By.className("email"));

     email.click();

        // Here I have to put command for close to new window.
    }


    //@After

    public void CloseAll ()
        {
selenium.close();

    }
}
