package oopsConcept;

public class TestCar {

	public static void main(String[] args) {
		
		try {
			BMW bmw = new BMW();
			
			bmw.start();
			bmw.safety();
			bmw.operate();
			bmw.parking();
			bmw.stop();
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		

	}

}
