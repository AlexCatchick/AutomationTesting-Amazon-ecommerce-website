package AEC_Software_Testing;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class AECProject {
    private static void switchToNewWindow(EdgeDriver driver) {
        Set<String> windowHandles = driver.getWindowHandles();
        for (String handle : windowHandles) {
            driver.switchTo().window(handle);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        EdgeDriver driver = new EdgeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String originalWindow = driver.getWindowHandle();
        Actions actions = new Actions(driver);

        driver.get("https://www.flipkart.com/");
        Thread.sleep(1000);
        WebElement searchBar = driver.findElement(By.className("Pke_EE"));
        searchBar.sendKeys("Natural Californian Almonds");
        searchBar.sendKeys(Keys.ENTER);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        js.executeScript("scrollBy(0,500)");
        Thread.sleep(1000);
        js.executeScript("arguments[0].click()", driver.findElement(By.linkText("Happilo Premium Natural Californian Almonds")));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        Thread.sleep(1000);
        switchToNewWindow(driver);
        js.executeScript("scrollBy(0,1400)");
        Thread.sleep(1000);
        try {
            driver.findElement(By.xpath("//button[@class='QqFHMw _4FgsLt']")).click();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("button[class='QqFHMw vslbG+ _3Yl67G _7Pd1Fp']")).click();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("input[type=text]")).sendKeys("1nt22cs013.adit@nmit.ac.in");
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("input[type=text]")).clear();
            Thread.sleep(1000);
            driver.navigate().back();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            Thread.sleep(1000);
            driver.navigate().forward();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            Thread.sleep(1000);
            driver.navigate().refresh();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        driver.close();
        driver.switchTo().window(originalWindow);
        Thread.sleep(1000);
        js.executeScript("scrollBy(0,4300)");
        Thread.sleep(1000);
        driver.findElement(By.linkText("2")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        Thread.sleep(1000);
        actions.click(driver.findElement(By.xpath("//div[@class='XqNaEv eJE9fb']"))).build().perform();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        Thread.sleep(1000);
        Select dropdown = new Select(driver.findElement(By.xpath("//select[@class='Gn+jFg']")));
        dropdown.selectByValue("2000");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[text()='Clear all']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        Thread.sleep(1000);
        driver.navigate().back();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.navigate().back();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.navigate().back();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.navigate().back();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.navigate().back();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[text()='✕']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        Thread.sleep(1000);
        driver.findElement(By.linkText("FAQ")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        Thread.sleep(1000);
        js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", driver.findElement(By.cssSelector("div[class='YF5puB IVjTZE']")));
        driver.executeScript("window.open('https://www.amazon.in/','_blank');");
        switchToNewWindow(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("[aria-label='Open All Categories Menu']")).click();
        Thread.sleep(1000);
        actions.click(driver.findElement(By.linkText("Customer Service"))).build().perform();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        Thread.sleep(1000);
        js.executeScript("scrollBy(0,5000)");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("[aria-label='Choose a language for shopping. Current selection is English. '][class='icp-button']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[text()='HI']")).click();
        Thread.sleep(1000);
        js.executeScript("arguments[0].click()", driver.findElement(By.xpath("//span[text()='प􀃥रवत􀂪न सहेज􀂤']")));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        Thread.sleep(2000);
        driver.navigate().back();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        Thread.sleep(1000);
        driver.navigate().back();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        Thread.sleep(1000);
        actions.moveToElement(driver.findElement(By.cssSelector("[aria-label='Choose a language for shopping. Current selection is English. '][class='icp-button']"))).perform();
        Thread.sleep(2000);
        js.executeScript("scrollBy(0,-5000)");
        Thread.sleep(2000);
        driver.navigate().back();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']")).sendKeys("Natural Californian Almonds");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']")).submit();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        Thread.sleep(2000);
        driver.navigate().back();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("[aria-label='Choose a language for shopping. Current selection is English. '][class='icp-button']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[text()='EN']")).click();
        Thread.sleep(1000);
        js.executeScript("arguments[0].click()", driver.findElement(By.xpath("//span[text()='Save Changes']")));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']")).sendKeys("Natural Californian Almonds");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']")).sendKeys(Keys.ENTER);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        Thread.sleep(1000);
        js.executeScript("arguments[0].value='50';", driver.findElement(By.id("p_36/rangeslider_slider-item_lower-bound-slider")));
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[class='a-button-input'][type='submit']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        Thread.sleep(2000);
        driver.navigate().back();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        Thread.sleep(2000);
        js.executeScript("arguments[0].click()", driver.findElement(By.xpath("//h2[@arialabel='Happilo 100% Natural Premium California Almonds 200 g Dried | Badam Giri | High in Fiber & Boost Immunity | Real Nuts | Gluten Free & Zero Cholesterol']")));
        switchToNewWindow(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        Thread.sleep(1000);
        js.executeScript("scrollBy(0,300)");
        Thread.sleep(1000);
        try {
            driver.findElement(By.id("buy-now-button")).click();
            driver.findElement(By.cssSelector("input[type=email]")).sendKeys("1nt22cs013.adit@nmit.ac.in");
            Thread.sleep(1000);
            driver.findElement(By.id("continue")).click();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            Thread.sleep(2000);
        } catch (Exception e) {
        }
        driver.quit();
    }
}