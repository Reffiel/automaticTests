package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
/*Pagina de login no resolve*/
public class LoginFormPage extends BasePage {

	public LoginFormPage(WebDriver navegador) {
		super(navegador);
	}

	public LoginFormPage digitarLogin(String login) {
		navegador.findElement(By.id("username")).sendKeys(login);

		return this;
	}

	public LoginFormPage digitarSenha(String senha) {
		navegador.findElement(By.id("password")).sendKeys(senha);

		return this;
	}

	public HomePage clickLogin() {
		navegador.findElement(By.id("Login")).click();

		return new HomePage(navegador);
	}
	//Funcional para efetuar login
	public HomePage fazerLogin(String login, String senha) {
		return digitarLogin(login).digitarSenha(senha).clickLogin();

	}

}
