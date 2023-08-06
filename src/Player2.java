
public class Player2 extends Player1 {
	private int health;
	private boolean armour;
	public Player2(String name, String weapon, int health,  boolean armour) {
		super(name, weapon, health);
		this.health = health;
		this.armour = armour;
	}
	@Override
	public void damagebygun1() {
		// TODO Auto-generated method stub
		if (armour) {
			this.health-=20;
			if (this.health<=0) this.health=0;
			System.out.println("Armour is on . Got hit by gun1. health is reduced by 20 "+" new health is " +this.health);

		}

		if(!armour) {
			this.health-=30;
			if (this.health<=0) this.health=0;
			System.out.println("Armour is off .Got hit by gun1.hhealth is reduced by 30"+"new health is "+this.health);
		}
		if(this.health==0) {
			System.out.println(getName()+"is dead");
		}

	}
	@Override
	public void damagebygun2() {
		// TODO Auto-generated method stub
		if (armour) {
			this.health-=40;
			if (this.health<=0) this.health=0;
			System.out.println("Armour is on .Got hit by gun2 . health is reduced by 20 "+" new health is "+this.health);

		}

		if(!armour) {
			this.health-=50;
			if (this.health<=0) this.health=0;
			System.out.println("Armour is off .got hit by gun2 . health is reduced by 30"+"new health is "+this.health);
		}
		if(this.health==0) {
			System.out.println(getName()+"is dead");
		}
	}
	@Override
	public void heal() {
		// TO DO Auto-generated method stub
		super.heal();
	}	
}


