package net.vanilton.module_test;

import net.vanilton.module_pageobject.ModulePage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ModulePageTest extends BaseTest {

    private ModulePage modulePage;

    @Before
    public void setUp()  {
        modulePage = new ModulePage(driver, wait);
        modulePage.acessarUrlDaAplicacao("https://www.google.com.br/");
        modulePage.buscaNoGoogle("vanilton.net");

    }

    @Test
    public void buscarPorLinkDeSiteNoGoogle() {
        assertTrue("Não foi encontado o link Vanilton.net",
                modulePage.verificarLinkDaBuscaPresente("Vanilton.net"));
    }

    @After
    public void tearDown() {
        // TODO Faz algo apos um teste terminar
    }
}