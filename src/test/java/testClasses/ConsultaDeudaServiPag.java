package testClasses;

import org.openqa.selenium.WebDriver;
import page.ServiPag;

public class ConsultaDeudaServiPag {

    private ServiPag serviPag;

    public void consultaDeudaEntel(WebDriver webDriver){
            serviPag = new ServiPag(webDriver);
            serviPag.clickMiServiPag();
            serviPag.ingresarRut("18537324-k");
            serviPag.ingresarPass("javierpag");
            serviPag.clickIngresar();
    }
}
