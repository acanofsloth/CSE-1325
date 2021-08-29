import java.util.Scanner; // Add input Scanner library

public class hello_bonus
{
	public static void main(String[] args) 
	{
		Scanner inputName = new Scanner(System.in); // Create input scanner as an object
		String userName;
		System.out.print("Please enter your name: ");
		userName = inputName.nextLine(); // Place user input as a string onto userName
		System.out.println("Hello " + userName + "!");
    	}
}
