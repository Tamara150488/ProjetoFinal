package webTest;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class comprarCadernoCS {
    WebDriver driver;

    @Before
    public void iniciar(){
        System.setProperty("webdriver.chrome.driver", "drivers/chrome/93/chromedriver93.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(120000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();

        System.out.println("0 - Antes do Teste Iniciar");

    }

    @After
    public void finalizar(){
        driver.quit();
        System.out.println("Z - Depois do Teste finalizar");
    }

    @Given("^que acesso o site da Kalunga$")
    public void queAcessoOSiteDaKalunga() {
        driver.get("https://www.kalunga.com.br/");
        System.out.println("1 - Acessou o site");
    }

    @When("^Pesquiso por \"([^\"]*)\"$")
    public void pesquisoPor(String item) {
        driver.findElement(By.id("txtBuscaProd")).click();
        driver.findElement(By.id("txtBuscaProd")).sendKeys("Caderno caligrafia");
        System.out.println("2 - Digitou o nome do produto como " + item);

    }

    @And("^clico na Lupa$")
    public void clicoNaLupa() {
        driver.findElement(By.id("btnPesquisa")).click();
        System.out.println("3 - Clicou na Lupa");
    }

    @Then("^vejo a lista de resultados para a pesquisa \"([^\"]*)\"$")
    public void vejoAListaDeResultadosParaAPesquisa(String item) {
        assertEquals(driver.findElement(By.cssSelector("p.breadcrumbs__text.breadcrumbs__text--bold.d-inline")).getText(), item);
        System.out.println("4 - Exibiu o resultado da pesquisa para o produto " + item);

    }

    @And("^clico no item desejado$")
    public void clicoNoItemDesejado() {
        driver.findElement(By.cssSelector("a.blocoproduto__link")).click();
        System.out.println("5 - Clico no produto escolhido");
    }

    @When("^clico em Comprar$")
    public void clicoEmComprar() {
        driver.findElement(By.id("btnYrMlTPPfc0")).click();
        System.out.println("6 - Clico em comprar");
    }

    @Then("^confirmo o nome do produto como \"([^\"]*)\" e o preco de \"([^\"]*)\"$")
    public void confirmoONomeDoProdutoComoEOPrecoDe(String item, String preco) {
        assertEquals(driver.findElement(By.cssSelector("div.componentcard__column.col-8.col-md-10.col-lg-5.pb-4.pb-md-0.text-left.px-2.px-xl-3")).getText(),item);
        assertEquals(driver.findElement(By.id("preco-total-item")).getText(),preco);
        System.out.println("7 - Confirmo o nome como " + item + " e o preço como " + preco);
    }

}
