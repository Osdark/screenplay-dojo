package com.Osdark.screenplay.dojo.stepdefinition;

import com.Osdark.screenplay.dojo.model.Usuario;
import com.Osdark.screenplay.dojo.question.LaPaginaDeInicio;
import com.Osdark.screenplay.dojo.task.Autenticar;
import com.Osdark.screenplay.dojo.userinterface.InicioSesionPage;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class InicioSesionStepDefinition {

    private InicioSesionPage inicioSesionPage;

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^\"([^\"]*)\" quiere autenticarse$")
    public void quiereAutenticarse(String actor) {
        theActorCalled(actor).attemptsTo(
                Open.browserOn(inicioSesionPage)
        );
    }


    @When("^Cesar se autentica$")
    public void cesarSeAutentica() {
        theActorInTheSpotlight().attemptsTo(
                Autenticar.alUsuario(new Usuario("Osdark", "osdark123"))
        );
    }

    @Then("^Cesar debe ver la pagina de inicio$")
    public void cesarDebeVerLaPaginaDeInicio() {
        theActorInTheSpotlight().should(seeThat(LaPaginaDeInicio.esVisible()));
    }
}
