package testSuit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import testClasses.ConsultaDeudaServiPag;
import testClasses.Logeo;
    import testClasses.LoginError;


public class PruebaSP {
    ChromeDriver webDriver;
   // String url = "https://portal.servipag.com/";
    String url = "https://www.qanovagroup.com/piloto";

    @BeforeTest
    public void  setUp (){
        System.setProperty("webdriver.chrome.driver", "driverNavegador/chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.get(url);
        webDriver.manage().window().maximize();

    }

    @AfterTest
    public void closeDriver(){
    //webDriver.close();
    }

    @Test
    public void consultaDeudaEntel(){
        ConsultaDeudaServiPag consultaDeudaServiPag = new ConsultaDeudaServiPag();
        consultaDeudaServiPag.consultaDeudaEntel(webDriver);
    }

    @Test
    public void pruebaLogin(){
        Logeo logeo = new Logeo(webDriver);
        logeo.CasoLogin1("nvivas", "qanova");

    }

}
