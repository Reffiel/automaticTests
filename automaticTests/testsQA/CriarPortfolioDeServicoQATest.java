package testsQA;

import static org.junit.Assert.assertEquals;

import org.easetech.easytest.annotation.DataLoader;
import org.easetech.easytest.annotation.Param;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import pages.LoginFormPage;
import suporte.Screenshot;
import suporte.Web;

@RunWith(DataDrivenTestRunner.class)
@DataLoader(filePaths = "CriarCenariosDeTesteQA.csv")

public class CriarPortfolioDeServicoQATest {
	private WebDriver navegador;

	@Before
	public void setUp() {
		navegador = Web.createChrome("QA");
	}
	@Test
	public void criarSolicitacoesComPortfolioPrincipalEServicoInstalacao(
			@Param(name = "descricaoPortfolio") String descricaoPortfolio,
			@Param(name = "dataDeCompra") String dataDeCompra,
			@Param(name = "notasObservacoesPortfolio") String notasObservacoesPortfolio,
			@Param(name = "preco") String preco,
			@Param(name = "numeroDeSerie") String numeroDeSerie,
			@Param(name = "codigoDeBarras") String codigoDeBarras, 
			@Param(name = "descricaoPortfolioFilho") String descricaoPortfolioFilho, 
			@Param(name = "numeroSeriePortfolioFilho") String numeroSeriePortfolioFilho
			) throws InterruptedException
	{
		String nomePortfolioFilho = new LoginFormPage(navegador)
		.fazerLogin("XXXX", "XXXX")
		.pesquisarPesquisaGlobal(numeroDeSerie)
		.clicarNoPortfolio(descricaoPortfolio)
		.clicarAssociarServicos()
		.esperar(20)
		.digitarDescricao(descricaoPortfolioFilho)
		.digitarNumeroDeSerie(numeroSeriePortfolioFilho)
		.digitarCodigoDeBarras(codigoDeBarras)
		.digitarPreco(preco)
		.clicarSalvarPortfolioQA()
		.clicarPopUpGuardarQA()
		.esperar(7)
		.getNomePortfolioFilhoQA()
		;
		System.out.println(nomePortfolioFilho);
		
		assertEquals(descricaoPortfolioFilho, nomePortfolioFilho);
		String nomeArquivo = "C:\\test\\Screenshots\\" 
				+ suporte.Generator.dataHoraParaArquivo()
				+ "testCriarPortfolioFilhoInstalacao_NumeroDeSerie_" 
				+ numeroDeSerie 
				+ "_QA.png";
		System.out.println(nomeArquivo);

		Screenshot.tirar(navegador, nomeArquivo);			
	
	}
	@Test
	public void criarSolicitacoesComPortfolioPrincipalEServicoInstalacaoEstadoAberta(
			@Param(name = "descricaoPortfolio") String descricaoPortfolio,
			@Param(name = "dataDeCompra") String dataDeCompra,
			@Param(name = "notasObservacoesPortfolio") String notasObservacoesPortfolio,
			@Param(name = "preco") String preco,
			@Param(name = "numeroDeSerie") String numeroDeSerie,
			@Param(name = "codigoDeBarras") String codigoDeBarras, 
			@Param(name = "descricaoPortfolioFilho") String descricaoPortfolioFilho, 
			@Param(name = "numeroSeriePortfolioFilho") String numeroSeriePortfolioFilho
			) throws InterruptedException
	{
		String nomePortfolioFilho = new LoginFormPage(navegador)
				.fazerLogin("XXXX", "XXXX")
				.pesquisarPesquisaGlobal(numeroDeSerie)
				.clicarNoPortfolio(descricaoPortfolio)
				.clicarAssociarServicos()
				.esperar(20)
				.digitarDescricao(descricaoPortfolioFilho)
				.digitarNumeroDeSerie(numeroSeriePortfolioFilho)
				.digitarCodigoDeBarras(codigoDeBarras)
				.digitarPreco(preco)
				.clicarSalvarPortfolioQA()
				.clicarPopUpGuardarQA()
				.esperar(7)
				.getNomePortfolioFilhoQA()
				;
		System.out.println(nomePortfolioFilho);
		
		assertEquals(descricaoPortfolioFilho, nomePortfolioFilho);
		String nomeArquivo = "C:\\test\\Screenshots\\" 
				+ suporte.Generator.dataHoraParaArquivo()
				+ "testCriarPortfolioFilhoInstalacao_NumeroDeSerie_" 
				+ numeroDeSerie 
				+ "_QA.png";
		System.out.println(nomeArquivo);

		Screenshot.tirar(navegador, nomeArquivo);			
	
	}
	@Test
	public void criarSolicitacoesComPortfolioPrincipalEServicoCliente(
			@Param(name = "descricaoPortfolio") String descricaoPortfolio,
			@Param(name = "dataDeCompra") String dataDeCompra,
			@Param(name = "notasObservacoesPortfolio") String notasObservacoesPortfolio,
			@Param(name = "preco") String preco,
			@Param(name = "numeroDeSerie") String numeroDeSerie,
			@Param(name = "codigoDeBarras") String codigoDeBarras, 
			@Param(name = "descricaoPortfolioFilho") String descricaoPortfolioFilho, 
			@Param(name = "numeroSeriePortfolioFilho") String numeroSeriePortfolioFilho
			) throws InterruptedException
	{
		String nomePortfolioFilho = new LoginFormPage(navegador)
				.fazerLogin("XXXX", "XXXX")
				.pesquisarPesquisaGlobal(numeroDeSerie)
				.clicarNoPortfolio(descricaoPortfolio)
				.clicarAssociarServicos()
				.esperar(20)
				.digitarDescricao(descricaoPortfolioFilho)
				.digitarNumeroDeSerie(numeroSeriePortfolioFilho)
				.digitarCodigoDeBarras(codigoDeBarras)
				.digitarPreco(preco)
				.clicarSalvarPortfolioQA()
				.clicarPopUpGuardarQA()
				.esperar(7)
				.getNomePortfolioFilhoQA()
				;
		System.out.println(nomePortfolioFilho);
		
		assertEquals(descricaoPortfolioFilho, nomePortfolioFilho);
		String nomeArquivo = "C:\\test\\Screenshots\\" 
				+ suporte.Generator.dataHoraParaArquivo()
				+ "testCriarPortfolioFilhoServicoCliente_NumeroDeSerie_" 
				+ numeroDeSerie 
				+ "_QA.png";
		System.out.println(nomeArquivo);

		Screenshot.tirar(navegador, nomeArquivo);			
	
	}
	@Test
	public void criarSolicitacoesComPortfolioPrincipalEServicoClienteEstadoAberta(
			@Param(name = "descricaoPortfolio") String descricaoPortfolio,
			@Param(name = "dataDeCompra") String dataDeCompra,
			@Param(name = "notasObservacoesPortfolio") String notasObservacoesPortfolio,
			@Param(name = "preco") String preco,
			@Param(name = "numeroDeSerie") String numeroDeSerie,
			@Param(name = "codigoDeBarras") String codigoDeBarras, 
			@Param(name = "descricaoPortfolioFilho") String descricaoPortfolioFilho, 
			@Param(name = "numeroSeriePortfolioFilho") String numeroSeriePortfolioFilho
			) throws InterruptedException
	{
		String nomePortfolioFilho = new LoginFormPage(navegador)
				.fazerLogin("XXXX", "XXXX")
				.pesquisarPesquisaGlobal(numeroDeSerie)
				.clicarNoPortfolio(descricaoPortfolio)
				.esperar(5)
				.clicarAssociarServicos()
				.esperar(20)
				.digitarDescricao(descricaoPortfolioFilho)
				.digitarNumeroDeSerie(numeroSeriePortfolioFilho)
				.digitarCodigoDeBarras(codigoDeBarras)
				.digitarPreco(preco)
				.clicarSalvarPortfolioQA()
				.clicarPopUpGuardarQA()
				.esperar(7)
				.getNomePortfolioFilhoQA()
				;
		System.out.println(nomePortfolioFilho);
		
		assertEquals(descricaoPortfolioFilho, nomePortfolioFilho);
		String nomeArquivo = "C:\\test\\Screenshots\\" 
				+ suporte.Generator.dataHoraParaArquivo()
				+ "testCriarPortfolioFilhoServicoCliente_NumeroDeSerie_" 
				+ numeroDeSerie 
				+ "_QA.png";
		System.out.println(nomeArquivo);

		Screenshot.tirar(navegador, nomeArquivo);			
	
	}
	@After
	public void tearDown() {
		 navegador.close();
	}
}
