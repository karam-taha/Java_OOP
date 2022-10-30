package zookeeperpart2;

public class Mammal {
	protected int energyLevel;
	
	public Mammal() {
		super();
		this.energyLevel = 100;
	}
	
	public int displayEnergy() {
		System.out.println("Current energy level: " + energyLevel);
		return this.energyLevel;
	}
}
