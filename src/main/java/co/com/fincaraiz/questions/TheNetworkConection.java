package co.com.fincaraiz.questions;

import java.util.List;

import co.com.fincaraiz.userinterfaces.HomeElements;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class TheNetworkConection implements Question<List<String>>{

	@Override
	public List<String> answeredBy(Actor actor) {
		// TODO Auto-generated method stub
		return Text.of(HomeElements.VIVIENDA_BUTTON).viewedBy(actor).asList();
	
	
	}
	
	public static TheNetworkConection verify()
	{
		return new TheNetworkConection();
	}

}
