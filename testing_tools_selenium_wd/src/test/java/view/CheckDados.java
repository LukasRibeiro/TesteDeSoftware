/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Constructor;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author fabricio
 */
public class CheckDados {
    
    // System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");    
    // WebDriver driver = new ChromeDriver();
    // driver.get("http://localhost:8080/testing_tools_selenium_wd/");

    @Test
    public void testLogin() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");    
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:8080/testing_tools_selenium_wd/");
        
        Thread.sleep(5000);

        WebElement nomeUsuario = driver.findElement(By.id("nomeUsuario"));
        nomeUsuario.sendKeys("fabricio");
        
        Thread.sleep(5000);

        WebElement senha = driver.findElement(By.id("senha"));
        senha.sendKeys("123");

        Thread.sleep(5000);

        WebElement bt = driver.findElement(By.id("botao"));
        bt.click();

        Thread.sleep(5000);

// ==========================VALIDANDO TEXTOS NA AUTENTICAÇÃO=================================================

        String NOME = driver.findElement(By.id("p01")).getText();
        assertTrue(NOME.equals("Nome usuario:fabricio"));

        System.out.println(NOME);

        Thread.sleep(5000);

        

        String SENHA = driver.findElement(By.id("p02")).getText();
        assertTrue(SENHA.equals("Senha: 123"));
        
        System.out.println(SENHA);
        
        Thread.sleep(5000);



        String IDADE = driver.findElement(By.id("p03")).getText();
        assertTrue(IDADE.equals("Idade:39"));

        System.out.println(IDADE);

        Thread.sleep(5000);

        

        String ALTURA = driver.findElement(By.id("p04")).getText();
        assertTrue(ALTURA.equals("Altura:1.81"));

        System.out.println(ALTURA);

        Thread.sleep(5000);

        driver.quit();
    }

}


// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(), 'YourTextHere')]")));
    // assertNotNull(driver.findElement(By.xpath("//*[contains(text(), 'YourTextHere')]")));
    // String yourButtonName=driver.findElement(By.xpath("//*[contains(text(), 'YourTextHere')]")).getAttribute("innerText");
    // assertTrue(yourButtonName.equalsIgnoreCase("YourTextHere"));
