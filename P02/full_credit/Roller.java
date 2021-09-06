import java.util.Scanner; // Add input Scanner libraryq
import java.util.Arrays;

public class Roller
{
	public static void main(String[] args) 
	{
		Scanner inputScan = new Scanner(System.in); // Create input scanner as an object
		int numDices, facesPerDie;
		System.out.print("Please enter number of Dices: ");
		numDices = inputScan.nextInt(); 
		System.out.print("Please enter number of faces per Die: ");
		facesPerDie = inputScan.nextInt(); 
		int[] diceRolls = new int[numDices];

		for(int i = 0; i < numDices;i++)
		{
			diceRolls[i] = ((int)(100*Math.random()))/(100/facesPerDie);
			System.out.println(diceRolls[i]);
		}
    	}
}