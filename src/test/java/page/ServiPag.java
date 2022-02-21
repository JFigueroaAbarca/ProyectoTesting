package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ServiPag {

    @FindBy(xpath = "//*[@id=\"single-spa-application:@servipagFenix/header\"]/header-root/header-home/header/div/div/nav[3]/ul/li[1]/a")
    WebElement btnMiServiPag;

    @FindBy(xpath = "/html/body/modal-container/div/div/login-modal-login/div/div[2]/form/section/div[1]/input")
    WebElement inputRut;

    @FindBy(xpath = "/html/body/modal-container/div/div/login-modal-login/div/div[2]/form/section/div[2]/input")
    WebElement inputPass;

    @FindBy(xpath = "/html/body/modal-container/div/div/login-modal-login/div/div[2]/form/section/button")
    WebElement btnIngresar;

    @FindBy(xpath = "/html/body/modal-container/div/div/login-modal-login/div/div[2]/form/section/div[3]")
    WebElement textError;

    WebDriver webDriver;

    public ServiPag (WebDriver webDriver)  {
        PageFactory.initElements(webDriver, this);
        this.webDriver = webDriver;
    }
    public void clickMiServiPag(){
        btnMiServiPag.click();

    }

    public void ingresarRut(String ingresarRut){

        inputRut.sendKeys(ingresarRut);
    }

    public void ingresarPass(String ingresarPass){

        inputPass.sendKeys(ingresarPass);
            }

    public void clickIngresar(){

        btnIngresar.click();
    }


}
