package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
/*Pagina de criação de solicitação de cliente*/
public class CriarSolicitacaoPage extends BasePage {

	public CriarSolicitacaoPage(WebDriver navegador) {
		super(navegador);

	}

	public CriarSolicitacaoPage esperar(int segundos) throws InterruptedException {
		Thread.sleep(segundos * 1000);

		return this;
	}

	public CriarSolicitacaoPage digitarNomeLoja(String loja) {
		navegador.findElement(By.id("svmx-text-1045-inputEl")).sendKeys(loja);

		return this;
	}

	public CriarSolicitacaoPage clicarPesquisarNomeLoja() {
		navegador.findElement(By.id("svmx-button-1046")).click();

		return this;
	}
	public CriarSolicitacaoPage selecionarNomeDaLocalizacao(String nomeLoja) {
		navegador.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		navegador.findElement(By.xpath("//*[@id=\"gridview-1166\"]//div[text()='" + nomeLoja + "']")).click();
		navegador.findElement(By.id("sfm-button-1157-btnInnerEl")).click();

		return this;
	}
	public CriarSolicitacaoPage digitarCodigoPostal(String cp) {
		navegador.findElement(By.id("sfm-text-1058-inputEl")).clear();
		navegador.findElement(By.id("sfm-text-1058-inputEl")).sendKeys(cp);

		return this;
	}
	
	
	/*
	 * Localizo o elemento para poder manipular
		 * 	Limpar o que esta escrito e 
		 * 	Escrever de acordo com a lista(	Call Center,
		 * 									Loja,
		 * 									Estrutura Central)
	 * Após efetuo click no elemento apresentando a opção
	 */
	public CriarSolicitacaoPage digitarCanalQA(String canal) {
		WebElement campoCanal = navegador.findElement(By.id("sfm-picklist-1049-inputEl"));
		campoCanal.clear();
		campoCanal.sendKeys(canal);
		navegador.findElement(By.id("boundlist-1149-listEl")).click();

		return this;
	}
	public CriarSolicitacaoPage digitarCanalWTTFull(String canal) {
		WebElement campoCanal = navegador.findElement(By.id("sfm-picklist-1049-inputEl"));
		campoCanal.clear();
		campoCanal.sendKeys(canal);
		navegador.findElement(By.id("boundlist-1173-listEl")).click();

		return this;
	}
	/*
	 * Localizo o elemento para poder manipular
		 * 	Limpar o que esta escrito e 
		 * 	Escrever de acordo com a lista(	Loja,
		 * 									Cliente)
	 * Após efetuo click no elemento apresentando a opção
	 */
	public CriarSolicitacaoPage digitarLocalizacaoDeArtigoQA(String localizacaoDeArtigo) {
		WebElement campoLocalizacaoDeArtigo = navegador.findElement(By.id("sfm-picklist-1052-inputEl"));
		campoLocalizacaoDeArtigo.clear();
		campoLocalizacaoDeArtigo.sendKeys(localizacaoDeArtigo);
		navegador.findElement(By.id("boundlist-1151-listEl")).click();

		return this;
	}
	
