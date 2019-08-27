package com.Osdark.screenplay.dojo.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/inicio_sesion.feature",
        glue = {"com.Osdark.screenplay.dojo.stepdefinition"}, snippets = SnippetType.CAMELCASE)
public class InicioSesion {
}
