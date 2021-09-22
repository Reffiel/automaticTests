package suporte;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web {
	public static WebDriver createChrome(String ambiente) {
		// Cria Webdriver para a automatização
		WebDriver navegador = new ChromeDriver();
		//Espera implicita de 30 segundos
		navegador.manage (). timeouts (). implicitlyWait (30, TimeUnit.SECONDS);
		// Maximiza a tela
		navegador.manage().window().maximize();
		// Navega para o endereço do SVMAX
		if(ambiente == "QA") {
			navegador.get("https://cs87.salesforce.com/home/home.jsp");
		}else{
		navegador.get("https://wservicemax--wttfull.my.salesforce.com/");
		}
		return navegador;
	}
	
}
