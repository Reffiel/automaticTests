package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/*Página inicial do resolve após o Login*/
public class HomePage extends BasePage {

	public HomePage(WebDriver navegador) {
		super(navegador);
	}
	//Escrever na pesquisa global
	public HomePage escreverPesquisa(String texto) {
		navegador.findElement(By.id("phSearchInput")).sendKeys(texto);

		return this;
	}
	//Clique pesquisar na pesquisa global
	public HomePage clicarPesquisar() {
		navegador.findElement(By.id("searchButtonContainer")).click();

		return this;
	}
	//Funcional para pesquisa
	public HomePage pesquisarPesquisaGlobal(String texto) {
		escreverPesquisa(texto);
		clicarPesquisar();

		return this;
	}
	
	public ContaPage clicarNaConta(String conta) {
		navegador.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		navegador.findElement(By.xpath("//div[@id='Account_body']//a[text()='" + conta + "']")).click();

		return new ContaPage(navegador);
	}
	//Clicar na div da listagem de portfólios com NomeDoPortfolio
	public PortfolioPage clicarNoPortfolio(String nomeDoPortfolio) {
		navegador.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		navegador.findElement(By.xpath("//div[@id='SVMXC__Installed_Product__c_body']//a[contains(text(),'" + nomeDoPortfolio + "')]")).click();
			
		return new PortfolioPage(navegador);
	}
	//Clicar na div da listagem de solicitações com solicitacaoCliente (Obs: Pode ser verificado este método para atender a solicitações de serviço)
	public SolicitacaoClientePage clicarNaSolicitacaoCliente(String solicitacaoCliente) {
		navegador.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		navegador.findElement(By.xpath("//div[@id='SVMXC__Service_Order__c_body']//a[text()='" +solicitacaoCliente + "']")).click();
		
		return new SolicitacaoClientePage(navegador);
	}

}
