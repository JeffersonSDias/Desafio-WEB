package br.com.shoestock_PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import br.com.shoestock_ElementMap.Conferencia_EM;

public class Conferencia_PO extends Conferencia_EM {
	private WebDriver driver;

	public Conferencia_PO(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public String produtoDoCarrinho() {
		return driver.findElement(By.xpath(
				"//ul[@class='customer-products']//div[@class='product-info']//strong[@class='product-name name']"))
				.getText();

	}

}
