package kadai08_03.shape;

public abstract class Figure {
	public abstract void area();
	public abstract void around();
	public void measure(){
		area();
		around();
	};
}
