import java.util.ArrayList;
class Java extends Product {
	public Java(String name, double price, double cost, Darkness darkness)
	{
		this.name = name;
		this.price = price;
		this.cost = cost;
		
	}

	public void addShot(Shot shot)
	{
		shots.add(shot);
	}

	@Override
	public String toString()
	{
		return "Java";
	}

	protected Darkness darkness;
	protected ArrayList<Shot> shots;
}