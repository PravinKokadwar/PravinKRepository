package abstractionConcepts;

public interface Car {

	// THUMB RULE :- Interface contains only and only Abstract methods, we achieve
	// 100% Abstraction.
	// Only Final and Static variables.
	//Abstract classes are faster then Interfaces.
	
		int wheels = 4;

	public void start();

	public void stop();

	public void refuel();

}
