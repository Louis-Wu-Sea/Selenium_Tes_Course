import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.Set;

public class FirstTest {

    @Test
    public void TestSearchGoogle(){
       System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com/222");
//        WebElement searchBox = driver.findElement(By.name("q"));
//        searchBox.sendKeys("ChromeDriver");
//        searchBox.submit();
//        //driver.quit();

        Set<String> allLogsType =  driver.manage().logs().getAvailableLogTypes();
        System.out.println("allLogsType ->" + allLogsType);

        LogEntries logs = driver.manage().logs().get(LogType.BROWSER);
        for (
                LogEntry entry: logs
        )
        System.out.println("logs -> " + entry);
    }
}
