package Figure;

public abstract class Figure{
	public abstract void area();
	public abstract void around();
	public void measure() {
		this.area();
		this.around();
	}
}