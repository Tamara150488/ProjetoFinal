// 1 - Pacote
package webTest;

// 2 - Bibliotecas

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import utils.Evidencias;
import utils.Logs;


import static org.testng.Assert.assertEquals;

// 3 - Classe
public class seleniumSimples {
    // 3.1 - Atributos

    WebDriver driver;
    Evidencias evidencias;
    Logs logs;
    static String dataHora =new SimpleDateFormat("yyyy-MM-dd HH-mm").format(Calendar.getInstance().getTime());

    // 3.2 - Métodos e Funções

    @BeforeClass
    public void primeiroPasso() throws IOException {
        logs = new Logs();
        logs.iniciarLogCSV(dataHora);
    }

    @BeforeMethod
    public void iniciar() {
        // A - Inicio
        System.setProperty("webdriver.chrome.driver", "drivers/chrome/93/chromedriver93.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(120000, TimeUnit.MILLISECONDS);
        evidencias = new Evidencias();

    }

    @AfterMethod
    public void finalizar(){
        driver.quit();
    }

    @Test
    public void comprarTenis() throws IOException, InterruptedException {
        String cadoDeTeste = "Comprar Tênis";
        // B - Realizar o teste
        logs.registrarCSV(cadoDeTeste, "Iniciou o teste");
        driver.get("https://www.adidas.com.br/");
        logs.registrarCSV(cadoDeTeste, "Abriu o site");
        evidencias.print(driver, dataHora, cadoDeTeste,"Passo 1 - Abriu o site");
        logs.registrarCSV(cadoDeTeste, "Clicou na caixa de Pesquisa");
        driver.findElement(By.cssSelector("input.searchinput___zXLAR")).click();
        logs.registrarCSV(cadoDeTeste, "Escreveu Tenis Superstar");
        driver.findElement(By.cssSelector("input.searchinput___zXLAR")).sendKeys("Tenis Superstar");
        evidencias.print(driver,dataHora, cadoDeTeste, "Passo 2 - Tenis Superstar");
        logs.registrarCSV(cadoDeTeste, "Dou enter");
        driver.findElement(By.cssSelector("input.searchinput___zXLAR")).sendKeys(Keys.ENTER);

        logs.registrarCSV(cadoDeTeste, "Confirmou o texto da pesquisa de Tenis Superstar");
        assertEquals(driver.findElement(By.cssSelector("h1.gl-vspace.heading___1_p74.heading--search")).getText(), "“TENIS SUPERSTAR”");
        evidencias.print(driver, dataHora,cadoDeTeste, "Passo 3 - Exibiu os itens");
        logs.registrarCSV(cadoDeTeste, "Clicou no item pesquisado");
        driver.findElement(By.cssSelector("img.img_with_fallback___1aENo.gl-product-card__image.performance-item")).click();     //Clico no icone desejado

        logs.registrarCSV(cadoDeTeste, "Clico no popup");
        evidencias.print(driver, dataHora, cadoDeTeste,"Passo 4 - Clico no popup");
        //Thread.sleep(1000);
        driver.findElement(By.cssSelector("button.gl-modal__close")).click();

        evidencias.print(driver, dataHora,cadoDeTeste, "Passo 5 - Clicou no tamanho desejado");
        driver.findElement(By.cssSelector("button.gl-label.size___TqqSo")).click();                     //Clico no tamanho
        logs.registrarCSV(cadoDeTeste, "Clicou no tamanho desejado");

        evidencias.print(driver, dataHora,cadoDeTeste, "Passo 6 - Clicou em adicionar ao carrinhor");
        driver.findElement(By.cssSelector("span.gl-cta__content")).click();                     //Clico em comprar
        logs.registrarCSV(cadoDeTeste, "Clicou em adicionar ao carrinho");

        assertEquals(driver.findElement(By.cssSelector("h5.bag-modal-product-name___1sZaW")).getText(),"Tênis Superstar");
        logs.registrarCSV(cadoDeTeste, "Confirmou o nome do item Tênis Superstar");
        assertEquals(driver.findElement(By.cssSelector("div.gl-price.gl-price--horizontal.notranslate")).getText(),"R$399,99");
        logs.registrarCSV(cadoDeTeste, "Confirmou o preço do Tênis Superstar");
        evidencias.print(driver, dataHora,cadoDeTeste, "Passo 7 - Exibiu carrinho de compra");
        logs.registrarCSV(cadoDeTeste, "Concluiu o teste");




    }

    @Test
    public void comprarCaneta() throws IOException {
        String cadoDeTeste = "Comprar Caneta";
        // B - Realizar o teste
        logs.registrarCSV(cadoDeTeste, "Iniciou o teste");
        driver.get("https://www.kalunga.com.br/");
        logs.registrarCSV(cadoDeTeste, "Abriu o site");
        evidencias.print(driver, dataHora, cadoDeTeste,"Passo 1 - Abriu o site");
        logs.registrarCSV(cadoDeTeste, "Clicou na caixa de Pesquisa");
        driver.findElement(By.id("txtBuscaProd")).click();
        logs.registrarCSV(cadoDeTeste, "Escreveu Caderno na caixa de Pesquisa");
        driver.findElement(By.id("txtBuscaProd")).sendKeys("Caneta");
        evidencias.print(driver,dataHora, cadoDeTeste, "Passo 2 - Digitou Caneta");
        logs.registrarCSV(cadoDeTeste, "Clicou na lupa");
        driver.findElement(By.id("btnPesquisa")).click();

        logs.registrarCSV(cadoDeTeste, "Confirmou o texto da pesquisa de Caneta");
        assertEquals(driver.findElement(By.cssSelector("div.breadcrumbs__blocktext")).getText(), "caneta 554 produtos encontrados");
        evidencias.print(driver, dataHora,cadoDeTeste, "Passo 3 - Exibiu os itens");
        logs.registrarCSV(cadoDeTeste, "Clicou no item pesquisado");
        driver.findElement(By.cssSelector("a.blocoproduto__link")).click();     //Clico no icone desejado
        evidencias.print(driver, dataHora,cadoDeTeste, "Passo 4 - Clicou em comprar");
        driver.findElement(By.id("btnYrMlTPPfc0")).click();                     //Clico em comprar
        logs.registrarCSV(cadoDeTeste, "Clicou em comprar");

        assertEquals(driver.findElement(By.cssSelector("div.componentcard__column.col-8.col-md-10.col-lg-5.pb-4.pb-md-0.text-left.px-2.px-xl-3")).getText(),"Caneta Esferográfica 1.0mm Cristal Azul Bic CX 50 UN");
        logs.registrarCSV(cadoDeTeste, "Confirmou o nome do item Caneta");
        assertEquals(driver.findElement(By.cssSelector("div.componentcard__column.col-12.col-lg-2")).getText(),"R$ 39,20");
        logs.registrarCSV(cadoDeTeste, "Confirmou o preço da Caneta");
        evidencias.print(driver, dataHora,cadoDeTeste, "Passo 5 - Exibiu carrinho de compra");
        logs.registrarCSV(cadoDeTeste, "Concluiu o teste");




    }


}
