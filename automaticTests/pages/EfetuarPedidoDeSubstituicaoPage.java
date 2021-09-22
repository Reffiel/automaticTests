package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
/*Pagina para efetuar pedido de substituição*/
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
	 * Identifico elemento e faço select no elemento buscando a descrição conforme opções:
	 *   Artigo de origem reparador incompleto,Satisfação Devolução,Artigo entregue na loja reparado,Artigo entregue no cliente reparado,Artigo não conforme depois de reparação,Artigo sem avaria,Avaria &gt; 3 Processos - S/ envio para Rep,Avaria 1º Processo - S/ envio para Rep,Avaria 2º Processo - S/ envio para Rep,Avaria 3º Processo - S/ envio para Rep,Avarias Sucessivas,Cancelado/Duplicado,Dano Fisico,Dano Fisico na receção,Dentro de prazo reparação,Erro de Sistema,Erro na abertura de processo,Extravio,Falta artigo - Devolvido ao Entreposto >90dias,Falta fornecimento de peças,Falta fornecimento de peças Worten MP,Fora das condições de SD, art baixo valor,Incumprimento - Prazo de Expedição,Incumprimento - Prazo de Recolha/Entrega,Incumprimento - Prazo Reincidência,Incumpr-Prazo Reincidência-S/Acordo Fornc,Incumprimento - Prazo Reparação,Incumpr-Prazo Reparação-S/Acordo Fornecedor,Incumpr-Prazo Reparação-S/Acordo PrestServ,Incumprimento - Resposta a notificações,Incumprimento - Validação orçamento,Ineficiências Operacionais,Não abrangido pelas condições,N abrangido pelas condições - Oxidação/Ferrugem,N abrangido pelas condições - Uso Indevido,N abrangido pelas condições da Garantia,N abrangido pelas condições da Garantia - Danos,N abrangido pelas condições da Garantia - Oxidação/Ferrugem,N abrangido pelas condições da Garantia - Uso Indevido,Não abrangido pelas condições de DOA,Nenhuma entidade incumpriu,Outlet [Depreciado]-Rep económicamente inviável,PVP <50€,Reincidência de avaria,Reparação economicamente Inviável,Tecnicamente Irreparável,Troca Autorizada - Cliente n aceita Reparação,Troca Direta não parametrizada,Campo exclusivo de Espanha não usar,Artigo não conforme por má instalação
	 * 
	 */
	public EfetuarPedidoDeSubstituicaoPage digitarMotivoDeSubstituicao(String motivoDeSubstituicao) {
		WebElement campoMotivoDeSubstituicao = navegador.findElement(By.name("j_id0:j_id38:inForm:j_id41:j_id52:j_id57"));
		new Select(campoMotivoDeSubstituicao).selectByVisibleText(motivoDeSubstituicao);
		
		return this;
	}
	/*
	 * Identifico elemento e faço select no elemento buscando a descrição conforme opções:
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
	 * Identifico elemento e faço select no elemento buscando a descrição conforme opções:
	 *   Sim
	 *   Não
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
