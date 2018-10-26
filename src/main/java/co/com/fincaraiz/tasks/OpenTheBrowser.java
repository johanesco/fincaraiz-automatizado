package co.com.fincaraiz.tasks;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.hamcrest.CoreMatchers.hasItem;

import co.com.fincaraiz.AssertionError.NetworkFailure;
import co.com.fincaraiz.questions.TheNetworkConection;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

//Clase publica en la cual se implementa una tarea para ser realizada por el actor o usuario (pepito)
public class OpenTheBrowser implements Task {

	private PageObject page;

	public OpenTheBrowser(PageObject page) {
		this.page = page; // El this. identifica que nos referimos a la variable de clase page, el otro
							// llega como parametro
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(page));
		page.getDriver().manage().window().maximize();

		actor.should(seeThat(TheNetworkConection.verify(), hasItem("Vivienda")).orComplainWith(NetworkFailure.class,
				NetworkFailure.NO_CONNECTION));

	}

	// Recibo la página del Given como page
	public static OpenTheBrowser on(PageObject page) {

		return instrumented(OpenTheBrowser.class, page);
	}

}
