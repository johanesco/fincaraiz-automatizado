package co.com.fincaraiz.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class PropertyElements {
	int image = 0;

	public static final Target FILTER = Target.the("Filter order").located(By.id("lst_Order"));
	public static final Target CHANGE_IMAGE = Target.the("Change image").located(By.id("ctl00_phMasterPage_cAdvert_photoArrowRight"));
	public static final Target	DESCRIPTION = Target.the("Description field").locatedBy("//*[@class='link_buttons']/a");
	public static final Target LOCATION_PROPERTY = Target.the("Location of the property").locatedBy("//*[@class='link_buttons']/a[contains(text(),'ver mapa')]");

	public static Target POSITION(Integer position) {
		System.out.println(position);
		int image = position - 1;
		String ElementPosition = "rowIndex_" + image;
		System.out.println(ElementPosition);
		return Target.the("Apartment").located(By.id(ElementPosition));
	}

}
