package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ServiPagInicio {

@FindBy(xpath = "//*[@id=\"single-spa-application:@servipagFenix/header\"]/header-root/header-home/header/div/div/nav[2]/ul")
private WebElement cenefa;
WebDriver webDriver;

public ServiPagInicio(WebDriver webDriver){
    PageFactory.initElements(webDriver, this);
    this.webDriver = webDriver;
}

public String recuperarCenefa(){
    WebDriverWait webDriverWait = new WebDriverWait(webDriver, 10);
    webDriverWait.until(ExpectedConditions.visibilityOf(cenefa));
    String titulo = cenefa.getText();
    return titulo;

}


}
