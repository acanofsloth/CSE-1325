// Ivan Martinez
// CSE-1325
// 9/6/2021
//

import java.util.Arrays; // Add Arrays.sort

public class Roller
{
	public static void main(String[] args) 
	{
		// Declare Variables
		if(args.length != 2) throw new IllegalArgumentException("usage: java Roll [#dice] [#sides]"); 
		int numDices = Integer.parseInt(args[0]), facesPerDie = Integer.parseInt(args[1]), numSum = 0, numAverage = 0;
		int[] diceRolls = new int[numDices]; // Create array sizeOf # of Dices 

		// Add Rolls to array
		for(int i = 0; i < numDices;i++) 
		{
			diceRolls[i] = (int)(100*Math.random())/(100/facesPerDie); // Rolled Dice = Generate dice roll from 0-100 / Probability to land per dice face
			if(diceRolls[i] == facesPerDie){diceRolls[i]--;} // Incase math.random generates number 100, include to max dice face. 
			numSum = numSum + diceRolls[i]; // Add for sum count
		}
		
		numAverage = numSum/numDices; // Calculate Average of all Dice Rolls
		
		// Organize and Print
		Arrays.sort(diceRolls);
		for(int i = 0; i < numDices;i++) 
		{
			System.out.print(diceRolls[i] + " ");
		}
		System.out.print(numSum + " " + numAverage);
	}
}