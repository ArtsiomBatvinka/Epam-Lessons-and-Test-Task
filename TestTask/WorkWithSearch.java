import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class WorkWithSearch {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriverL.exe");
        WebDriver driver = new ChromeDriver();

//    a.Open site
        driver.get("https://www.rw.by/");
//    b. Type in “Поиск” input 20 random symbols (they should be different for each execution).
        WebElement searchField1 = driver.findElement(By.xpath("//input[@class='example gray']"));
        String ran = new Random().ints(20, 65, 90)
                .mapToObj(i -> String.valueOf((char) i)).collect(Collectors.joining());
        searchField1.sendKeys(ran, Keys.ENTER);
        System.out.println("Search request is: " + ran);

//    c. Check, that address in browser changed to the https://www.rw.by/search/?s=Y&q=<your text>;
      Thread.sleep(1000);
      driver.getCurrentUrl().equals("https://www.rw.by/search/?s=Y&q=" + ran);

//    d. Check, that text “К сожалению, на ваш поисковый запрос ничего не найдено.” is displayed on a page
        Assert.assertTrue(driver.findElements(By
                .xpath("//*[text()='К сожалению, на ваш поисковый запрос ничего не найдено.']"))
                .size() > 0);

//    e. Clear entered on step b value from the corresponding input, and enter “Санкт-Петербург” instead and click enter



        driver.findElement(By.xpath("//input[@id='searchinpm']")).clear();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='searchinpm']"))
                .sendKeys("Санкт-Петербург", Keys.ENTER);

//    g. Check, that 15 links to the articles are displayed on a screen
        int resultNum = driver.findElements(By.xpath("//ol[@class='search-result']//li")).size();
        Assert.assertTrue(15 == resultNum);

//   // h. Write into the console text from that links
        List<WebElement> res = driver.findElements(By.xpath("//ol[@class='search-result']//li//h3"));

        for ( WebElement we: res) {
            System.out.println(we.getText());
        }
        }
    }
