package pages;

import org.openqa.selenium.WebDriver;

/*Página base para métodos em comum em todo resolve.(todas pages devem extender)*/
public class BasePage {
	protected WebDriver navegador;
	
	public BasePage(WebDriver navegador) {
		this.navegador = navegador;
	}
	
}
