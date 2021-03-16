package ru.veemCareers;

import java.util.*;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class TestCounter {

    @Test
    public void firstTest() {

        System.setProperty("webdriver.chrome.driver", "/Users/leshalotos/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        // driver.manage().window().maximaze();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://careers.veeam.ru/vacancies");

        List <WebElement> selectSelect = driver.findElements(By.id("sl"));

        //System.out.println(selectSelect.size());

        Select selectVacancy = new Select(selectSelect.get(0));

        selectVacancy.selectByVisibleText("Разработка продуктов");

        Select selectLanguage = new Select(selectSelect.get(1));

        selectLanguage.selectByVisibleText("Английский");

        List <WebElement> countVacancy = driver.findElements(By.className("card card-no-hover card-sm"));

        // System.out.println(countVacancy.size());

        driver.quit();
    }
}
