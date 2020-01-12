package app.animal;

public class Chicken implements Animal, Physical {

	public void showLegs() {
		System.out.println("2 leg");
	}
	
	public String headTouched(String object) {
		if(object.equals("foot")) {
			return "fuck";
		} else {
			return "gug gug...";
		}
	}
}
