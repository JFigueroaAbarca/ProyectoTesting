package testClasses;

import org.openqa.selenium.WebDriver;
import page.CargaInformacion;
import page.Login;

public class Logeo {
    private Login login;
    private CargaInformacion cargaInformacion;
    WebDriver webDriver;

    public Logeo(WebDriver webDriver){

        this.webDriver = webDriver;
    }

    public void CasoLogin1(String usuario, String clave){
        login = new Login(webDriver);
        cargaInformacion = new CargaInformacion(webDriver);
        login.ingresarUsuario(usuario);
        login.ingresarClave(clave);
        login.clickBtnIngresar();
        cargaInformacion.recuperarTitulo();
        cargaInformacion.rellenarCampoTexto("hola");
        cargaInformacion.rellenarCampoCorreo("jfigueroa@qanova.cl");
        cargaInformacion.rellenarCampoArea("51");
        cargaInformacion.rellenarCampoFecha("01/01/1969");
        cargaInformacion.rellenarlista("valor 3");
        //comentado porque no es multiple -- cargaInformacion.seleccionMultiple(5);
        cargaInformacion.seleccionesMultiples("1,3");

    }

}
