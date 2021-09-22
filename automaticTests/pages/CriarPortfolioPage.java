package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
/*Pagina da cria��o de portf�lio de cliente*/
public class CriarPortfolioPage extends BasePage {

	public CriarPortfolioPage(WebDriver navegador) {
		super(navegador);

	}

	public CriarPortfolioPage digitarPreco(String preco) {
		navegador.findElement(By.id("svmx-number-1048-inputEl")).sendKeys(preco);

		return this;
	}

	public CriarPortfolioPage digitarDescricao(String descricao) {
		navegador.findElement(By.id("svmx-text-1032-inputEl")).sendKeys(descricao);

		return this;
	}

	public CriarPortfolioPage digitarNumeroDeSerie(String numeroDeSerie) {
		navegador.findElement(By.id("sfm-text-1038-inputEl")).sendKeys(numeroDeSerie);

		return this;
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
	public CriarPortfolioPage selecionarFaltaNumeroDeSerie(String motivoFaltaNumeroDeSerie) {
		WebElement campoFaltaNumeroDeSerie = navegador.findElement(By.id("sfm-picklist-1040-inputEl"));
		campoFaltaNumeroDeSerie.clear();
		campoFaltaNumeroDeSerie.sendKeys(motivoFaltaNumeroDeSerie);
		navegador.findElement(By.id("boundlist-1136-listEl")).click();

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
	public CriarPortfolioPage selecionarFaltaCodigoDeBarras(String motivoFaltaCodigoDeBarras) {
		WebElement campoFaltaNumeroDeSerie = navegador.findElement(By.id("sfm-picklist-1043-inputEl"));
		campoFaltaNumeroDeSerie.clear();
		campoFaltaNumeroDeSerie.sendKeys(motivoFaltaCodigoDeBarras);
		navegador.findElement(By.id("boundlist-1138-listEl")).click();

		return this;
	}
	

	public CriarPortfolioPage digitarCodigoDeBarras(String codigoDeBarras) {
		navegador.findElement(By.id("sfm-text-1041-inputEl")).sendKeys(codigoDeBarras);

		return this;
	}

	public CriarPortfolioPage digitarDataDeCompra(String dataDeCompra) {
		navegador.findElement(By.id("svmx-date-1056-inputEl")).sendKeys(dataDeCompra);

		return this;
	}

	public CriarPortfolioPage digitarDataDeInstalacao(String dataDeInstalacao) {
		navegador.findElement(By.id("svmx-date-1063-inputEl")).sendKeys(dataDeInstalacao);

		return this;
	}

	public CriarPortfolioPage digitarDataDeEntrega(String dataDeEntrega) {
		navegador.findElement(By.id("svmx-date-1059-inputEl")).sendKeys(dataDeEntrega);

		return this;
	}
	
	public CriarPortfolioPage digitarNotasObservacoes(String notasObservacoesPortfolio) {
		navegador.findElement(By.id("sfm-textarea-1073-inputEl")).sendKeys(notasObservacoesPortfolio);

		return this;
	}

	public CriarPortfolioPage clicarSalvarPortfolioQA() {
		navegador.findElement(By.id("sfm-button-1124-btnIconEl")).click();

		return this;
	}

	public CriarPortfolioPage clicarSalvarPortfolioWTTFull() {
		navegador.findElement(By.id("sfm-button-1124-btnIconEl")).click();

		return this;
	}
	public CriarPortfolioPage esperar(int segundos) throws InterruptedException {
		Thread.sleep(segundos * 1000);
		
		return this;
	}
	//Clique no popup guardar ambiente QA com tempo implicito para carregamento da popup
	public PortfolioPage clicarPopUpGuardarQA() {
		navegador.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		navegador.findElement(By.id("sfm-button-1140-btnInnerEl")).click();

		return new PortfolioPage(navegador);
	}
	//Clique no popup guardar ambiente WTTFull com tempo implicito para carregamento da popup
	public PortfolioPage clicarPopUpGuardarWTTFull() {
		navegador.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		navegador.findElement(By.id("sfm-button-1140-btnInnerEl")).click();
		
		return new PortfolioPage(navegador);
	}
	//Funcional para digitar dados padr�o portf�lio
	public CriarPortfolioPage digitarDadosPadraoPortfolio(String descricao,String numeroDeSerie, String codigoDeBarras,String preco, String dataDeCompra,String notasObservacoesPortfolio){
		digitarDescricao(descricao);
		digitarNumeroDeSerie(numeroDeSerie);
		digitarCodigoDeBarras(codigoDeBarras);
		digitarPreco(preco);
		digitarDataDeCompra(dataDeCompra);
		digitarNotasObservacoes(notasObservacoesPortfolio);
		
		return this;
	}

}
