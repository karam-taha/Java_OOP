package zookeeperpart2;

public class Bat extends Mammal{
	
	public Bat() {
		super();
		this.energyLevel = 300;
	}
	
	public void fly(){
		System.out.println("Bat has flown!");
		this.energyLevel -= 50;
		this.displayEnergy();
		System.out.println("--------------------");
	}
	
	public void eatHumans(){
		System.out.println("Humans are tasty!");
		this.energyLevel += 25;
		this.displayEnergy();
		System.out.println("--------------------");
	}
	
	public void attackTown(){
		System.out.println("Bat enraged");
		this.energyLevel -= 100;
		this.displayEnergy();
		System.out.println("--------------------");
	}
}
