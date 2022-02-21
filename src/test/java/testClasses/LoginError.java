package testClasses;

import org.openqa.selenium.WebDriver;
import page.ServiPag;
import page.ServiPagInicio;
import page.Validaciones;

public class LoginError {

    private ServiPag serviPag;
    private ServiPagInicio servipagInicio;
    private Validaciones validaciones;

    public void loginError(WebDriver webDriver){
        serviPag = new ServiPag(webDriver);
        ServiPagInicio serviPagInicio = new ServiPagInicio(webDriver);
        serviPagInicio.recuperarCenefa();
        serviPag.clickMiServiPag();
        serviPag.ingresarRut("19287546-3");
        serviPag.ingresarPass("javierpag");
        serviPag.clickIngresar();
        Validaciones validaciones = new Validaciones();
        validaciones.validarTexto("El usuario o clave ingresada no son correctos, reinténtelo.");

    }

}
