package co.com.fincaraiz.userinterfaces;



import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class DepartmentElements {
	/*
	 * El metodo DEPARTMENT recibe el parametro  el cual usará para mapear
	 * el elemento por el nombre ingresado en el feature. 
	 */
	public static Target DEPARTMENT(String department) {
		System.out.println(department);
		return Target.the("Department").located(By.name(department));
	}
	
	
}
