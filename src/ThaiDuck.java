
public class ThaiDuck extends Duck {

	public ThaiDuck() {
		quackBehavior = new KabKab();
		flyBehavior = new FlyRocketPowered();
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I'm a real Thai duck");

	}

}
