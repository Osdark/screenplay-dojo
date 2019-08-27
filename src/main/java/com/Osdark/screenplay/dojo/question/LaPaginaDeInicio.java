package com.Osdark.screenplay.dojo.question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.Osdark.screenplay.dojo.userinterface.PaginaInicioPage.CAMPO_BUSCAR_REPOSITORIO;

public class LaPaginaDeInicio implements Question<Boolean> {
    public static Question<Boolean> esVisible() {
        return new LaPaginaDeInicio();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return CAMPO_BUSCAR_REPOSITORIO.resolveFor(actor).isVisible();
    }
}
