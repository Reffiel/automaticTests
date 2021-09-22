package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
/*Pagina para cria��o ou v�nculo de portf�lio de cliente*/
public class CriarAssociarPortfolioFilhoPage extends BasePage {

	public CriarAssociarPortfolioFilhoPage(WebDriver navegador) {
		super(navegador);
	}
	public CriarAssociarPortfolioFilhoPage esperar(int segundos) throws InterruptedException {
		Thread.sleep(segundos * 1000);
		
		return this;
	}
	public CriarAssociarPortfolioFilhoPage digitarPreco(String preco) {
		navegador.findElement(By.id("svmx-number-1063-inputEl")).sendKeys(preco);

		return this;
	}

	public CriarAssociarPortfolioFilhoPage digitarDescricao(String descricao) {
		navegador.findElement(By.id("svmx-text-1040-inputEl")).sendKeys(descricao);

		return this;
	}

	public CriarAssociarPortfolioFilhoPage digitarNumeroDeSerie(String numeroDeSerie) {
		navegador.findElement(By.id("sfm-text-1046-inputEl")).sendKeys(numeroDeSerie);

		return this;
	}

	public CriarAssociarPortfolioFilhoPage digitarCodigoDeBarras(String codigoDeBarras) {
		navegador.findElement(By.id("sfm-text-1049-inputEl")).sendKeys(codigoDeBarras);

		return this;
	}

	public CriarAssociarPortfolioFilhoPage digitarDataDeCompra(String dataDeCompra) {
		navegador.findElement(By.id("svmx-date-1044-inputEl")).sendKeys(dataDeCompra);

		return this;
	}
	public CriarAssociarPortfolioFilhoPage clicarSalvarPortfolioWTTFull() {
		navegador.findElement(By.id("sfm-button-1084-btnIconEl")).click();

		return this;
	}
	public PortfolioPage clicarPopUpGuardarWTTFull() {
		navegador.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		navegador.findElement(By.id("sfm-button-1100-btnInnerEl")).click();

		return new PortfolioPage(navegador);
	}
	public CriarAssociarPortfolioFilhoPage clicarSalvarPortfolioQA() {
		navegador.findElement(By.id("sfm-button-1084-btnIconEl")).click();

		return this;
	}
	public PortfolioPage clicarPopUpGuardarQA() {
		navegador.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		navegador.findElement(By.id("sfm-button-1100-btnInnerEl")).click();

		return new PortfolioPage(navegador);
	}
	/*
	 * Falta do N�mero de s�rie/IMEI:
	 * Localizo o elemento para poder manipular
		 * 	Limpar o que esta escrito e 
		 * 	Escrever de acordo com a lista(	Acess�rio pertence ao Pack,
		 * 									Ileg�vel,
		 * 									Rasurado,
		 * 									N�o existe,
		 * 									N�o vis�vel,
		 *									Artigo n�o liga e n�o est� vis�vel,
		 * 									Domic�lio,
		 * 									Servi�o Resolve)
	 * Ap�s efetuo click no elemento apresentando a op��o 
	 */
	public CriarAssociarPortfolioFilhoPage selecionarFaltaNumeroDeSerie(String motivoFaltaNumeroDeSerie) {
		navegador.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement campoFaltaNumeroDeSerie = navegador.findElement(By.id("sfm-picklist-1048-inputEl"));
		campoFaltaNumeroDeSerie.clear();
		campoFaltaNumeroDeSerie.sendKeys(motivoFaltaNumeroDeSerie);
		navegador.findElement(By.id("boundlist-1096-listEl")).click();

		return this;
	}
	/*
	 * Falta de C�digo de barras da fatura:
	 * Localizo o elemento para poder manipular
		 * 	Limpar o que esta escrito e 
		 * 	Escrever de acordo com a lista(	Outras empresas,
		 * 									2� via fatura,
		 * 									Oferta,
		 * 									Substitui��o do fornecedor,
		 * 									Parcerias (Ex: Galp),
		 *									Worten Empresas,
		 * 									Produto em Or�amento,
		 * 									Pendente confirma��o de vendas,
		 * 									Pagamento Servi�o no Fecho do Processo)
	 * Ap�s efetuo click no elemento apresentando a op��o 
	 */
	public CriarAssociarPortfolioFilhoPage selecionarFaltaCodigoDeBarras(String motivoFaltaCodigoDeBarras) {
		navegador.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement campoFaltaNumeroDeSerie = navegador.findElement(By.id("sfm-picklist-1051-inputEl"));
		campoFaltaNumeroDeSerie.clear();
		campoFaltaNumeroDeSerie.sendKeys(motivoFaltaCodigoDeBarras);
		navegador.findElement(By.id("boundlist-1098-listEl")).click();

		return this;
	}

}
