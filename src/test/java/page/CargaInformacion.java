package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CargaInformacion {

    @FindBy(id = "imPgTitle")
    private WebElement titulo;

    @FindBy(xpath = "//*[@id=\"imObjectForm_1_2\"]")
    private WebElement campoTexto;

    @FindBy(xpath = "//*[@id=\"imObjectForm_1_3\"]")
    private WebElement campoCorreo;

    @FindBy(xpath = "//*[@id=\"imObjectForm_1_4\"]")
    private WebElement campotextoArea;

    @FindBy(id = "imObjectForm_1_5")
    private WebElement campoFecha;

    @FindBy(xpath = "//*[@id=\"imObjectForm_1_6\"]")
    private WebElement campoLista;

    @FindBy(id = "imObjectForm_1_7_0")
    private WebElement chckbxSeleccionMultiple1;

    @FindBy(id = "imObjectForm_1_7_1")
    private WebElement chckbxSeleccionMultiple2;

    @FindBy(id = "imObjectForm_1_7_2")
    private WebElement chckbxSeleccionMultiple3;

    @FindBy(id = "imObjectForm_1_8_0")
    private WebElement rdbtnCombo1;

    @FindBy(id = "imObjectForm_1_8_1")
    private WebElement rdbtnCombo2;

    @FindBy(id = "imObjectForm_1_8_2")
    private WebElement rdbtnCombo3;

    @FindBy(id = "imObjectForm_1_submit")
    private WebElement btnEnviar;

    @FindBy(xpath = "//*[@id=\"imObjectForm_1_buttonswrap\"]/input[2]")
    private WebElement btnResetear;





WebDriver webDriver;

    public CargaInformacion(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
        this.webDriver = webDriver;
    }

    public String recuperarTitulo (){
        WebDriverWait webDriverWait = new WebDriverWait(webDriver,10);
        webDriverWait.until(ExpectedConditions.visibilityOf(titulo));
        String texto = titulo.getText();
        return texto;
    }

    public void rellenarCampoTexto(String texto){
        campoTexto.sendKeys(texto);
    }

    public void rellenarCampoCorreo(String correo){
        campoCorreo.sendKeys(correo);
    }

    public void rellenarCampoArea(String area){
        campotextoArea.sendKeys(area);
    }

    public void rellenarCampoFecha(String fecha){
        campoFecha.sendKeys(fecha);
    }

    public void rellenarlista(String valor){
        Select select = new Select (campoLista);
        select.selectByVisibleText(valor);
    }

    public void seleccionMultiple(int indicador){
        switch (indicador){
            case 1:
                chckbxSeleccionMultiple1.click();
                break;
            case 2:
                chckbxSeleccionMultiple2.click();
                break;
            case 3:
                chckbxSeleccionMultiple3.click();
                break;
            default:
                System.out.println("Seleccion no procesable, entero pao");
        }
    }

    public void seleccionesMultiples(String indicador){
        String[] indicadores =indicador.split(",");
        for (String nro:indicadores){
        int numero = Integer.parseInt(nro);

        switch (numero) {
            case 1:
                chckbxSeleccionMultiple1.click();
                break;
            case 2:
                chckbxSeleccionMultiple2.click();
                break;
            case 3:
                chckbxSeleccionMultiple3.click();
                break;
            default:
                System.out.println("Seleccion no procesable, entero pao");
        }
        }
    }

}
