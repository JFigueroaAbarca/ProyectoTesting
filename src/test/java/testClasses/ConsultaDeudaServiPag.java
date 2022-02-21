package testClasses;

import javafx.scene.shape.VLineTo;
import org.openqa.selenium.WebDriver;
import page.ServiPag;
import page.ServiPagInicio;
import page.Validaciones;

public class ConsultaDeudaServiPag {

    private ServiPag serviPag;
    private ServiPagInicio servipagInicio;
    private Validaciones validaciones;


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
