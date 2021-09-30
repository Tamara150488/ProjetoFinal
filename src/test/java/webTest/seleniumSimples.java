// 1 - Pacote
package webTest;

// 2 - Bibliotecas

import org.openqa.selenium.By;
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
    public void comprarCaneta() throws IOException {
        String cadoDeTeste = "Comprar Caneta";
        // B - Realizar o teste
        logs.registrarCSV(cadoDeTeste, "Iniciou o teste");
        driver.get("https://www.kalunga.com.br/");
        logs.registrarCSV(cadoDeTeste, "Abriu o site");
        evidencias.print(driver, dataHora, cadoDeTeste,"Passo 1 - Abriu o site");
        logs.registrarCSV(cadoDeTeste, "Clicou na caixa de Pesquisa");
        driver.findElement(By.id("txtBuscaProd")).click();
        logs.registrarCSV(cadoDeTeste, "Escreveu Caneta hidrográfica 12 cores 15.0112CZF Faber Castell BT 1 UN na caixa de Pesquisa");
        driver.findElement(By.id("txtBuscaProd")).sendKeys("Caneta hidrográfica 12 cores 15.0112CZF Faber Castell BT 1 UN");
        evidencias.print(driver,dataHora, cadoDeTeste, "Passo 2 - Caneta hidrográfica 12 cores 15.0112CZF Faber Castell BT 1 UN");
        logs.registrarCSV(cadoDeTeste, "Clicou na lupa");
        driver.findElement(By.id("btnPesquisa")).click();

        logs.registrarCSV(cadoDeTeste, "Clicou no item pesquisado");
        driver.findElement(By.cssSelector("div.col-8.col-md-12")).click();     //Clico no icone desejado
        evidencias.print(driver, dataHora,cadoDeTeste, "Passo 3 - Clicou em comprar");
        driver.findElement(By.id("btnYrMlTPPfc0")).click();                     //Clico em comprar
        logs.registrarCSV(cadoDeTeste, "Clicou em comprar");

        assertEquals(driver.findElement(By.cssSelector("div.componentcard__column.col-8.col-md-10.col-lg-5.pb-4.pb-md-0.text-left.px-2.px-xl-3")).getText(),"Caneta hidrográfica 12 cores 15.0112CZF Faber Castell BT 1 UN");
        logs.registrarCSV(cadoDeTeste, "Confirmou o nome do item Caneta hidrográfica 12 cores");
        assertEquals(driver.findElement(By.cssSelector("div.componentcard__column.col-12.col-lg-2")).getText(),"R$ 11,40");
        logs.registrarCSV(cadoDeTeste, "Confirmou o preço da Caneta hidrográfica 12 cores");
        evidencias.print(driver, dataHora,cadoDeTeste, "Passo 4 - Exibiu carrinho de compra");
        logs.registrarCSV(cadoDeTeste, "Concluiu o teste");

    }

    @Test
    public void comprarEstojo() throws IOException {
        String cadoDeTeste = "Comprar estojo";
        // B - Realizar o teste
        logs.registrarCSV(cadoDeTeste, "Iniciou o teste");
        driver.get("https://www.kalunga.com.br/");
        logs.registrarCSV(cadoDeTeste, "Abriu o site");
        evidencias.print(driver, dataHora, cadoDeTeste,"Passo 1 - Abriu o site");
        logs.registrarCSV(cadoDeTeste, "Clicou na caixa de Pesquisa");
        driver.findElement(By.id("txtBuscaProd")).click();
        logs.registrarCSV(cadoDeTeste, "Escreveu Estojo escolar plástico branco Waleu PT 1 UN na caixa de Pesquisa");
        driver.findElement(By.id("txtBuscaProd")).sendKeys("Estojo escolar plástico branco Waleu PT 1 UN");
        evidencias.print(driver,dataHora, cadoDeTeste, "Passo 2 - Digitou Estojo escolar plástico branco Waleu PT 1 UN");
        logs.registrarCSV(cadoDeTeste, "Clicou na lupa");
        driver.findElement(By.id("btnPesquisa")).click();

        logs.registrarCSV(cadoDeTeste, "Clicou no item pesquisado");
        driver.findElement(By.cssSelector("div.col-8.col-md-12")).click();     //Clico no icone desejado
        evidencias.print(driver, dataHora,cadoDeTeste, "Passo 3 - Clicou em comprar");
        driver.findElement(By.id("btnYrMlTPPfc0")).click();                     //Clico em comprar
        logs.registrarCSV(cadoDeTeste, "Clicou em comprar");

        assertEquals(driver.findElement(By.cssSelector("div.componentcard__column.col-8.col-md-10.col-lg-5.pb-4.pb-md-0.text-left.px-2.px-xl-3")).getText(),"Estojo escolar plástico branco Waleu PT 1 UN");
        logs.registrarCSV(cadoDeTeste, "Confirmou o nome do item Estojo");
        assertEquals(driver.findElement(By.cssSelector("div.componentcard__column.col-12.col-lg-2")).getText(),"R$ 6,80");
        logs.registrarCSV(cadoDeTeste, "Confirmou o preço do Estojo");
        evidencias.print(driver, dataHora,cadoDeTeste, "Passo 4 - Exibiu carrinho de compra");
        logs.registrarCSV(cadoDeTeste, "Concluiu o teste");




    }


}
