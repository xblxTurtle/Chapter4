
public class Game {	

public static void PlayGame()
{
	int randomNumber=0, tryCount=0, input=0;
	
	while (true)
	{
		System.out.println("Please enter any key to play or \"0\" to exit:");
		input = TextIO.getChar();
		if (input == '0')
		{
			System.out.println("\"0\" has been entered. Exiting. Thank you for playing.\n");
			break;
		}
		randomNumber = (int)(Math.random()*10)+1;
		System.out.println("Random number is generated.");
		tryCount = 0;
		
		while  (tryCount<6)
		{
			tryCount++;
			System.out.printf("Please enter your %d guess (\"0\" to exit):\n", tryCount);
			input = TextIO.getInt();
			if (input == 0)
			{
				System.out.println("\"0\" has been entered. Exiting. Thank you for playing.\n");
				return;
			}
			if (input == randomNumber)
			{
				System.out.println("Your input is correct. Congratulations! You won!\n");
				break;
			}
			else
			{
				System.out.println("Your input is not correct.\n");
			}
		}
	
	}
}

}
