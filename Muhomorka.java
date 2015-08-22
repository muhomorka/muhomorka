import org.apache.xpath.operations.Equals;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.assertEquals;

/**
 * Created by tapetkov on 8/14/15.
 */
public class Muhomorka {

    private WebDriver selenium;

    @Before

    public void setUp() {
        selenium = new FirefoxDriver();
    }

    @Test

    public void partMuhomorka() {
        selenium.get("http://mitove-i-legendi.net/Muhomorka.bg/");
        WebElement muhomorka = selenium.findElement(By.xpath("/html/body/div[1]/div/div/div/header/div[2]/nav/div/ul/li[2]/a"));

        muhomorka.click();

        assertEquals("http://mitove-i-legendi.net/Muhomorka.bg/%d0%b7%d0%b0-%d0%bd%d0%b0%d1%81-2/", selenium.getCurrentUrl());

        WebElement shopSofia = selenium.findElement(By.xpath("/ html/body/div[2]/div/div/div/div/article/div/div[3]/div[1]/div[2]/div[2]/blockquote/em/strong/a"));

        shopSofia.click();
        assertEquals("http://mitove-i-legendi.net/Muhomorka.bg/%D1%81%D0%BD%D0%B8%D0%BC%D0%BA%D0%B8-%D0%BE%D1%82-%D0%BC%D0%B0%D0%B3%D0%B0%D0%B7%D0%B8%D0%BD%D0%B0-%D0%BD%D0%B8-%D0%B2-%D1%81%D0%BE%D1%84%D0%B8%D1%8F/",selenium.getCurrentUrl());
        WebElement back = selenium.findElement(By.xpath("/ html/body/div[2]/div/div/div/div/article/div/h3/a"));

        back.click();
        assertEquals("http://mitove-i-legendi.net/Muhomorka.bg/%d0%b7%d0%b0-%d0%bd%d0%b0%d1%81-2/", selenium.getCurrentUrl());


        WebElement shopNesebur = selenium.findElement(By.xpath("/ html/body/div[2]/div/div/div/div/article/div/div[3]/div[2]/div[2]/div[2]/blockquote/em/strong/a"));

        shopNesebur.click();
        assertEquals("http://mitove-i-legendi.net/Muhomorka.bg/%D1%81%D0%BD%D0%B8%D0%BC%D0%BA%D0%B8-%D0%BE%D1%82-%D0%BC%D0%B0%D0%B3%D0%B0%D0%B7%D0%B8%D0%BD%D0%B0-%D0%B2-%D0%BD%D0%B5%D1%81%D0%B5%D0%B1%D1%8A%D1%80/", selenium.getCurrentUrl());
    }

        @After

                public void close ()
        {
            selenium.close();

        }


    }
