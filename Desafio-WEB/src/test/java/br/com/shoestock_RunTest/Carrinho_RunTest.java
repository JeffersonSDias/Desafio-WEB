package br.com.shoestock_RunTest;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/Carrinho.feature", 
				 glue = "classpath:br.com.shoestock_StepDefinition",
				 dryRun = false,
				 monochrome = true,
				 plugin = {"pretty","html:target/Carrinho.html"}
)

public class Carrinho_RunTest {

}
