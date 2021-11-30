import java.util.ArrayList;
import java.text.NumberFormat;

public class Primes {
    public Primes(int numThreads) {
    }
    public Primes findPrimes(int lower, int upper) {
	int test = 0; //square root value
	while(lower < upper+1)
	{
		System.out.print(lower);
		test = 1;
		if(lower < 2){test = 0;}
		for(int i = 2; i < Math.sqrt(lower)+1;i++) // test if prime number
		{
			if(lower%i == 0) // is not a prime number
			{
				test = 0;
			}
		}
		if(lower == 2){test = 1;}
		if(test == 1)
		{
			System.out.println(" is a Prime Number!");
			//primes.add(lower);
		}
		else { System.out.println(); }
		lower++;
	}
        return this;    
    }
    public int numberOfPrimes() {
	
        return 0;//primes.size(); // replace
    }
    public Integer[] toArray() {
	
        return new Integer[0]; // replace
    }
    
    public static void main(String[] args) {
        int numThreads = 1;
        int lower = 0;
        int upper = 1000; // defaults
        if(args.length > 0) numThreads = Integer.parseInt(args[0]);
        if(args.length > 1) lower = Integer.parseInt(args[1]);
        if(args.length > 2) upper = Integer.parseInt(args[2]);
        if(args.length > 3) {
            System.err.println("usage: java Primes [lower upper]");
            System.exit(-args.length);
        }
        
        Primes primes = new Primes(numThreads); // Search using one thread
        int sumOfPrimes = 0;
        for(int prime : primes.findPrimes(lower, upper).toArray())
            sumOfPrimes += prime;
        System.out.println("Sum of the " + primes.numberOfPrimes() + " primes between " 
                         + lower + " and " 
                         + upper + " is " 
                         + NumberFormat.getIntegerInstance().format(sumOfPrimes));
    }

    private ArrayList<Integer> primes;
    private int numThreads;
}
