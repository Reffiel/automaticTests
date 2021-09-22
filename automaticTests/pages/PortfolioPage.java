package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
/*Pagina do portfólio (visualização)*/
public class PortfolioPage extends BasePage {

	public PortfolioPage(WebDriver navegador) {
		super(navegador);
	}

	public PortfolioPage esperar(int segundos) throws InterruptedException {
		Thread.sleep(segundos * 1000);

		return this;
	}

	// Captura o nome do Portfólio no título
	public String getNomePortfolio() {
		String nomePortfolio = navegador.findElement(By.xpath("//h2[@class=\"pageDescription\"]")).getText();

		return nomePortfolio;
	}

	public CriarSolicitacaoPage clicarCriarSolicitacaoQA() {
		navegador.switchTo().frame("06658000001XRCq");
		navegador.findElement(By.xpath("//input[@title=\" Create Work Order\"]")).click();
		navegador.switchTo().activeElement();

		return new CriarSolicitacaoPage(navegador);
	}

	public CriarServicosDomicilioPage clicarCriarServicoDomicilioWTTFull() {
		navegador.switchTo().frame("06658000001XRCq");
		navegador.findElement(By.xpath("//input[@title=\" Criar Serviços Domicílio\"]")).click();
		navegador.switchTo().activeElement();

		return new CriarServicosDomicilioPage(navegador);
	}

	public CriarSolicitacaoPage clicarCriarSolicitacaoDeClienteWTTFull() {
		navegador.switchTo().frame("06658000001XRCq");
		navegador.findElement(By.xpath("//input[@title=\" Criar Solicitação de Cliente\"]")).click();
		navegador.switchTo().activeElement();

		return new CriarSolicitacaoPage(navegador);
	}

	public CriarAssociarPortfolioFilhoPage clicarAssociarServicos() {
		navegador.switchTo().frame("06658000001XRCq");
		navegador.findElement(By.xpath("//input[@title=\" This SFM transaction is used to create a child installed product for a parent or top-level installed product. Most information is automatically copied from the parent to the child.\"]")).click();
		navegador.switchTo().activeElement();

		return new CriarAssociarPortfolioFilhoPage(navegador);
	}

	// Escrever na pesquisa global
	public PortfolioPage escreverPesquisa(String texto) {
		navegador.findElement(By.id("phSearchInput")).sendKeys(texto);

		return this;
	}

	// Clique pesquisar na pesquisa global
	public PortfolioPage clicarPesquisar() {
		navegador.findElement(By.id("searchButtonContainer")).click();

		return this;
	}

	// Funcional para pesquisa
	public PortfolioPage pesquisarPesquisaGlobal(String texto) {
		escreverPesquisa(texto);
		clicarPesquisar();

		return this;
	}

	public PortfolioPage clicarNoPortfolio(String nomeDoPortfolio) {
		navegador.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		navegador.findElement(By.xpath("//div[@id='SVMXC__Installed_Product__c_body']//a[text()='" + nomeDoPortfolio + "']")).click();

		return this;
	}
	/*Clique ocorre em componente personalizado no perfil de administrador*/
	public PortfolioPage clicarNoPortfolioFilho(String nomeDoPortfolioFilho) {
		navegador.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		navegador.findElement(By.linkText(nomeDoPortfolioFilho)).click();;
		//navegador.findElement(By.xpath("//div[@id=\"a0C25000007Zt5M_00N58000008prOc_body\"]//a[text()='" + nomeDoPortfolioFilho + "']")).click();

		return this;
	}

	public String getNomePortfolioFilho() {
		String nomePortfolioFilho = navegador.findElement(By.xpath("//table[@id=\"bodyTable\"]/tbody/tr/td[2]/div[8]/div/div/div[2]/table/tbody/tr[2]/th")).getText();
																	
		return nomePortfolioFilho;
	}
	public String getNomePortfolioFilhoQA() {
		String nomePortfolioFilho = navegador.findElement(By.xpath("//table[@id=\"bodyTable\"]/tbody/tr/td[2]/div[7]/div/div/div[2]/table/tbody/tr[2]/th/a")).getText();

		return nomePortfolioFilho;
	}
	

}
