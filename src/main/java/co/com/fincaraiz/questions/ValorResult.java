package co.com.fincaraiz.questions;

import java.util.List;

import co.com.fincaraiz.userinterfaces.PropertyElements;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValorResult implements Question<List<String>> {

	@Override
	public List<String> answeredBy(Actor actor) {
		// TODO Auto-generated method stub
		return Text.of(PropertyElements.DESCRIPTION).viewedBy(actor).asList();
	}

	public static ValorResult FieldValue() {
		// TODO Auto-generated method stub
		return new ValorResult();
	}

	

}
