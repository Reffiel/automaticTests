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

public class CriarPortfolioWTTFullTest {
	private WebDriver navegador;
	private String user = "XXXX";
	private String pass = "XXXX";
	private int esperaAposClicarCriarPortfolioEServico = 25;
	
	@Before
	public void setUp() {
		navegador = Web.createChrome("WTTFull");
	}
	@Test
	public void criarSolicitacoesComPortfolioPrincipal(
			@Param(name = "conta") String conta, 
			@Param(name = "descricaoPortfolio") String descricaoPortfolio,
			@Param(name = "dataDeCompra") String dataDeCompra,
			@Param(name = "notasObservacoesPortfolio") String notasObservacoesPortfolio,
			@Param(name = "preco") String preco,
			@Param(name = "numeroDeSerie") String numeroDeSerie,
			@Param(name = "codigoDeBarras") String codigoDeBarras
			) throws InterruptedException
	{
		String nomePortfolio = new LoginFormPage(navegador)
		.fazerLogin(user,pass)
		.pesquisarPesquisaGlobal(conta)
		.clicarNaConta(conta)
		.clicarCriarPortfolio()
		.esperar(esperaAposClicarCriarPortfolioEServico)
		.digitarDescricao(descricaoPortfolio)
		.digitarNumeroDeSerie(numeroDeSerie)
		.digitarCodigoDeBarras(codigoDeBarras)
		.digitarPreco(preco)
		.digitarDataDeCompra(dataDeCompra)
		.digitarNotasObservacoes(notasObservacoesPortfolio)
		.clicarSalvarPortfolioWTTFull()
		.clicarPopUpGuardarWTTFull()
		.getNomePortfolio();
		
		System.out.println(nomePortfolio);
		
		assertEquals(descricaoPortfolio, nomePortfolio);
		String nomeArquivo = "C:\\test\\Screenshots\\" 
				+ suporte.Generator.dataHoraParaArquivo()
				+ "criarPortfolioPrincipal_" 
				+ numeroDeSerie 
				+ ".png";
		System.out.println(nomeArquivo);

		Screenshot.tirar(navegador, nomeArquivo);			
	
	}
	@Test
	public void criarSolicitacoesComPortfolioPrincipalEstadoAberta(
			@Param(name = "conta") String conta, 
			@Param(name = "descricaoPortfolio") String descricaoPortfolio,
			@Param(name = "dataDeCompra") String dataDeCompra,
			@Param(name = "notasObservacoesPortfolio") String notasObservacoesPortfolio,
			@Param(name = "preco") String preco,
			@Param(name = "numeroDeSerie") String numeroDeSerie,
			@Param(name = "codigoDeBarras") String codigoDeBarras
			) throws InterruptedException
	{
		String nomePortfolio = new LoginFormPage(navegador)
		.fazerLogin(user,pass)
		.pesquisarPesquisaGlobal(conta)
		.clicarNaConta(conta)
		.clicarCriarPortfolio()
		.esperar(esperaAposClicarCriarPortfolioEServico)
		.digitarDescricao(descricaoPortfolio)
		.digitarNumeroDeSerie(numeroDeSerie)
		.digitarCodigoDeBarras(codigoDeBarras)
		.digitarPreco(preco)
		.digitarDataDeCompra(dataDeCompra)
		.digitarNotasObservacoes(notasObservacoesPortfolio)
		.clicarSalvarPortfolioWTTFull()
		.clicarPopUpGuardarWTTFull()
		.getNomePortfolio();
		
		System.out.println(nomePortfolio);
		
		assertEquals(descricaoPortfolio, nomePortfolio);
		String nomeArquivo = "C:\\test\\Screenshots\\" 
				+ suporte.Generator.dataHoraParaArquivo()
				+ "criarPortfolioPrincipal_" 
				+ numeroDeSerie 
				+ ".png";
		System.out.println(nomeArquivo);

		Screenshot.tirar(navegador, nomeArquivo);			
	
	}
	@Test
	/*Cria portfólio principal de instalações*/
	public void criarSolicitacoesComPortfolioPrincipalEServicoInstalacao(
			@Param(name = "conta") String conta, 
			@Param(name = "descricaoPortfolio") String descricaoPortfolio,
			@Param(name = "dataDeCompra") String dataDeCompra,
			@Param(name = "notasObservacoesPortfolio") String notasObservacoesPortfolio,
			@Param(name = "preco") String preco,
			@Param(name = "numeroDeSerie") String numeroDeSerie,
			@Param(name = "codigoDeBarras") String codigoDeBarras
			) throws InterruptedException
	{
		String nomePortfolio = new LoginFormPage(navegador)
		.fazerLogin(user,pass)
		.pesquisarPesquisaGlobal(conta)
		.clicarNaConta(conta)
		.clicarCriarPortfolio()
		.esperar(esperaAposClicarCriarPortfolioEServico)
		.digitarDescricao(descricaoPortfolio)
		.digitarNumeroDeSerie(numeroDeSerie)
		.digitarCodigoDeBarras(codigoDeBarras)
		.digitarPreco(preco)
		.digitarDataDeCompra(dataDeCompra)
		.digitarNotasObservacoes(notasObservacoesPortfolio)
		.clicarSalvarPortfolioWTTFull()
		.clicarPopUpGuardarWTTFull()
		.getNomePortfolio();
		
		System.out.println(nomePortfolio);
		
		assertEquals(descricaoPortfolio, nomePortfolio);
		String nomeArquivo = "C:\\test\\Screenshots\\" 
				+ suporte.Generator.dataHoraParaArquivo()
				+ "criarPortfolioPrincipalInstalacoes_" 
				+ numeroDeSerie 
				+ ".png";
		System.out.println(nomeArquivo);

		Screenshot.tirar(navegador, nomeArquivo);			
	
	}
	@Test
	/*Cria portfólio principal de instalações estado aberta*/
	public void criarSolicitacoesComPortfolioPrincipalEServicoInstalacaoEstadoAberta(
			@Param(name = "conta") String conta, 
			@Param(name = "descricaoPortfolio") String descricaoPortfolio,
			@Param(name = "dataDeCompra") String dataDeCompra,
			@Param(name = "notasObservacoesPortfolio") String notasObservacoesPortfolio,
			@Param(name = "preco") String preco,
			@Param(name = "numeroDeSerie") String numeroDeSerie,
			@Param(name = "codigoDeBarras") String codigoDeBarras
			) throws InterruptedException
	{
		String nomePortfolio = new LoginFormPage(navegador)
		.fazerLogin(user,pass)
		.pesquisarPesquisaGlobal(conta)
		.clicarNaConta(conta)
		.clicarCriarPortfolio()
		.esperar(esperaAposClicarCriarPortfolioEServico)
		.digitarDescricao(descricaoPortfolio)
		.digitarNumeroDeSerie(numeroDeSerie)
		.digitarCodigoDeBarras(codigoDeBarras)
		.digitarPreco(preco)
		.digitarDataDeCompra(dataDeCompra)
		.digitarNotasObservacoes(notasObservacoesPortfolio)
		.clicarSalvarPortfolioWTTFull()
		.clicarPopUpGuardarWTTFull()
		.getNomePortfolio();
		
		System.out.println(nomePortfolio);
		
		assertEquals(descricaoPortfolio, nomePortfolio);
		String nomeArquivo = "C:\\test\\Screenshots\\" 
				+ suporte.Generator.dataHoraParaArquivo()
				+ "criarPortfolioPrincipalInstalacoes_" 
				+ numeroDeSerie 
				+ ".png";
		System.out.println(nomeArquivo);

		Screenshot.tirar(navegador, nomeArquivo);			
	
	}
	@Test
	/*Cria portfólio principal de ServiçosCliente*/
	public void criarSolicitacoesComPortfolioPrincipalEServicoCliente(
			@Param(name = "conta") String conta, 
			@Param(name = "descricaoPortfolio") String descricaoPortfolio,
			@Param(name = "dataDeCompra") String dataDeCompra,
			@Param(name = "notasObservacoesPortfolio") String notasObservacoesPortfolio,
			@Param(name = "preco") String preco,
			@Param(name = "numeroDeSerie") String numeroDeSerie,
			@Param(name = "codigoDeBarras") String codigoDeBarras
			) throws InterruptedException
	{
		String nomePortfolio = new LoginFormPage(navegador)
		.fazerLogin(user,pass)
		.pesquisarPesquisaGlobal(conta)
		.clicarNaConta(conta)
		.clicarCriarPortfolio()
		.esperar(esperaAposClicarCriarPortfolioEServico)
		.digitarDescricao(descricaoPortfolio)
		.digitarNumeroDeSerie(numeroDeSerie)
		.digitarCodigoDeBarras(codigoDeBarras)
		.digitarPreco(preco)
		.digitarDataDeCompra(dataDeCompra)
		.digitarNotasObservacoes(notasObservacoesPortfolio)
		.clicarSalvarPortfolioWTTFull()
		.clicarPopUpGuardarWTTFull()
		.getNomePortfolio();
		
		System.out.println(nomePortfolio);
		
		assertEquals(descricaoPortfolio, nomePortfolio);
		String nomeArquivo = "C:\\test\\Screenshots\\" 
				+ suporte.Generator.dataHoraParaArquivo()
				+ "criarPortfolioPrincipalSolicitacoesCliente_" 
				+ numeroDeSerie 
				+ ".png";
		System.out.println(nomeArquivo);

		Screenshot.tirar(navegador, nomeArquivo);			
	
	}
	@Test
	/*Cria portfólio principal de ServiçosCliente estado aberta*/
	public void criarSolicitacoesComPortfolioPrincipalEServicoClienteEstadoAberta(
			@Param(name = "conta") String conta, 
			@Param(name = "descricaoPortfolio") String descricaoPortfolio,
			@Param(name = "dataDeCompra") String dataDeCompra,
			@Param(name = "notasObservacoesPortfolio") String notasObservacoesPortfolio,
			@Param(name = "preco") String preco,
			@Param(name = "numeroDeSerie") String numeroDeSerie,
			@Param(name = "codigoDeBarras") String codigoDeBarras
			) throws InterruptedException
	{
		String nomePortfolio = new LoginFormPage(navegador)
		.fazerLogin(user,pass)
		.pesquisarPesquisaGlobal(conta)
		.clicarNaConta(conta)
		.clicarCriarPortfolio()
		.esperar(esperaAposClicarCriarPortfolioEServico)
		.digitarDescricao(descricaoPortfolio)
		.digitarNumeroDeSerie(numeroDeSerie)
		.digitarCodigoDeBarras(codigoDeBarras)
		.digitarPreco(preco)
		.digitarDataDeCompra(dataDeCompra)
		.digitarNotasObservacoes(notasObservacoesPortfolio)
		.clicarSalvarPortfolioWTTFull()
		.clicarPopUpGuardarWTTFull()
		.getNomePortfolio();
		
		System.out.println(nomePortfolio);
		
		assertEquals(descricaoPortfolio, nomePortfolio);
		String nomeArquivo = "C:\\test\\Screenshots\\" 
				+ suporte.Generator.dataHoraParaArquivo()
				+ "criarPortfolioPrincipalSolicitacoesCliente_" 
				+ numeroDeSerie 
				+ ".png";
		System.out.println(nomeArquivo);

		Screenshot.tirar(navegador, nomeArquivo);			
	
	}
	
	@After
	public void tearDown() {
		// Fechar o navegador
		navegador.quit();
		
	}
	

}
