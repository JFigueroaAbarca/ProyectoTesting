package testSuit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import testClasses.ConsultaDeudaServiPag;

public class PruebaSP {
    ChromeDriver webDriver;
    String url = "https://portal.servipag.com/";

    @BeforeTest
    public void  setUp (){
        System.setProperty("webdriver.chrome.driver", "");
        webDriver = new ChromeDriver();
        webDriver.get(url);
        webDriver.manage().window().maximize();

    }

    @AfterTest
    public void closeDriver(){
    webDriver.close();
    }

    @Test
    public void consultaDeudaEntel(){
        ConsultaDeudaServiPag consultaDeudaServiPag = new ConsultaDeudaServiPag();
        consultaDeudaServiPag.consultaDeudaEntel(webDriver);
    }
}
