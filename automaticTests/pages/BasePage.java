package pages;

import org.openqa.selenium.WebDriver;

/*P�gina base para m�todos em comum em todo resolve.(todas pages devem extender)*/
public class BasePage {
	protected WebDriver navegador;
	
	public BasePage(WebDriver navegador) {
		this.navegador = navegador;
	}
	
}
