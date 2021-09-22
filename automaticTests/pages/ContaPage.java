package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
/*Pagina da conta de cliente*/
public class ContaPage extends BasePage{

	public ContaPage(WebDriver navegador) {
		super(navegador);
	}
	//Clique no frame superior da página "Criar Portfólio" com tempo implicito para carregamento da página
	public CriarPortfolioPage clicarCriarPortfolio() {
		navegador.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		navegador.switchTo().frame("06658000001XRCe");
		navegador.findElement(By.xpath("//input[@title=\" Criar Novo Portfólio\"]")).click();
		navegador.switchTo().activeElement();
		
		return new CriarPortfolioPage(navegador);
	}
	


}
