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
import java.util.Set;
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
        driver.manage().timeouts().implicitlyWait(120000, TimeUnit.MILLISECONDS);
        evidencias = new Evidencias();

    }

    @AfterMethod
    public void finalizar(){
        driver.quit();
    }




    @Test
    public void comprarCaderno() throws IOException {
        String cadoDeTeste = "Comprar Caderno";
        // B - Realizar o teste
        logs.registrarCSV(cadoDeTeste, "Iniciou o teste");
        driver.get("https://www.kalunga.com.br/");
        logs.registrarCSV(cadoDeTeste, "Abriu o site");
        evidencias.print(driver, dataHora, cadoDeTeste,"Passo 1 - Abriu o site");
        logs.registrarCSV(cadoDeTeste, "Clicou na caixa de Pesquisa");
        driver.findElement(By.id("txtBuscaProd")).click();
        logs.registrarCSV(cadoDeTeste, "Escreveu Caderno na caixa de Pesquisa");
        driver.findElement(By.id("txtBuscaProd")).sendKeys("Caderno");
        evidencias.print(driver,dataHora, cadoDeTeste, "Passo 2 - Digitou Caderno");
        logs.registrarCSV(cadoDeTeste, "Clicou na lupa");
        driver.findElement(By.id("btnPesquisa")).click();

        logs.registrarCSV(cadoDeTeste, "Confirmou o texto da pesquisa de Caderno");
        assertEquals(driver.findElement(By.cssSelector("div.breadcrumbs__blocktext")).getText(), "caderno 957 produtos encontrados");
        evidencias.print(driver, dataHora,cadoDeTeste, "Passo 3 - Exibiu os itens");
        logs.registrarCSV(cadoDeTeste, "Clicou no item pesquisado");
        driver.findElement(By.cssSelector("a.blocoproduto__link")).click();     //Clico no icone desejado
        evidencias.print(driver, dataHora,cadoDeTeste, "Passo 4 - Clicou em comprar");
        driver.findElement(By.id("btnYrMlTPPfc0")).click();                     //Clico em comprar
        logs.registrarCSV(cadoDeTeste, "Clicou em comprar");

        assertEquals(driver.findElement(By.cssSelector("div.componentcard__column.col-8.col-md-10.col-lg-5.pb-4.pb-md-0.text-left.px-2.px-xl-3")).getText(),"Caderno cartografia 96fls capa dura 97440 Spiral PT 1 UN");
        logs.registrarCSV(cadoDeTeste, "Confirmou o nome do item Caderno");
        assertEquals(driver.findElement(By.cssSelector("p.componentcard__text.componentcard__text--bold.text-blue-ka.text-right.mb-0")).getText(),"R$ 10,90");
        logs.registrarCSV(cadoDeTeste, "Confirmou o preço do Caderno");
        evidencias.print(driver, dataHora,cadoDeTeste, "Passo 5 - Exibiu carrinho de compra");
        logs.registrarCSV(cadoDeTeste, "Concluiu o teste");




    }



}
