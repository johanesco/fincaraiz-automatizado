package co.com.fincaraiz.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.fincaraiz.userinterfaces.DepartmentElements;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class SelectDepartment implements Task {

	
	private String department;
	//Creo un constructor que recibe el parametro y me le asigna un nombre
	 public SelectDepartment(String departament) {
		this.department=departament;
	}
	 
	 //tarea del actor
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		/*
		 * El actor intenta hacer click, esta tarea va al metodo DEPARTMENT de la clase 
		 * DepartmentElements llevando el parametro ingresado desde el feature
		 */
		actor.attemptsTo(Click.on(DepartmentElements.DEPARTMENT(department)));


	}
	
	/*
	 * Recibo el parametro department tipo String y lo retorno a esta misma clase
	 */
	public static  SelectDepartment InMap(String department) {
		return instrumented(SelectDepartment.class,department);
	}
}
