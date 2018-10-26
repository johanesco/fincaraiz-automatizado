package co.com.fincaraiz.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class ZoneElemlents {
	
	public static Target ZONE(String zone) {
		return Target.the("Zone").located(By.name(zone));
	}

}
