package pack1;

public abstract class AbstractCar {
	
private	int distance;
	
	private AbstractCar(int distance) {
		this.distance=distance;
	}
	
	public AbstractCar() {
		this(0);
		System.out.println("AbstractCar default constructor");
	}

}
