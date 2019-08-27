package com.Osdark.screenplay.dojo.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://github.com/login")
public class InicioSesionPage extends PageObject {

    public static final Target CAMPO_USUARIO = Target.the("campo_usuario")
            .located(By.id("login_field"));

    public static final Target CAMPO_CONTRASEÑA = Target.the("campo_contrasena")
            .located(By.id("password"));

    public static final Target BOTON_INGRESAR = Target.the("boton_ingresar")
            .located(By.name("commit"));
}
