import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class SearchInGoogle {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriverL.exe");
        WebDriver driver = new ChromeDriver();

// 1.Opening site from google
        driver.get("https://www.google.com");

        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("белорусская железная дорога", Keys.ENTER);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[text()='https://www.rw.by']")).click();


    }
}



