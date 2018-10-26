package co.com.fincaraiz.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.fincaraiz.userinterfaces.PropertyElements;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class SelectProperty implements Task {

	private Integer position;

	public SelectProperty(Integer position) {
		this.position = position;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		if (position>30) {
			position=30;
		}
		// actor.attemptsTo(Click.on(ZoneElemlents.ZONE(zone)));
		actor.attemptsTo(Click.on(PropertyElements.POSITION(position)));

		for (int i = 0; i <= 3; i++) {
			actor.attemptsTo(Click.on(PropertyElements.CHANGE_IMAGE));
		}
				
	}
	
	/*
	 * recibo el parametro de la posicion a observer
	 */
	public static SelectProperty Position(int position) {
		return instrumented(SelectProperty.class, position);
	}

}
