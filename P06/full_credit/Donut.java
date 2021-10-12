import java.util.ArrayList;
class Donut extends Product {
	public Donut(String name, double price, double cost, Frosting frosting, boolean sprinkles, Filling filling)
	{
		this.name = name;
		this.price = price;
		this.cost = cost;
		
	}

	@Override
	public String toString()
	{
		return "Donut";
	}

	protected Frosting frosting;
	protected boolean sprinkles;
	protected Filling filling;
}