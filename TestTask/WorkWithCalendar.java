import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;


public class WorkWithCalendar {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriverL.exe");
        WebDriver driver = new ChromeDriver();
//        Open site
        driver.get("https://www.rw.by/");

//        b. Type in “Откуда” and “Куда” some valid locations’ names
        WebElement from = driver.findElement(By.xpath("//input[@id='acFrom']"));
        from.click();
        from.sendKeys("Брест");

        WebElement to = driver.findElement(By.xpath("//input[@id='acTo']"));
        to.click();
        to.sendKeys("Минск");

//        c. Click on calendar button, and select date == 5 days from today.
        Calendar date = new GregorianCalendar();
        date.add(Calendar.DAY_OF_MONTH, 5);

        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        WebElement dateField = driver.findElement(By.xpath("//input[@class='type-text datepicker-popup hasDatepicker']"));
        dateField.click();
        dateField.sendKeys(dateFormat.format(date.getTime()), Keys.ENTER);
        dateField.sendKeys(Keys.ENTER);

//       i. Date should be selected even in case it is last day of the month – e.g. in case you are running your test on 29 th of
//        September, it should select 4 th of October, etc.
//                a. Click on “Найти”
        WebElement searchButton = driver.findElement(By.xpath("//input[@type='submit']"));
        searchButton.click();

//                 b. Write to the console departure time and trains name
        WebElement openTrain = driver.findElement(By.xpath("//span[@class='train-route']"));
        List<WebElement> train = driver.findElements(By.xpath("//span[@class='train-route']"));
        List<WebElement> time = driver.findElements(By.xpath("//div[@class='sch-table__time train-from-time']"));
        for ( WebElement trainName: train) {

        for ( WebElement trainTime: time) {

            System.out.println(trainName.getText() + "-" + trainTime.getText());
        }
        }
//        a. Click on the first link
        openTrain.click();
//        b. Check that name of train is displayed on a page.
        WebElement name = driver.findElement(By.xpath("//div[@class='sch-title__title h2']"));
        Boolean namePresent = driver.findElements(By.xpath("//div[@class='sch-title__title h2']")).size() > 0;

//        c. Check that text under the text “Дни курсирования” is not empty
        Boolean modePresent = driver.findElements(By.xpath("//div[@class='sch-title__descr']")).size() > 0;
//        d. Return to the main page of site by clicking on the site’s logo
        WebElement logo = driver.findElement(By.xpath("//span[@class='pic-wrap']"));
        logo.click();

    }
}
