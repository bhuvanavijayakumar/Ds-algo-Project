package com.dsalgo.qa.base;

import com.dsalgo.qa.utilities.TestUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {
    public static WebDriver driver;
   public static Properties prop;

    public TestBase() {
        try {

            prop = new Properties(); //to read and access a properties file

            FileInputStream ip = new FileInputStream(System.getProperty("/Codebase/Ds_Algo_Project/src/main/java/com/dsalgo" + "/qa/config/config.properties"));// To read the file and set the path of the properties file
            prop.load(ip);
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void initialization() {
        String browserName = prop.getProperty("browser");
        browserName.equals("chrome");

        System.setProperty("webDriver.chrome.driver", "/Codebase/chromedriver_win32 (1)");
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);

        driver.get(prop.getProperty("url"));


    }

    }




















/*Points to addon
creating TestBase class as parent to implement the concept of inheritance.

declaration of properties variable globally so that access can be given to parent and child class

create a constructor over here and constructor name is same as className

Static – It can be declared at method and variable level only. If we declare as Static,
    we can call using method name and variable name without creating an object.
    */
/*Exception is like an error. Whenever it occurs the program will terminate itself.
			 It can be handled by
			Try – contains error message.
			Catch – it print that error message that occur in try block.
			Compile Time Exception includes FileNotFound Exception,  IONotFound Exception
			finally
            // block like try ,catch if exit some go and check this finally and go.
        */