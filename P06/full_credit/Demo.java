public class Demo {
	public static void main(String[] args)
	{
		Store JADE = new Store();
		Donut Plain = new Donut("Plain",2.25,2.25,Frosting.unfrosted,false,Filling.unfilled);
		JADE.addProduct(Plain);
		System.out.println(JADE.toString(0));
	}
}