	public CriarSolicitacaoPage digitarLocalizacaoDeArtigoWTTFull(String localizacaoDeArtigo) {
		WebElement campoLocalizacaoDeArtigo = navegador.findElement(By.id("sfm-picklist-1052-inputEl"));
		campoLocalizacaoDeArtigo.clear();
		campoLocalizacaoDeArtigo.sendKeys(localizacaoDeArtigo);
		navegador.findElement(By.id("boundlist-1175-listEl")).click();

		return this;
	}
	/*
	 * Localizo o elemento para poder manipular
		 * 	Limpar o que esta escrito e 
		 * 	Escrever de acordo com a lista(	Constante,
		 * 									Apenas determinadas estações / software / modo / canais / frequência banda / rede(s),
		 * 									No modo de espera / inativo / desligado,
		 * 									Depois de um tempo,
		 * 									Apenas em certos padrões ou sistemas,
		 * 									Apenas com certas entradas,
		 * 									Somente em determinada saída (s),
		 * 									Quando interligado, utilizado com equipamento externo específico, o kit adaptador,
		 *									Somente ao enviar / escrever,
		 * 									Somente com determinada media,
		 * 									Somente ao receber / ler,
		 * 									Intermitente
		 * 									)
	 * Após efetuo click no elemento apresentando a opção
	 */
	public CriarSolicitacaoPage digitarTipificacaoDaAvariaQA(String tipificacaoDaAvaria) {
		WebElement campoTipificacaoDaAvaria = navegador.findElement(By.id("sfm-picklist-1103-inputEl"));
		campoTipificacaoDaAvaria.clear();
		campoTipificacaoDaAvaria.sendKeys(tipificacaoDaAvaria);
		navegador.findElement(By.id("boundlist-1153-listEl")).click();

		return this;
	}
	public CriarSolicitacaoPage digitarTipificacaoDaAvariaWTTFull(String tipificacaoDaAvaria) {
		WebElement campoTipificacaoDaAvaria = navegador.findElement(By.id("sfm-picklist-1103-inputEl"));
		campoTipificacaoDaAvaria.clear();
		campoTipificacaoDaAvaria.sendKeys(tipificacaoDaAvaria);
		navegador.findElement(By.id("boundlist-1177-listEl")).click();

		return this;
	}
	/*
	 * Localizo o elemento para poder manipular
		 * 	Limpar o que esta escrito e 
		 * 	Escrever de acordo com a lista(	Com danos,
		 * 									Sem danos com sinais de uso, 
		 * 									Domicílio - A verificar)
	 * Após efetuo click no elemento apresentando a opção
	 */
	public CriarSolicitacaoPage digitarEstadoFisicoDoArtigoQA(String estadoFisicoDoArtigo) {
		WebElement campoEstadoFisicoDoArtigo = navegador.findElement(By.id("sfm-picklist-1108-inputEl"));
		campoEstadoFisicoDoArtigo.clear();
		campoEstadoFisicoDoArtigo.sendKeys(estadoFisicoDoArtigo);
		navegador.findElement(By.id("boundlist-1155-listEl")).click();

		return this;
	}
	public CriarSolicitacaoPage digitarEstadoFisicoDoArtigoWTTFull(String estadoFisicoDoArtigo) {
		WebElement campoEstadoFisicoDoArtigo = navegador.findElement(By.id("sfm-picklist-1108-inputEl"));
		campoEstadoFisicoDoArtigo.clear();
		campoEstadoFisicoDoArtigo.sendKeys(estadoFisicoDoArtigo);
		navegador.findElement(By.id("boundlist-1179-listEl")).click();

		return this;
	}
	public CriarSolicitacaoPage digitarDescricaoEstadoFisico(String descricaoEstadoFisico) {
		navegador.findElement(By.id("sfm-textarea-1111-inputEl")).sendKeys(descricaoEstadoFisico);

		return this;
	}

	public CriarSolicitacaoPage digitarDescricaoDoProblema(String descricaoDoProblema) {
		navegador.findElement(By.id("sfm-textarea-1115-inputEl")).sendKeys(descricaoDoProblema);

		return this;
	}

	public CriarSolicitacaoPage clicarGuardarQA() {
		navegador.findElement(By.id("sfm-button-1139-btnIconEl")).click();
		return this;
	}
	public CriarSolicitacaoPage clicarGuardarWTTFull() {
		navegador.findElement(By.id("sfm-button-1139-btnIconEl")).click();
		return this;
	}
	

	public SolicitacaoClientePage clicarPopUpGuardarQA() {
		navegador.findElement(By.id("sfm-button-1184")).click();

		return new SolicitacaoClientePage(navegador);
	}
	public SolicitacaoClientePage clicarPopUpGuardarWTTFull() {
		navegador.findElement(By.id("sfm-button-1184-btnInnerEl")).click();

		return new SolicitacaoClientePage(navegador);
	}
	
}
