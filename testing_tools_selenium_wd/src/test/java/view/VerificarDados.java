package view;

// import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerificarDados{


@Test
public String checkInformation() {
    
    System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");    
    WebDriver driver = new ChromeDriver();
    driver.get("http://localhost:8080/testing_tools_selenium_wd/");
        
    String SENHA = driver.findElement(By.id("p02")).getText();
    assertTrue(SENHA.equals("Senha: 123"));

    System.out.println("Senha: 123");

    return SENHA;

    }   
}

