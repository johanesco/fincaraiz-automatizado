package co.com.fincaraiz.StepsDefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.hasItem;

import org.openqa.selenium.WebDriver;

import co.com.fincaraiz.AssertionError.FailDescription;
import co.com.fincaraiz.questions.ValorResult;
import co.com.fincaraiz.tasks.FilterProperty;
import co.com.fincaraiz.tasks.OpenTheBrowser;
import co.com.fincaraiz.tasks.SeeLocation;
import co.com.fincaraiz.tasks.SelectDepartment;
import co.com.fincaraiz.tasks.SelectProperty;
import co.com.fincaraiz.tasks.SelectZone;
import co.com.fincaraiz.userinterfaces.OpenFincaRaizHome;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class FincaRaizStepsDefinitions {

	// Anotación que toma el WebDriver
	@Managed(driver = "chrome")

	// Le asigno un nombre al WebDriver, a partir de ahora será hisBrowser y será
	// usado por el actor
	private WebDriver hisBrowser;

	// Le asigno un nombre al actor, a artir de ahora su nombre será Pepito y será
	// quien haga las acciones del proyecto
	private Actor Pedro = Actor.named("Pedro");

	// Instancio la clase OpenFincaRaizHome y le asigno el nombre de fincaraizhome.
	// Esta clase la traigo del paquete userinterfaces
	private OpenFincaRaizHome fincaraizhome;

	// Hago un constructor que indica que pepito puede abrir el navegador web con su
	// Browser (Webdriver)
	// La anotación @Before es una anotación de cucumber que uso para indicar que
	// será lo primero que ejecute antes de entrar a los otros metdos
	@Before
	public void setUp() {
		Pedro.can(BrowseTheWeb.with(hisBrowser));
	}

	// Clase
	// OpenTheBroser, Creo una clase para poder abrir el navegador, la clase se
	// encuentra en el paquete task
	// En el @Given Pepito (el actor) abre el navegador en la página
	// fincaraiz.com.co
	@Given("^that Pedro open the browser in the fincaraiz\\.com\\.co page to search a property$")
	public void thatPedroOpenTheBrowserInTheFincaraizComCoPageToSearchAProperty() throws Exception {
		Pedro.wasAbleTo(OpenTheBrowser.on(fincaraizhome));
	}
	/*
	 * Voy a la clase SelecDepartment y llevo el parametro department al metodo InMap
	 * El actor intenta seleccionar el departamento en el mapa
	 * 
	 */
	@When("^he sees the Colombian map and press click on the departament (.*)$")
	public void heSeesTheColombianMapAndPressClickOnTheDepartament(String department) throws Exception {
		Pedro.attemptsTo(SelectDepartment.InMap(department));
		//Pedro.attemptsTo(DepartmentResult.in(department));
	

	}
	/*
	 * El actor presiona click sobre la la zona del departamento
	 */
	@When("^he press click on the map from (.*)$")
	public void hePressClickOnTheMapFrom(String zone) throws Exception {
		Pedro.attemptsTo(SelectZone.InMap(zone));
	}

	/*
	 * Pedro selecciona el filtro en el cual quiere que se le ordenen las propiedades
	 * precio ordenes de precio, orden de area...
	 */
	@When("^he select the filter order of the property in (.*)$")
	public void heSelectTheFilterOrderOfThePropertyIn(String filter) throws Exception {
		Pedro.attemptsTo(FilterProperty.in(filter));
	}
	/*
	 * Pedro intenta seleccionar la posicion de la propiedad que desea ver
	 */
	@When("^Pedro select the property in the position (.*) and see the Photos$")
	public void pedroSelectThePropertyInThePositionAndSeeThePhotos(int position) throws Exception {
		Pedro.attemptsTo(SelectProperty.Position(position));

	}

	//
	@Then("^he should see the Description (.*)$")
	public void heShouldSeeTheDescription(String location) throws Exception {
	   
		
		Pedro.should(seeThat(ValorResult.FieldValue(),hasItem(location)).orComplainWith(FailDescription.class,
				FailDescription.FailDescription(location)));
		
		Pedro.attemptsTo(SeeLocation.LocationProperty(location));
		Thread.sleep(5000);
	}

	

}
