package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
/*Pagina para efetuar pedido de substitui��o*/
public class EfetuarPedidoDeSubstituicaoPage extends BasePage {

	public EfetuarPedidoDeSubstituicaoPage(WebDriver navegador) {
		super(navegador);

	}

	public EfetuarPedidoDeSubstituicaoPage esperar(int segundos) throws InterruptedException {
		Thread.sleep(segundos * 1000);

		return this;
	}

	public EfetuarPedidoDeSubstituicaoPage digitarNomeDeUtilizador(String nomeDeUtilizador) {
		navegador.findElement(By.xpath(
				"//div[@id='j_id0:j_id38:inForm:j_id41:j_id46:j_id48']//input[@name='j_id0:j_id38:inForm:j_id41:j_id46:j_id50']"))
				.sendKeys(nomeDeUtilizador);
		return this;
	}
	/*
	 * Identifico elemento e fa�o select no elemento buscando a descri��o conforme op��es:
	 *   Artigo de origem reparador incompleto,Satisfa��o Devolu��o,Artigo entregue na loja reparado,Artigo entregue no cliente reparado,Artigo n�o conforme depois de repara��o,Artigo sem avaria,Avaria &gt; 3 Processos - S/ envio para Rep,Avaria 1� Processo - S/ envio para Rep,Avaria 2� Processo - S/ envio para Rep,Avaria 3� Processo - S/ envio para Rep,Avarias Sucessivas,Cancelado/Duplicado,Dano Fisico,Dano Fisico na rece��o,Dentro de prazo repara��o,Erro de Sistema,Erro na abertura de processo,Extravio,Falta artigo - Devolvido ao Entreposto >90dias,Falta fornecimento de pe�as,Falta fornecimento de pe�as Worten MP,Fora das condi��es de SD, art baixo valor,Incumprimento - Prazo de Expedi��o,Incumprimento - Prazo de Recolha/Entrega,Incumprimento - Prazo Reincid�ncia,Incumpr-Prazo Reincid�ncia-S/Acordo Fornc,Incumprimento - Prazo Repara��o,Incumpr-Prazo Repara��o-S/Acordo Fornecedor,Incumpr-Prazo Repara��o-S/Acordo PrestServ,Incumprimento - Resposta a notifica��es,Incumprimento - Valida��o or�amento,Inefici�ncias Operacionais,N�o abrangido pelas condi��es,N abrangido pelas condi��es - Oxida��o/Ferrugem,N abrangido pelas condi��es - Uso Indevido,N abrangido pelas condi��es da Garantia,N abrangido pelas condi��es da Garantia - Danos,N abrangido pelas condi��es da Garantia - Oxida��o/Ferrugem,N abrangido pelas condi��es da Garantia - Uso Indevido,N�o abrangido pelas condi��es de DOA,Nenhuma entidade incumpriu,Outlet [Depreciado]-Rep econ�micamente invi�vel,PVP <50�,Reincid�ncia de avaria,Repara��o economicamente Invi�vel,Tecnicamente Irrepar�vel,Troca Autorizada - Cliente n aceita Repara��o,Troca Direta n�o parametrizada,Campo exclusivo de Espanha n�o usar,Artigo n�o conforme por m� instala��o
	 * 
	 */
	public EfetuarPedidoDeSubstituicaoPage digitarMotivoDeSubstituicao(String motivoDeSubstituicao) {
		WebElement campoMotivoDeSubstituicao = navegador.findElement(By.name("j_id0:j_id38:inForm:j_id41:j_id52:j_id57"));
		new Select(campoMotivoDeSubstituicao).selectByVisibleText(motivoDeSubstituicao);
		
		return this;
	}
	/*
	 * Identifico elemento e fa�o select no elemento buscando a descri��o conforme op��es:
	 *   QA PT Worten1
	 *   WORTEN ESPANA DISTRIB
	 *   WORTEN CANARIAS
	 *   ENT. BAZAR PESADO
	 */
	public EfetuarPedidoDeSubstituicaoPage digitarOutrasEntidades(String outrasEntidades) {
		WebElement campoOutrasEntidades = navegador.findElement(By.name("j_id0:j_id38:inForm:asection2:respOtherEntity:j_id89"));
		new Select(campoOutrasEntidades).selectByVisibleText(outrasEntidades);

		return this;
	}
	/*
	 * Identifico elemento e fa�o select no elemento buscando a descri��o conforme op��es:
	 *   Sim
	 *   N�o
	 */
	public EfetuarPedidoDeSubstituicaoPage digitarClienteEmLoja(String clienteEmLoja) {
		WebElement campoClienteEmLoja = navegador.findElement(By.name("j_id0:j_id38:inForm:j_id61:j_id71:j_id73"));
		new Select(campoClienteEmLoja).selectByVisibleText(clienteEmLoja);
		
		return this;
	}
	
	public EfetuarPedidoDeSubstituicaoPage digitarObservacoes(String observacoes) {
		navegador.findElement(By.xpath("//div[@id='j_id0:j_id38:inForm:j_id61:j_id75:j_id77']//textarea[@name='j_id0:j_id38:inForm:j_id61:j_id75:j_id79']")).sendKeys(observacoes);
		
		return this;
	}
	
	public SolicitacaoClientePage clicarGuardar(){
		navegador.findElement(By.id("j_id0:j_id38:inForm:j_id39")).click();
		
		return new SolicitacaoClientePage(navegador);
	}
	
	

}
