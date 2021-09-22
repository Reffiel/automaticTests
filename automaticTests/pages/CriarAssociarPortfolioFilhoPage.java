package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
/*Pagina para criação ou vínculo de portfólio de cliente*/
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
	 * Falta do Número de série/IMEI:
	 * Localizo o elemento para poder manipular
		 * 	Limpar o que esta escrito e 
		 * 	Escrever de acordo com a lista(	Acessório pertence ao Pack,
		 * 									Ilegível,
		 * 									Rasurado,
		 * 									Não existe,
		 * 									Não visível,
		 *									Artigo não liga e não está visível,
		 * 									Domicílio,
		 * 									Serviço Resolve)
	 * Após efetuo click no elemento apresentando a opção 
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
	 * Falta de Código de barras da fatura:
	 * Localizo o elemento para poder manipular
		 * 	Limpar o que esta escrito e 
		 * 	Escrever de acordo com a lista(	Outras empresas,
		 * 									2º via fatura,
		 * 									Oferta,
		 * 									Substituição do fornecedor,
		 * 									Parcerias (Ex: Galp),
		 *									Worten Empresas,
		 * 									Produto em Orçamento,
		 * 									Pendente confirmação de vendas,
		 * 									Pagamento Serviço no Fecho do Processo)
	 * Após efetuo click no elemento apresentando a opção 
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
