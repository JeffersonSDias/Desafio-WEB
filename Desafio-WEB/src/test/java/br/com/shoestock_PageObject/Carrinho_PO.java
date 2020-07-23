package br.com.shoestock_PageObject;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import br.com.shoestock_ElementMap.Carrinho_EM;
import br.com.shoestock_ElementMap.ResultadoDaPesquisa_EM;

public class Carrinho_PO extends Carrinho_EM {

	private WebDriver driver;

	public Carrinho_PO(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public Login_PO clicarEmContinuar() {
		btn_Continuar.click();
		return new Login_PO(driver);
	}

	public String precoDoProduto() {
		return labelPrecoDoProduto.getText();
	}

	public String codigoDoProduto() {
		return labelCodigoDoProduto.getText();
	}

	public String descricaoDoProduto() {
		return labelNomeDoProduto.getText();
	}
}
