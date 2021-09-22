package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
/*Pagina da solicitação do cliente*/
public class SolicitacaoClientePage extends BasePage{

	public SolicitacaoClientePage(WebDriver navegador) {
		super(navegador);
		
	}
	public SolicitacaoClientePage esperar(int segundos) throws InterruptedException {
		Thread.sleep(segundos * 1000);

		return this;
	}
		
	public EfetuarPedidoDeSubstituicaoPage clicarEfetuarPedidoDeSubstituicao() {
		navegador.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		navegador.switchTo().frame("06658000001XRD6");
		navegador.findElement(By.xpath("//input[@title=\" Efetuar Pedido de Substituição\"]")).click();
		navegador.switchTo().activeElement();
		
		return new EfetuarPedidoDeSubstituicaoPage(navegador);
	}
	public SolicitacaoClientePage clicarEncaminharParaTratamentoWTTFull() {
		navegador.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		navegador.switchTo().frame("06658000001XRD6");
		navegador.findElement(By.xpath("//input[@title=\" Encaminhar para Tratamento\"]")).click();
		navegador.switchTo().activeElement();
		
		return this;
	}
	public CriarSubstituicaoOuTrocaDiretaPage clicarSubstituicaoOuTrocaDireta() {
		navegador.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		navegador.switchTo().frame("06658000001XRD6");
		navegador.findElement(By.xpath("//input[@title=\" This custom action is used to call Product Swap (Direct Exchange or Swap)\"]")).click();
		navegador.switchTo().activeElement();
		
		return new CriarSubstituicaoOuTrocaDiretaPage(navegador);
	}
	
	public String verificaEstadoDaSolicitacao() {
		return navegador.findElement(By.xpath("//*[@id=\"ep\"]/div[2]/div[4]/table/tbody/tr[1]/td[4]")).getText();
	}
	
	

}
