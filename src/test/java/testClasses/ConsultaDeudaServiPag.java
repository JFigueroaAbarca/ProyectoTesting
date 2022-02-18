package testClasses;

import org.openqa.selenium.WebDriver;
import page.ServiPag;
import page.ServiPagInicio;

public class ConsultaDeudaServiPag {

    private ServiPag serviPag;
    private ServiPagInicio servipagInicio;


    public void consultaDeudaEntel(WebDriver webDriver){
            serviPag = new ServiPag(webDriver);
            ServiPagInicio serviPagInicio = new ServiPagInicio(webDriver);
            serviPagInicio.recuperarCenefa();
            serviPag.clickMiServiPag();
            serviPag.ingresarRut("18537324-k");
            serviPag.ingresarPass("javierpag");
            serviPag.clickIngresar();
    }
}
