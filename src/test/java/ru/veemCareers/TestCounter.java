package ru.veemCareers;

import java.util.List;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class TestCounter {

    @Test
    public void firstTest() {

        System.setProperty("webdriver.chrome.driver", "/Users/leshalotos/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        //driver.manage().window().maximaze();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://careers.veeam.ru/vacancies");

        List <WebElement> selectSelect = driver.findElements(By.id("sl"));

        selectSelect.get(0).click();

        WebElement raproinMenu  = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[1]/div/div[2]/div/div/div/a[2]"));

        raproinMenu.click();

        selectSelect.get(1).click();

        driver.findElement(By.xpath("//*[@id=\"lang-option-1\"]")).click();

        List <WebElement> countVacancy = driver.findElements(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[2]/div/a"));

        System.out.println(countVacancy.size());

        driver.quit();
    }
}
