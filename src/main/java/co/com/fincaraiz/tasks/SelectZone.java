package co.com.fincaraiz.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.fincaraiz.userinterfaces.ZoneElemlents;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class SelectZone implements Task {

	private String zone;

	public SelectZone(String zone) {
		this.zone = zone;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Click.on(ZoneElemlents.ZONE(zone)));
		 //	testUser.should(seeThat(NewToursResult.displayed(),hasItem(option)).orComplainWith(FailureMessage.class,
		//FailureMessage.FailureMessage(option)));
		
	}

	public static  SelectZone InMap(String zone) {
		return instrumented(SelectZone.class,zone);
	}


}
