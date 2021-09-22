package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
/*Pagina de criação de substituição ou troca direta*/
public class CriarSubstituicaoOuTrocaDiretaPage extends BasePage{

	public CriarSubstituicaoOuTrocaDiretaPage(WebDriver navegador) {
		super(navegador);
		
	}
	public CriarSubstituicaoOuTrocaDiretaPage esperar(int segundos) throws InterruptedException {
		Thread.sleep(segundos * 1000);

		return this;
	}
	
	public CriarSubstituicaoOuTrocaDiretaPage clicarCheckBoxClienteDesisteDeSubstituicao() {
		navegador.findElement(By.id("sfm-checkbox-1063-inputEl")).click();
		
		return this;
	}
	public CriarSubstituicaoOuTrocaDiretaPage clicarGuardar() {
		navegador.findElement(By.id("sfm-button-1104-btnEl")).click();
		
		return this;
	}
	public SolicitacaoClientePage clicarGuardarPopUp() {
		navegador.findElement(By.id("sfm-button-1117-btnEl")).click();
		
		return new SolicitacaoClientePage(navegador);
	}
	
	

}
