package br.com.shoestock_PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import br.com.shoestock_ElementMap.MenuSuperior_EM;
import br.com.shoestock_ElementMap.ResultadoDaPesquisa_EM;

public class Pesquisa_PO extends MenuSuperior_EM {
	private WebDriver driver;

	public Pesquisa_PO(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public ResultadoDaPesquisa_PO pesquisarNaBarra(String categoria) {
		barraDePesquisa.sendKeys(categoria);
		btn_Buscar.click();
		return new ResultadoDaPesquisa_PO(driver);
	}

}
