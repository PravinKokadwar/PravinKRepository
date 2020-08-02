package abstractionConcepts;

public class BMW implements Car {

	
	// This are 
	@Override
	public void start() {
		System.out.println("BMW started");

	}

	@Override
	public void stop() {
		System.out.println("BMW Stopped");

	}

	@Override
	public void refuel() {
		System.out.println("BMW Refulled");
		
	}
		
	public void theftSafety() {
		
		System.out.println("The car is protected againest theft");
	}	

	

}
