import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.junit.Test;

import java.util.List;

public class SeleniumOrnek {

    @Test
    public void seleniumOrnek(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.gittigidiyor.com");

        List<WebElement> ekrandakiDivNesnleri = driver.findElements(By.xpath("//div"));

        for (WebElement eleman: ekrandakiDivNesnleri) {
            System.out.println(eleman.getText());
        }

        driver.quit();

    }

}
