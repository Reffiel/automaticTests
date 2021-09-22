package testsWTTFull;

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
@DataLoader(filePaths = "CriarCenariosDeTesteWTTFull.csv")

public class CriarSolicitacaoWTTFullTest {
	private WebDriver navegador;

	@Before
	public void setUp() {
		navegador = Web.createChrome("WTTFull");
	}
	@Test
	public void criarSolicitacoesComPortfolioPrincipal(
			@Param(name = "conta") String conta, 
			@Param(name = "cp") String cp,
			@Param(name = "nomeLoja") String nomeLoja,
			@Param(name = "descricaoPortfolio") String descricaoPortfolio,
			@Param(name = "dataDeCompra") String dataDeCompra,
			@Param(name = "notasObservacoesPortfolio") String notasObservacoesPortfolio,
			@Param(name = "preco") String preco,
			@Param(name = "numeroDeSerie") String numeroDeSerie,
			@Param(name = "codigoDeBarras") String codigoDeBarras, 
			@Param(name = "canal") String canal,
			@Param(name = "localizacaoDeArtigo") String localizacaoDeArtigo,
			@Param(name = "tipificacaoDaAvaria") String tipificacaoDaAvaria,
			@Param(name = "estadoFisicoDoArtigo") String estadoFisicoDoArtigo,
			@Param(name = "descricaoEstadoFisico") String descricaoEstadoFisico,
			@Param(name = "descricaoDoProblema") String descricaoDoProblema,
			@Param(name = "resultado") String resultado
			) throws InterruptedException
	{
		String estadoDaSolicitacao = new LoginFormPage(navegador)
		.fazerLogin("XXXX", "XXXX")
		.pesquisarPesquisaGlobal(numeroDeSerie)
		.clicarNoPortfolio(descricaoPortfolio)
		.esperar(5)
		.clicarCriarSolicitacaoDeClienteWTTFull()
		.esperar(20)
		.digitarNomeLoja(nomeLoja)
		.clicarPesquisarNomeLoja()
		.esperar(3)
		.selecionarNomeDaLocalizacao(nomeLoja)
		.esperar(3)
		.digitarCanalWTTFull(canal)
		.digitarCodigoPostal(cp)
		.digitarLocalizacaoDeArtigoWTTFull(localizacaoDeArtigo)
		.digitarTipificacaoDaAvariaWTTFull(tipificacaoDaAvaria)
		.digitarEstadoFisicoDoArtigoWTTFull(estadoFisicoDoArtigo)
		.digitarDescricaoEstadoFisico(descricaoEstadoFisico)
		.digitarDescricaoDoProblema(descricaoDoProblema)
		.clicarGuardarWTTFull()
		.clicarPopUpGuardarWTTFull()
		.esperar(25)
		.clicarEncaminharParaTratamentoWTTFull()
		.esperar(30)
		.verificaEstadoDaSolicitacao()
		;
		System.out.println(estadoDaSolicitacao);
		
		assertEquals(resultado, estadoDaSolicitacao);
		String nomeArquivo = "C:\\test\\Screenshots\\" 
				+ suporte.Generator.dataHoraParaArquivo()
				+ "testCriarSolicitacaoPortPrincipal_NumeroDeSerie_" 
				+ numeroDeSerie 
				+ ".png";
		System.out.println(nomeArquivo);

		Screenshot.tirar(navegador, nomeArquivo);			
	
	}
	@Test
	public void criarSolicitacoesComPortfolioPrincipalEstadoAberta(
			@Param(name = "conta") String conta, 
			@Param(name = "cp") String cp,
			@Param(name = "nomeLoja") String nomeLoja,
			@Param(name = "descricaoPortfolio") String descricaoPortfolio,
			@Param(name = "dataDeCompra") String dataDeCompra,
			@Param(name = "notasObservacoesPortfolio") String notasObservacoesPortfolio,
			@Param(name = "preco") String preco,
			@Param(name = "numeroDeSerie") String numeroDeSerie,
			@Param(name = "codigoDeBarras") String codigoDeBarras, 
			@Param(name = "canal") String canal,
			@Param(name = "localizacaoDeArtigo") String localizacaoDeArtigo,
			@Param(name = "tipificacaoDaAvaria") String tipificacaoDaAvaria,
			@Param(name = "estadoFisicoDoArtigo") String estadoFisicoDoArtigo,
			@Param(name = "descricaoEstadoFisico") String descricaoEstadoFisico,
			@Param(name = "descricaoDoProblema") String descricaoDoProblema,
			@Param(name = "resultado") String resultado
			) throws InterruptedException
	{
		String estadoDaSolicitacao = new LoginFormPage(navegador)
		.fazerLogin("XXXX", "XXXX")
		.pesquisarPesquisaGlobal(numeroDeSerie)
		.clicarNoPortfolio(descricaoPortfolio)
		.esperar(5)
		.clicarCriarSolicitacaoDeClienteWTTFull()
		.esperar(20)
		.digitarNomeLoja(nomeLoja)
		.clicarPesquisarNomeLoja()
		.esperar(3)
		.selecionarNomeDaLocalizacao(nomeLoja)
		.esperar(3)
		.digitarCanalWTTFull(canal)
		.digitarCodigoPostal(cp)
		.digitarLocalizacaoDeArtigoWTTFull(localizacaoDeArtigo)
		.digitarTipificacaoDaAvariaWTTFull(tipificacaoDaAvaria)
		.digitarEstadoFisicoDoArtigoWTTFull(estadoFisicoDoArtigo)
		.digitarDescricaoEstadoFisico(descricaoEstadoFisico)
		.digitarDescricaoDoProblema(descricaoDoProblema)
		.clicarGuardarWTTFull()
		.clicarPopUpGuardarWTTFull()
		.esperar(25)
		.verificaEstadoDaSolicitacao()
		;
		System.out.println(estadoDaSolicitacao);
		
		assertEquals(resultado, estadoDaSolicitacao);
		String nomeArquivo = "C:\\test\\Screenshots\\" 
				+ suporte.Generator.dataHoraParaArquivo()
				+ "testCriarSolicitacaoPortPrincipal_NumeroDeSerie_" 
				+ numeroDeSerie 
				+ ".png";
		System.out.println(nomeArquivo);

		Screenshot.tirar(navegador, nomeArquivo);			
	
	}
	@Test
	public void criarSolicitacoesComPortfolioPrincipalEServicoInstalacao(
			@Param(name = "cp") String cp,
			@Param(name = "nomeLoja") String nomeLoja,
			@Param(name = "descricaoPortfolioFilho") String descricaoPortfolioFilho, 
			@Param(name = "numeroSeriePortfolioFilho") String numeroSeriePortfolioFilho,
			@Param(name = "codigoDeBarras") String codigoDeBarras, 
			@Param(name = "canal") String canal,
			@Param(name = "localizacaoDeArtigo") String localizacaoDeArtigo,
			@Param(name = "tipificacaoDaAvaria") String tipificacaoDaAvaria,
			@Param(name = "tipodeinstalacaoPortfolioFilho") String tipodeinstalacaoPortfolioFilho,
			@Param(name = "descricaoDoProblema") String descricaoDoProblema,
			@Param(name = "resultado") String resultado
			) throws InterruptedException
	{
		String estadoDaSolicitacao = new LoginFormPage(navegador)
		.fazerLogin("XXXX", "XXXX")
		.pesquisarPesquisaGlobal(numeroSeriePortfolioFilho)
		.clicarNoPortfolio(descricaoPortfolioFilho)
		.esperar(10)
		.clicarCriarServicoDomicilioWTTFull()
		.esperar(20)
		.digitarNomeLoja(nomeLoja)
		.clicarPesquisarNomeLoja()
		.esperar(3)
		.selecionarNomeDaLocalizacao(nomeLoja)
		.esperar(3)
		.digitarTipoDeInstalacaoWTTFull(tipodeinstalacaoPortfolioFilho)
		.digitarCodigoPostal(cp)
		.digitarInformacaoAdicional(descricaoDoProblema)
		.digitarCodigoDeBarrasDaFatura(codigoDeBarras)
		.digitarCanalWTTFull(canal)
		.clicarGuardarWTTFull()
		.clicarPopUpGuardarWTTFull()
		.esperar(25)
		.clicarEncaminharParaTratamentoWTTFull()
		.esperar(30)
		.verificaEstadoDaSolicitacao();
		
		System.out.println(estadoDaSolicitacao);

		assertEquals(resultado, estadoDaSolicitacao);
		String nomeArquivo = "C:\\test\\Screenshots\\" + suporte.Generator.dataHoraParaArquivo()
				+ "testCriarSolicitacao_NumeroDeSeriePortFilho_" + numeroSeriePortfolioFilho + ".png";
		System.out.println(nomeArquivo);

		Screenshot.tirar(navegador, nomeArquivo);

	}
	@Test
	public void criarSolicitacoesComPortfolioPrincipalEServicoInstalacaoEstadoAberta(
			@Param(name = "cp") String cp,
			@Param(name = "nomeLoja") String nomeLoja,
			@Param(name = "descricaoPortfolioFilho") String descricaoPortfolioFilho, 
			@Param(name = "numeroSeriePortfolioFilho") String numeroSeriePortfolioFilho,
			@Param(name = "codigoDeBarras") String codigoDeBarras, 
			@Param(name = "canal") String canal,
			@Param(name = "localizacaoDeArtigo") String localizacaoDeArtigo,
			@Param(name = "tipificacaoDaAvaria") String tipificacaoDaAvaria,
			@Param(name = "tipodeinstalacaoPortfolioFilho") String tipodeinstalacaoPortfolioFilho,
			@Param(name = "descricaoDoProblema") String descricaoDoProblema,
			@Param(name = "resultado") String resultado
			) throws InterruptedException
	{
		String estadoDaSolicitacao = new LoginFormPage(navegador)
		.fazerLogin("XXXX", "XXXX")
		.pesquisarPesquisaGlobal(numeroSeriePortfolioFilho)
		.clicarNoPortfolio(descricaoPortfolioFilho)
		.esperar(10)
		.clicarCriarServicoDomicilioWTTFull()
		.esperar(20)
		.digitarNomeLoja(nomeLoja)
		.clicarPesquisarNomeLoja()
		.esperar(3)
		.selecionarNomeDaLocalizacao(nomeLoja)
		.esperar(3)
		.digitarTipoDeInstalacaoWTTFull(tipodeinstalacaoPortfolioFilho)
		.digitarCodigoPostal(cp)
		.digitarInformacaoAdicional(descricaoDoProblema)
		.digitarCodigoDeBarrasDaFatura(codigoDeBarras)
		.digitarCanalWTTFull(canal)
		.clicarGuardarWTTFull()
		.clicarPopUpGuardarWTTFull()
		.esperar(25)
		.verificaEstadoDaSolicitacao();
		
		System.out.println(estadoDaSolicitacao);

		assertEquals(resultado, estadoDaSolicitacao);
		String nomeArquivo = "C:\\test\\Screenshots\\" + suporte.Generator.dataHoraParaArquivo()
				+ "testCriarSolicitacao_NumeroDeSeriePortFilho_" + numeroSeriePortfolioFilho + ".png";
		System.out.println(nomeArquivo);

		Screenshot.tirar(navegador, nomeArquivo);

	}
	@Test
	public void criarSolicitacoesComPortfolioPrincipalEServicoCliente(
			@Param(name = "conta") String conta, 
			@Param(name = "cp") String cp,
			@Param(name = "nomeLoja") String nomeLoja,
			@Param(name = "descricaoPortfolioFilho") String descricaoPortfolioFilho, 
			@Param(name = "numeroSeriePortfolioFilho") String numeroSeriePortfolioFilho,
			@Param(name = "dataDeCompra") String dataDeCompra,
			@Param(name = "notasObservacoesPortfolio") String notasObservacoesPortfolio,
			@Param(name = "preco") String preco,
			@Param(name = "codigoDeBarras") String codigoDeBarras, 
			@Param(name = "canal") String canal,
			@Param(name = "localizacaoDeArtigo") String localizacaoDeArtigo,
			@Param(name = "tipificacaoDaAvaria") String tipificacaoDaAvaria,
			@Param(name = "estadoFisicoDoArtigo") String estadoFisicoDoArtigo,
			@Param(name = "descricaoEstadoFisico") String descricaoEstadoFisico,
			@Param(name = "descricaoDoProblema") String descricaoDoProblema,
			@Param(name = "resultado") String resultado
			) throws InterruptedException
	{
		String estadoDaSolicitacao = new LoginFormPage(navegador)
		.fazerLogin("XXXX", "XXXX")
		.pesquisarPesquisaGlobal(numeroSeriePortfolioFilho)
		.clicarNoPortfolio(descricaoPortfolioFilho)
		.esperar(5)
		.clicarCriarSolicitacaoDeClienteWTTFull()
		.esperar(20)
		.digitarNomeLoja(nomeLoja)
		.clicarPesquisarNomeLoja()
		.esperar(3)
		.selecionarNomeDaLocalizacao(nomeLoja)
		.esperar(3)
		.digitarCanalWTTFull(canal)
		.digitarCodigoPostal(cp)
		.digitarLocalizacaoDeArtigoWTTFull(localizacaoDeArtigo)
		.digitarTipificacaoDaAvariaWTTFull(tipificacaoDaAvaria)
		.digitarEstadoFisicoDoArtigoWTTFull(estadoFisicoDoArtigo)
		.digitarDescricaoEstadoFisico(descricaoEstadoFisico)
		.digitarDescricaoDoProblema(descricaoDoProblema)
		.clicarGuardarWTTFull()
		.clicarPopUpGuardarWTTFull()
		.esperar(25)
		.clicarEncaminharParaTratamentoWTTFull()
		.esperar(30)
		.verificaEstadoDaSolicitacao()
		;
		System.out.println(estadoDaSolicitacao);
		
		assertEquals(resultado, estadoDaSolicitacao);
		String nomeArquivo = "C:\\test\\Screenshots\\" 
				+ suporte.Generator.dataHoraParaArquivo()
				+ "testCriarSolicitacaoPortServicoCliente_NumeroDeSerie_" 
				+ numeroSeriePortfolioFilho 
				+ ".png";
		System.out.println(nomeArquivo);

		Screenshot.tirar(navegador, nomeArquivo);			
	
	}
	@After
	public void tearDown() {
		 navegador.close();
	}
}
