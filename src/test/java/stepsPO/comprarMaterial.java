package stepsPO;

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

public class comprarMaterial {
        WebDriver driver;


    @Before
    public void iniciar(){
        System.setProperty("webdriver.chrome.driver", "drivers/chrome/93/chromedriver93.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(12000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();

    }

    @After
    public void finalizar(){
        driver.quit();

    }


    @Given("^que acesso o site da Kalunga$")
    public void queAcessoOSiteDaKalunga() {
        driver.get("https://www.kalunga.com.br/");
        System.out.println("1 - Acessou o site");

    }

    @When("^Pesquiso por \"([^\"]*)\"$")
    public void pesquisoPor(String material) {
        driver.findElement(By.id("txtBuscaProd")).click();
        driver.findElement(By.id("txtBuscaProd")).sendKeys(material);
        System.out.println("2 - Digitou o material desejado");
    }

    @And("^clico na Lupa$")
    public void clicoNaLupa() {
        driver.findElement(By.id("btnPesquisa")).click();
        System.out.println("3 - Clico na lupa");

    }

    @Then("^clico no item desejado$")
    public void clicoNoItemDesejado() {
        driver.findElement(By.cssSelector("div.col-8.col-md-12")).click();
        System.out.println("4 - Clico no item desejado");

    }

    @When("^clico em Comprar$")
    public void clicoEmComprar() {
        driver.findElement(By.id("btnYrMlTPPfc0")).click();
        System.out.println("5 - Clico em comprar");

    }

    @Then("^confirmo o nome do produto como \"([^\"]*)\" e o preco de \"([^\"]*)\"$")
    public void confirmoONomeDoProdutoComoEOPrecoDe(String material, String preco) {
        assertEquals(driver.findElement(By.cssSelector("div.componentcard__column.col-8.col-md-10.col-lg-5.pb-4.pb-md-0.text-left.px-2.px-xl-3")).getText(),material);
        assertEquals(driver.findElement(By.cssSelector("div.componentcard__column.col-12.col-lg-2")).getText(),preco);
        System.out.println("6 - Confirmo o nome do produto como " + material + "e o preço como " + preco);

    }
}
