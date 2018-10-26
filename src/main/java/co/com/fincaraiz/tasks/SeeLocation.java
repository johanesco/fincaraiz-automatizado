package co.com.fincaraiz.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.fincaraiz.userinterfaces.PropertyElements;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class SeeLocation implements Task {

	private String description;
	
	 public SeeLocation(String description) {
		this.description=description;
	}
	@Override
	public <T extends Actor> void performAs(T actor) {
		// actor.attemptsTo(Click.on(PropertyElements.CHANGE_IMAGE));
		System.out.println(PropertyElements.LOCATION_PROPERTY);
		actor.attemptsTo(Click.on(PropertyElements.LOCATION_PROPERTY));
		
	}
	

	public static SeeLocation LocationProperty(String description) {
		
		return instrumented(SeeLocation.class,description);
	}

}
