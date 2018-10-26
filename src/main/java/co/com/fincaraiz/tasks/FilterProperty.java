package co.com.fincaraiz.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.fincaraiz.userinterfaces.PropertyElements;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class FilterProperty implements Task {

	private String filter;

	public FilterProperty(String filter) {
		this.filter = filter;
	}
	/*
	 * El actor intenta seleccionar la opcion de filtro de las opciones de filtro
	 * que existe en el elemento
	 */
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		System.out.println("order esta como "+filter);
		actor.attemptsTo(SelectFromOptions.byValue(filter).from(PropertyElements.FILTER));
		
	}
/*
 * FilterProperty recibe el parametro del orden y retorna a esta misma clase
 */
	public static  FilterProperty in(String filter) {
		return instrumented(FilterProperty.class,filter);
	}
	
	

}
