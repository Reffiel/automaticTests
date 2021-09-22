package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
/*Pagina de criação de solicitação de serviço domicílio*/
public class CriarServicosDomicilioPage extends BasePage {

	public CriarServicosDomicilioPage(WebDriver navegador) {
		super(navegador);
	}

	public CriarServicosDomicilioPage esperar(int segundos) throws InterruptedException {
		Thread.sleep(segundos * 1000);

		return this;
	}

	public CriarServicosDomicilioPage digitarNomeLoja(String loja) {
		navegador.findElement(By.id("svmx-text-1040-inputEl")).sendKeys(loja);

		return this;
	}

	public CriarServicosDomicilioPage clicarPesquisarNomeLoja() {
		navegador.findElement(By.id("svmx-button-1041")).click();

		return this;
	}

	public CriarServicosDomicilioPage selecionarNomeDaLocalizacao(String nomeLoja) {
		navegador.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		navegador.findElement(By.xpath("//*[@id=\"gridpanel-1119-body\"]//div[text()='" + nomeLoja + "']")).click();
		navegador.findElement(By.id("sfm-button-1112-btnInnerEl")).click();

		return this;
	}

	public CriarServicosDomicilioPage digitarCodigoPostal(String cp) {
		navegador.findElement(By.id("sfm-text-1080-inputEl")).clear();
		navegador.findElement(By.id("sfm-text-1080-inputEl")).sendKeys(cp);

		return this;
	}

	/*
	 * Localiza o elemento para poder manipular Limpar o que esta escrito e Escrever
	 * de acordo com a lista( Call Center, Loja, Estrutura Central) Após efetua
	 * click no elemento apresentando a opção
	 */
	public CriarServicosDomicilioPage digitarCanalWTTFull(String canal) {
		WebElement campoCanal = navegador.findElement(By.id("sfm-picklist-1047-inputEl"));
		campoCanal.clear();
		campoCanal.sendKeys(canal);
		navegador.findElement(By.id("ext-gen1157")).click();

		return this;
	}

	/*
	 * Localiza o elemento para poder manipular Limpar o que esta escrito e Escrever
	 * de acordo com a lista( Loja, Cliente) Após efetua click no elemento
	 * apresentando a opção
	 */
	public CriarServicosDomicilioPage digitarLocalizacaoDeArtigoQA(String localizacaoDeArtigo) {
		WebElement campoLocalizacaoDeArtigo = navegador.findElement(By.id("sfm-picklist-1052-inputEl"));
		campoLocalizacaoDeArtigo.clear();
		campoLocalizacaoDeArtigo.sendKeys(localizacaoDeArtigo);
		navegador.findElement(By.id("boundlist-1151-listEl")).click();

		return this;
	}

	/*
	 * Localiza o elemento para poder manipular Limpar o que esta escrito e Escrever
	 * de acordo com a lista( Instalação Desinstalação Instalação/Desinstalação
	 * Service with Delivery ) Após efetua click no elemento apresentando a opção
	 */
	public CriarServicosDomicilioPage digitarTipoDeInstalacaoWTTFull(String tipoDeInstalacao) {
		WebElement campoTipoDeInstalacao = navegador.findElement(By.id("sfm-picklist-1071-inputEl"));
		campoTipoDeInstalacao.clear();
		campoTipoDeInstalacao.sendKeys(tipoDeInstalacao);
		//campoTipoDeInstalacao.click();
		navegador.findElement(By.id("ext-gen1171")).click();
		//navegador.findElement(By.id("boundlist-1128-listEl")).click();

		return this;
	}

	public CriarServicosDomicilioPage digitarInformacaoAdicional(String informacaoAdicional) {
		navegador.findElement(By.id("sfm-textarea-1070-inputEl")).clear();
		navegador.findElement(By.id("sfm-textarea-1070-inputEl")).sendKeys(informacaoAdicional);

		return this;
	}

	public CriarServicosDomicilioPage digitarCodigoDeBarrasDaFatura(String codigoDeBarrasDaFatura) {
		navegador.findElement(By.id("sfm-text-1050-inputEl")).clear();
		navegador.findElement(By.id("sfm-text-1050-inputEl")).sendKeys(codigoDeBarrasDaFatura);

		return this;
	}

	public CriarServicosDomicilioPage clicarGuardarWTTFull() {
		navegador.findElement(By.id("sfm-button-1094-btnEl")).click();
		return this;
	}

	public SolicitacaoClientePage clicarPopUpGuardarWTTFull() {
		navegador.findElement(By.id("sfm-button-1135-btnInnerEl")).click();

		return new SolicitacaoClientePage(navegador);
	}

}
