abstract class Product
{

	protected String name;
	protected double unitCost;
	protected int quantity;
	
	public void Product(String a, double b)
	{
		this.name = a;
		this.unitCost = b;
		this.quantity = 0;
	}

	public abstract String placeOrder(int quantity);
	public abstract double price();
	@Override
	public String toString()
	{
		return name + " (" + unitCost + ")";
	}
}

