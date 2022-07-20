package Ab;

public abstract class Vehicle {
	protected int speed;
	public void setSpeed(int s) {
		speed = s;
		System.out.println("速度を" + speed + "にしました");
	}
	
	public abstract void show();
}