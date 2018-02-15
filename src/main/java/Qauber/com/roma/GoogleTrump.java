package Qauber.com.roma;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTrump {
    public static void main(String[] args) throws InterruptedException {
                System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
                WebDriver cd = new ChromeDriver();
                cd.manage().window().maximize();
                cd.get("https://www.google.com/");
                Thread.sleep(3000);
                cd.findElement(By.xpath("//*[@id=\"lst-ib\"]")).sendKeys("Ivanka Trump");
                Thread.sleep(2000);
                cd.findElement(By.xpath("//*[@id=\"lst-ib\"]")).submit();
                Thread.sleep(3000);
                System.out.println(cd.findElement(By.xpath("//*[@id=\"resultStats\"]")).getText());
            }
        }

