package com.Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class BrowserConfig {
    public static WebDriver driver; //driver=reference variable ; webDriver=interface

    public static void main(String[] args) throws InterruptedException {
        chromeLaunch();
        pothomalo();
        smallWait();
        chromeClose();
        firefoxLaunch();
        pothomalo();
        smallWait();
        firefoxClose();
        operaLaunch();
        pothomalo();
        smallWait();
        operaClose();
        msEdge();
        pothomalo();
        smallWait();
        msEdgeClose();
    }

    public static void chromeLaunch(){
        //Browser Launch (Chrome)
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe"); //2 argument = key , value
        driver = new ChromeDriver(); //ChromeDriver=interface

    }
    public static void firefoxLaunch(){
        //Browser Launch (FireFox)
        System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe"); //2 argument = key , value
        driver = new FirefoxDriver(); //firefoxDriver=interface
    }

    public static void operaLaunch(){
        //Browser Launch (Opera)
        System.setProperty("webdriver.opera.driver", "src/main/resources/operadriver.exe"); //2 argument = key , value
        driver = new OperaDriver(); //firefoxDriver=interface

    }
    public static void msEdge(){
        //Browser Launch (msedge)
        System.setProperty("webdriver.edge.driver", "src/main/resources/msedgedriver.exe"); //2 argument = key , value
        driver = new EdgeDriver(); //firefoxDriver=interface
    }

    public static void chromeClose(){
        driver.close();
    }
    public static void firefoxClose(){
        driver.close();
    }
    public static void operaClose(){
        driver.close();
    }
    public static void msEdgeClose(){
        driver.close();
    }

    public static void pothomalo(){
        driver.get("https://www.prothomalo.com/");
    }

    public static void smallWait() throws InterruptedException {
        Thread.sleep(3000);
    }


}
