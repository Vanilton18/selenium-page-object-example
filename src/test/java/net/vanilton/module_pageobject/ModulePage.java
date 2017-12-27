package net.vanilton.module_pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ModulePage {

    WebDriver driver;
    WebDriverWait wait;

    public ModulePage(WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;
    }

    public void acessarUrlDaAplicacao(String txUrl) {
        driver.get(txUrl);
    }

    public void buscaNoGoogle(String txBusca){
        driver.findElement(By.name("q")).sendKeys(txBusca);
        driver.findElement(By.name("btnK")).click();
    }

    public Boolean verificarLinkDaBuscaPresente(String txLink) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(txLink))).isDisplayed();
    }

}
