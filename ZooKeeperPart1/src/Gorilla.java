
public class Gorilla extends Mammal {
	
	public Gorilla() {
		super();
	}
	
	public void throwSomething(){
		System.out.println("Gorilla has thrown something!");
		this.energyLevel -= 5;
		this.displayEnergy();
		System.out.println("--------------------");
	}
	
	public void eatBananas(){
		System.out.println("Bananas are tasty!");
		this.energyLevel += 10;
		this.displayEnergy();
		System.out.println("--------------------");
	}
	
	public void climb(){
		System.out.println("Gorilla has climbed a tree");
		this.energyLevel -= 10;
		this.displayEnergy();
		System.out.println("--------------------");
	}
}
