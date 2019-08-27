package com.Osdark.screenplay.dojo.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaInicioPage {
    public static final Target CAMPO_BUSCAR_REPOSITORIO = Target.the("campo_buscar_repositorio")
            .located(By.id("dashboard-repos-filter-left"));
}
