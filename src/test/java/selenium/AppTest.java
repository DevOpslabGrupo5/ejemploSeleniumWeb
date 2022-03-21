package selenium;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Unit test for simple App.
 */
public class AppTest {

  private WebDriver dr

    @Before

      Syste
      System.setProperty(
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless", "--disable-gpu", "--window-size=192
            "--disable-extensions", "--no-sandbox", 
        driver = new ChromeDriver(options);
                er.manage().window().maximize();
        System.out.println(driver.getCurren
        System.out.println(driver.getTitle());
        
        
        est
        blic void TestCrearUsuario() {
     

      ;
      driver.manage().window().maxim
        driver.get("http://automationpractice.c
        driver.manage().window().setSize(new Dimension(1480, 885));
        d
        driver.findElement(By.cssSelector("#
        driver.findElement(By.id("email_create")).click();
        driver.findElement(By.id("email_create")).sendKeys(mailNuev
        driver.findElement(By.cssSelector("#SubmitCreate > 
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("id_gender2")).click();
        driver.findElement(By.id("customer_firstname")).click();
        driver.findElement(By.id("customer_firstname")).sendKeys("GrupoCinc
        driver.findElement(By.id("customer_lastname")).click();
        
        driver.findElement(By.id("customer_lastname")).sendKeys(
        driver.findElement(By.id("passwd")).click();
        driver.findElement(By.id("passwd")).sendKeys("123456789

        {
          WebDriverWait wait = new WebDriverWait(dri
          wait.until(ExpectedConditions.presenceOfElementLocated(B
        }
        /
            iver.findElement(By.id("days")).click();
            
         
          dropdown.findElement(By.xpa
        }
        /
            iver.findElement(By.id("months")).click();
            
         
          // Select the option by ind
          se.selectByIndex(3);
        }
             se elige anio de nacimiento
            
            WebDriverWait wait =
         
        }
        d
            
            WebElement dropdown = driver.findElement(By.id("years"));
         
        }
        /
            
            iver.findElement(By.cssSelector("#years > option:nth-c
        d
        driver.findElement(By.id("company")

        driver.findElement(By.id("address1")).sendKeys("Santiago, Chile");
        driver.findElement(By.id("city")).click();
        driver.findElement(By.id("city")).sendKeys("S
        driver.findElement(By.cssSelector(".is_custome
        driver.findElement(By.id("id_state")).click();
        {
          WebElement dropdown = driver.findElement(By.id("id_st
          dropdown.findElement(By.xpath("//option[. = 'Kentucky']")).clic
        }
        d
            iver.findElement(By.id("postcode")).click();
            iver.findElement(By.id("postcode")).sendKeys("12345");
        d
        driver.findElement(By.id("id_country")).click();
        driver.findElement(By.cssSelector("#id_country
        driver.findElement(By.id("other")).click();
        driver.findElement(By.id("other")).sendKeys("Dejar en porteria");
        driver.findElement(By.id("phone")).click();
        driver.findElement(By.id("phone_mobile")).click();
        driver.findElement(By.id("phone_mobile")).s
        driver.findElement(By.cssSelector("#submitAccount .icon-chevron-r
        driver.findElement(By.xpath("(//a[contains(
        // eleccion de producto
        WebDriverWait wait = new WebDriverWait(driver, 20);
        WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpat
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", ele);
        // cambiar la cantidad
        driver.findElement(By.id("quantity_wanted")).click(
        driver.findElement(By
                .id("quantity_wanted")).clear();
        driver.findElement(By.id("quantity_wanted")).sendKeys("3");
        // Agregar al carro
        driver.findElement(By.xpath("//p[@id='add_to_cart']//
        
        /// Boton proceed to checkout
        wait = new WebDrive
        WebElement ele2 = wait

        ((JavascriptExecutor) driver)
        
        driver.findElement(By.
                er.findElement(By.cssSelector(".button:nth-child(4) > span")).click();
        driver.findElement(By.id("cgv")).click();

        driver.findElement(By.cssSelector(".bankwire > span")).click();
        driver.findElement(By.cssSelector("#cart_navigation span")).click();
        
        assertTrue(driver.getTitle().contains("Order confirmation - My Store"));
        driver.close();
        driver.quit();

        
        est
        blic void Test
     

    
      driver.findElement(By.lin
        driver.manage().timeouts().implicitl
        driver.findElement(By.id("email")).click();

        driver.findElement(By.id("login_form")).click();
        driver.findElement(By.id("passwd")).click();
        driver.findElement(By.id("passwd")).sendKey
        driver.findElement(By.cssSelector("#SubmitLogin > span")).click();
        driver.manage().timeouts().implicitlyWait(5, Tim
        driver.findElement(By.xpath("(//a[contains(t
        // eleccion de producto
        WebDriverWait wait = new WebDriverWait(driver, 20);
        WebElement ele = wait.until(ExpectedConditions.visibilityOfElem
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", ele);
        // cambiar la cantidad
        driver.findElement(By.id("quantity_wanted")).click(
        driver.findElement(By
                .id("quantity_wanted")).clear();
        driver.findElement(By.id("quantity_wanted")).sendKeys("2");
        // Agregar al carro
        driver.findElement(By.xpath("//p[@id='add_to_cart']//
        
        /// Boton proceed to checkout
        wait = new WebDrive
        WebElement ele2 = wait

        ((JavascriptExecutor) driver)
        
        driver.findElement(By.
                er.findElement(By.cssSelector(".button:nth-child(4) > span")).click();
        driver.findElement(By.id("cgv")).click();

        driver.findElement(By.cssSelector(".bankwire > span")).click();
        driver.findElement(By.cssSelector("#cart_navigation span")).click();
        assertTrue(driver.getTitle().contains("Or
        driver.close();
        driver.quit();
        
        
        
        
    