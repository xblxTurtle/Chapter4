
public class Singleton {

	private static Singleton value = new Singleton();
	
	private Singleton()
	{ 
	}
	
	public static Singleton getValue()
	{
		return value;
	}
	
	public void PrintText()
	{
		System.out.println("This is some non static method output");
	}
}
