package AppTest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class CadastroTricents {

    private WebDriver driver;

    // PAGINA INICIAL

    @Given("^Estou na pagina inicial$")
    public void estou_na_pagina_inicial() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")
                + "/src/test/resources/chromedriver.exe");

        ChromeOptions options = new ChromeOptions();

        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");

        driver = new ChromeDriver(options);

        driver.get("http://sampleapp.tricentis.com/101/app.php");

    }


    @When("^Identifico a opcao de Automobile$")
    public void identifico_a_opcao_de_automobile(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Then("^Clico no Icone Automobile$")
    public void clico_no_icone_automobile(){
        driver.findElement(By.id("nav_automobile")).click();
    }

    // ENTER VEHICLE DATA

    @Given("^Estou na pagina Enter Vehicle Data$")
    public void estou_na_pagina_enter_vehicle_data(){
        WebElement dropdown = driver.findElement(By.id("make"));
        dropdown.findElement(By.xpath("//option[. = 'Volkswagen']")).click();
    }
    @When("^Preencho as informacoes de cadastro$")
    public void preencho_as_informacoes_de_cadastro(){

        {
            WebElement element = driver.findElement(By.id("make"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).clickAndHold().perform();
        }
        {
            WebElement element = driver.findElement(By.id("make"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        {
            WebElement element = driver.findElement(By.id("make"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).release().perform();
        }
        driver.findElement(By.id("engineperformance")).click();
        driver.findElement(By.id("engineperformance")).sendKeys("150");
        driver.findElement(By.id("dateofmanufacture")).click();
        driver.findElement(By.id("dateofmanufacture")).sendKeys("01/08/2018");
        {
            WebElement dropdown = driver.findElement(By.id("numberofseats"));
            dropdown.findElement(By.xpath("//option[. = '5']")).click();
        }
        {
            WebElement element = driver.findElement(By.id("numberofseats"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).clickAndHold().perform();
        }
        {
            WebElement element = driver.findElement(By.id("numberofseats"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        {
            WebElement element = driver.findElement(By.id("numberofseats"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).release().perform();
        }
        {
            WebElement dropdown = driver.findElement(By.id("fuel"));
            dropdown.findElement(By.xpath("//option[. = 'Petrol']")).click();
        }
        {
            WebElement element = driver.findElement(By.id("fuel"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).clickAndHold().perform();
        }
        {
            WebElement element = driver.findElement(By.id("fuel"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        {
            WebElement element = driver.findElement(By.id("fuel"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).release().perform();
        }
        driver.findElement(By.id("listprice")).click();
        driver.findElement(By.id("listprice")).sendKeys("80000");
        driver.findElement(By.id("licenseplatenumber")).click();
        driver.findElement(By.id("licenseplatenumber")).sendKeys("pog2222");
        driver.findElement(By.id("annualmileage")).click();
        driver.findElement(By.id("annualmileage")).sendKeys("50000");


    }
    @Then("^Clico na opcao next e sou direcionado para Enter Insurant Data$")
    public void clico_na_opcao_next_e_sou_direcionado_para_enter_insurant_data(){
        driver.findElement(By.id("nextenterinsurantdata")).click();

    }

    // ENTER INSURANT DATA

    @Given("^Estou na pagina Enter Insurant Data$")
    public void estou_na_pagina_enter_insurant_data(){
        driver.findElement(By.id("firstname")).click();
    }
    @When("^Preencho as informacoes de cadastro segunda aba$")
    public void preencho_as_informacoes_de_cadastro_segunda_aba(){
        driver.findElement(By.id("firstname")).sendKeys("luiz");
        driver.findElement(By.id("lastname")).sendKeys("souza");
        driver.findElement(By.id("birthdate")).sendKeys("09/01/1990");
        driver.findElement(By.cssSelector(".group:nth-child(2) > .ideal-radiocheck-label:nth-child(1) > .ideal-radio")).click();
        driver.findElement(By.id("streetaddress")).click();
        driver.findElement(By.id("streetaddress")).sendKeys("r fote de st inacio");
        {
            WebElement dropdown = driver.findElement(By.id("country"));
            dropdown.findElement(By.xpath("//option[. = 'Brazil']")).click();
        }
        {
            WebElement element = driver.findElement(By.id("country"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).clickAndHold().perform();
        }
        {
            WebElement element = driver.findElement(By.id("country"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        {
            WebElement element = driver.findElement(By.id("country"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).release().perform();
        }
        driver.findElement(By.id("zipcode")).click();
        driver.findElement(By.id("zipcode")).sendKeys("04945220");
        driver.findElement(By.cssSelector(".idealsteps-step:nth-child(2)")).click();
        driver.findElement(By.id("city")).click();
        driver.findElement(By.id("city")).sendKeys("sao paulo");
        driver.findElement(By.cssSelector(".idealsteps-step:nth-child(2)")).click();
        {
            WebElement dropdown = driver.findElement(By.id("occupation"));
            dropdown.findElement(By.xpath("//option[. = 'Employee']")).click();
        }
        {
            WebElement element = driver.findElement(By.id("occupation"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).clickAndHold().perform();
        }
        {
            WebElement element = driver.findElement(By.id("occupation"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        {
            WebElement element = driver.findElement(By.id("occupation"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).release().perform();
        }
        driver.findElement(By.cssSelector(".ideal-radiocheck-label:nth-child(5) > .ideal-check")).click();

    }
    @Then("^Clico na opcao next e sou direcionado para Enter Product Data$")
    public void clico_na_opcao_next_e_sou_direcionado_para_enter_product_data(){
        driver.findElement(By.id("nextenterproductdata")).click();
    }

    // ENTER PRODUCT DATA

    @Given("^Estou na pagina Enter Product Data$")
    public void estou_na_pagina_enter_product_data(){
        driver.findElement(By.id("startdate")).click();
    }
    @When("^Preencho as informacoes de cadastro terceira aba$")
    public void preencho_as_informacoes_de_cadastro_terceira_aba(){
        driver.findElement(By.id("startdate")).sendKeys("01/08/2023");
        {
            WebElement dropdown = driver.findElement(By.id("insurancesum"));
            dropdown.findElement(By.xpath("//*[@id=\"insurancesum\"]/option[6]")).click();
        }
        {
            WebElement element = driver.findElement(By.id("insurancesum"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).clickAndHold().perform();
        }
        {
            WebElement element = driver.findElement(By.id("insurancesum"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        {
            WebElement element = driver.findElement(By.id("insurancesum"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).release().perform();
        }
        {
            WebElement dropdown = driver.findElement(By.id("meritrating"));
            dropdown.findElement(By.xpath("//option[. = 'Bonus 4']")).click();
        }
        {
            WebElement element = driver.findElement(By.id("meritrating"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).clickAndHold().perform();
        }
        {
            WebElement element = driver.findElement(By.id("meritrating"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        {
            WebElement element = driver.findElement(By.id("meritrating"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).release().perform();
        }
        {
            WebElement dropdown = driver.findElement(By.id("damageinsurance"));
            dropdown.findElement(By.xpath("//option[. = 'Full Coverage']")).click();
        }
        {
            WebElement element = driver.findElement(By.id("damageinsurance"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).clickAndHold().perform();
        }
        {
            WebElement element = driver.findElement(By.id("damageinsurance"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        {
            WebElement element = driver.findElement(By.id("damageinsurance"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).release().perform();
        }
        driver.findElement(By.cssSelector(".field:nth-child(5) .ideal-radiocheck-label:nth-child(1) > .ideal-check")).click();
        {
            WebElement dropdown = driver.findElement(By.id("courtesycar"));
            dropdown.findElement(By.xpath("//*[@id=\"courtesycar\"]/option[3]")).click();
        }
        {
            WebElement element = driver.findElement(By.id("courtesycar"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).clickAndHold().perform();
        }
        {
            WebElement element = driver.findElement(By.id("courtesycar"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        {
            WebElement element = driver.findElement(By.id("courtesycar"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).release().perform();
        }
    }
    @Then("^Clico na opcao next e sou direcionado para Select Price Option$")
    public void clico_na_opcao_next_e_sou_direcionado_para_select_price_option(){
        driver.findElement(By.id("nextselectpriceoption")).click();
    }


    // SELECT PRICE OPTION

    @Given("^Estou na pagina Select Price Option$")
    public void estou_na_pagina_select_price_option(){
        driver.findElement(By.cssSelector(".choosePrice:nth-child(4) > .ideal-radio")).click();
    }
    @When("^Seleciono a opcao de plano desejada$")
    public void seleciono_a_opcao_de_plano_desejada(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    @Then("^Clico na opcao next e sou direcionado para Send Quote$")
    public void clico_na_opcao_next_e_sou_direcionado_para_send_quote(){
        driver.findElement(By.id("nextsendquote")).click();
    }

    // SEND QUOTE

    @Given("^Estou na pagina Send Quote$")
    public void estou_na_pagina_send_quote(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    @When("^Preencho as informacoes de cadastro aba send quote$")
    public void preencho_as_informacoes_de_cadastro_aba_send_quote(){

        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).sendKeys("feh-souza@hmail.com");
        driver.findElement(By.id("phone")).sendKeys("11985856880");
        driver.findElement(By.id("username")).sendKeys("fehjsouza");
        driver.findElement(By.id("password")).sendKeys("LUIZ123@l");
        driver.findElement(By.id("confirmpassword")).sendKeys("LUIZ123@l");
        driver.findElement(By.id("sendemail")).click();
    }
    @Then("^Clico na opcao next e aguardo visualizacao de cotacao enviada$")
    public void clico_na_opcao_next_e_aguardo_visualizacao_de_cotacao_enviada(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.cssSelector(".confirm")).click();
    }

}
