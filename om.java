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
public class Om {



        private WebDriver selenium;

        @Before

        public void setUp() {
            selenium = new FirefoxDriver();
        }

        @Test

        public void partMuhomorka() {
            selenium.get("http://mitove-i-legendi.net/Muhomorka.bg/");
            WebElement om = selenium.findElement(By.xpath("/html/body/div[1]/div/div/div/header/div[2]/nav/div/ul/li[1]/a"));

            om.click();

            assertEquals("http://mitove-i-legendi.net/Muhomorka.bg/", selenium.getCurrentUrl());

            WebElement india = selenium.findElement(By.xpath("/html/body/div[3]/div/div/div/div/article/div/p[2]/a[1]"));

            india.click();
            assertEquals("http://mitove-i-legendi.net/Muhomorka.bg/%D0%B5%D1%82%D0%B8%D0%BA%D0%B5%D1%82/%D0%B8%D0%BD%D0%B4%D0%B8%D1%8F/", selenium.getCurrentUrl());

          // The field search in this doesn't work.

          //WebElement search = selenium.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/aside[1]/form/input[1]"));

          //search.clear();
          //search.sendKeys("?????");

          //WebElement find = selenium.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/aside[1]/form/input[1]"))

            // find.click();

            WebElement backToShop = selenium.findElement(By.className("home"));
            backToShop.click();
            assertEquals("http://mitove-i-legendi.net/Muhomorka.bg/", selenium.getCurrentUrl());

            WebElement nepal = selenium.findElement(By.xpath("/html/body/div[3]/div/div/div/div/article/div/p[2]/a[2]"));

            nepal.click();
            assertEquals("http://mitove-i-legendi.net/Muhomorka.bg/%D0%B5%D1%82%D0%B8%D0%BA%D0%B5%D1%82/%D0%BD%D0%B5%D0%BF%D0%B0%D0%BB/", selenium.getCurrentUrl());

        }

        @After

        public void close ()
        {
            selenium.close();

        }


    }
