
public class CommandLineArguments {
	private int val;
	 
	
public static void main(String args[])
{
	Singleton value = Singleton.getValue();
	value.PrintText();
	System.out.printf("You entered %d command line arguments\n", args.length);
	if (args.length>0)
	{
		System.out.println("Your arguments were:");
		for (int i=0;i<args.length;i++)
		{
			System.out.println(args[i]);
		}
	}
}

public int getVal() {
	return val;
}

public void setVal(int val) {
	this.val = val;
}
}
