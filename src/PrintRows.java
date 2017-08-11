import javax.xml.soap.Text;

public class PrintRows {
	 static void PrintRowsFromString(String input)
	{
		System.out.println("Printing rows from string " + input + ":");
		System.out.println();
		for (int i=0; i<input.length();i++)
		{
			PrintRowFromChar(input.charAt(i));
		}
	}
	 static void PrintRowFromChar(char input)
	{
		for (int i=0;i<8;i++)
			System.out.print(input);
		System.out.println();
	}
	public static void main(String args[])
	{
		String inputString;
		System.out.println("Enter string:");
		inputString = TextIO.getlnString();
		PrintRowsFromString(inputString);
	}

}
