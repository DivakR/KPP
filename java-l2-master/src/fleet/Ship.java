package fleet;

public class Ship {
	protected String name;
	protected int displacement;
	
	public Ship(String name, int displacement)
	{
		this.name = name;
		this.displacement = displacement;
	}
	
	public void swim() {
		//move instead of swim
	}
}
