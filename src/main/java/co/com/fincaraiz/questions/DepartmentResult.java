package co.com.fincaraiz.questions;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.List;

import co.com.fincaraiz.tasks.SelectDepartment;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class DepartmentResult implements Question<List<String>> {

	@Override
	public List<String> answeredBy(Actor actor) {
		// TODO Auto-generated method stub
		return null;
	}


//	public static  DepartmentResult InMap(String department) {
//		return instrumented(DepartmentResult.class,department);
//	}


}
