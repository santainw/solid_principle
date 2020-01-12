package app;

import app.animal.Animal;
import app.animal.Chicken;
import app.animal.Dog;
import app.animal.Mleg;
import app.animal.Physical;
import app.mse.imgAnaly.ImageAnalytics;
import app.sci.employee.Employee;
import app.sci.employee.Teacher;

public class App {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal mleg = new Mleg();
		mleg.showLegs();
		
		Physical chicken = new Chicken();
		System.out.println(chicken.headTouched("foot"));
		System.out.println(chicken.headTouched("finger"));
		
		Animal dog = new Dog();
		dog.showLegs();
	}

}
