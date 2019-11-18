/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author fabricio
 */
public class LoginTestDriver {


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

        String NOME = driver.findElement(By.id("p01")).getText();
        assertEquals("Nome usuário:fabricio", NOME);

        Thread.sleep(5000);

        String SENHA = driver.findElement(By.id("p02")).getText();
        assertTrue(SENHA.equals("Senha: 123"));
        
        System.out.println(SENHA);
        
        Thread.sleep(5000);

        String IDADE = driver.findElement(By.id("p03")).getText();
        assertEquals("Idade:39", IDADE);

        System.out.println(SENHA);

        Thread.sleep(5000);

        String ALTURA = driver.findElement(By.id("p04")).getText();
        assertEquals("Altura:1.81", ALTURA);

        System.out.println(SENHA);

        Thread.sleep(5000);

        // driver.quit();
    }

    
    // @Test
    // public String checkInformation() {
        
    //     System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");    
    //     WebDriver driver = new ChromeDriver();
    //     driver.get("http://localhost:8080/testing_tools_selenium_wd/");
            
    //     String SENHA = driver.findElement(By.id("p02")).getText();
    //     assertTrue(SENHA.equals("Senha: 123"));

    //     System.out.println("Senha: 123");

    //     return SENHA;

    // }
}


// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(), 'YourTextHere')]")));
    // assertNotNull(driver.findElement(By.xpath("//*[contains(text(), 'YourTextHere')]")));
    // String yourButtonName=driver.findElement(By.xpath("//*[contains(text(), 'YourTextHere')]")).getAttribute("innerText");
    // assertTrue(yourButtonName.equalsIgnoreCase("YourTextHere"));
