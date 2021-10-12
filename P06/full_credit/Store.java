import java.util.ArrayList;
import java.util.Scanner; 

public class Store
{
	public void Store(String storeName) 
	{
		this.storeName = storeName;
    	}

	public String storeName()
	{
		return this.storeName;
	}

	public void addProduct(Product product)
	{
		//products.add(product);
	}

	public int numberOfProducts()
	{
		return products.size();
	}

	public String toString(int productIndex)
	{
		return "Store"; //products.get(productIndex).toString();
	}

	@Override
	public String toString()
	{
		return "";
	}

	protected String storeName;
	protected ArrayList<Product> products = new ArrayList<>();
}