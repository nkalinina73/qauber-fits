package Wave_Departmens;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpWindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Natalia\\Documents\\selenium-java-3.8.1\\chromedriver_win32\\chromedriver.exe");
        WebDriver wave = new ChromeDriver();
        wave.get("http://fits.qauber.com/#/page/login");
        wave.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
          
        wave.findElement(By.xpath("//*[@id=\"exampleInputEmail1\"]")).sendKeys("nkalinina73@live.com"); 
       
        wave.findElement(By.xpath("//*[@id=\"exampleInputPassword1\"]")).sendKeys("qwe123"); 
        wave.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     
        Thread.sleep(2000);
        
        wave.findElement(By.xpath("//button[@class='btn btn-block btn-primary mt-lg']")).click();
        
        wave.findElement(By.xpath("/html/body/div[2]/aside[1]/div/nav/ul/li[2]/a/span")).click();
        
        wave.findElement(By.xpath("/html/body/div[2]/section/div/div/div/div/table/tbody/tr[2]/td[1]/div/div[1]/a")).click();
        
        wave.findElement(By.xpath("/html/body/div[2]/section/div/h3/button")).click();

	}

}
