import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class WorkWithMainPage {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriverL.exe");


// a.Opening site
        WebDriver driver = new ChromeDriver();
    driver.get("https://www.rw.by/");
//b.Change language
    Thread.sleep(1000);
    driver.findElement(By.xpath("//div[@class='top-lang__item']//a[@href='/en/']")).click();

// c.Check, that not less than 4 news are displayed into the “News” section:
    Thread.sleep(1000); //тут привязался не к новости, а ее дате
    int newsNum = driver.findElements(By.xpath("//div[@class='index-news-list-wrap']//dd"))
            .size();
    Assert.assertTrue(4 <= newsNum);

//d.Check, that text “© 2019 Belarusian Railway” is displayed in the bottom of the page

    Assert.assertTrue(driver.findElements(By.xpath("//div[@class='copyright']")).size() > 0);


//e.Check, that 5 buttons are present in the top part of the page: “Press Center”, “Tickets”, “Passenger Services”, “Freight”, “Corporate”
    Assert.assertTrue(driver.findElements(By.xpath("//div[@class='menu-items-wrap']//em//u//b[text()='Contacts']")).size() > 0);
    Assert.assertTrue(driver.findElements(By.xpath("//div[@class='menu-items-wrap']//em//u//b[text()='Passenger Services']")).size() > 0);
    Assert.assertTrue(driver.findElements(By.xpath("//div[@class='menu-items-wrap']//em//u//b[text()='Press center']")).size() > 0);
    Assert.assertTrue(driver.findElements(By.xpath("//div[@class='menu-items-wrap']//em//u//b[text()='Freight']")).size() > 0);
    Assert.assertTrue(driver.findElements(By.xpath("//div[@class='menu-items-wrap']//em//u//b[text()='Corporate']")).size() > 0);

}
    }
