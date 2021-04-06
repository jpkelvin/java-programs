
public class Marks {
	public static void main(String[] args)
	{
		int[] marks= {20,30,40,42,90};
		int a=0;
		try {
			System.out.println(marks[2]/2);
		System.out.println(marks[5]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			
			System.out.println("Array overFlow exception");
		}
		catch(ArithmeticException e)
		{
			System.out.println("arithmetic overFlow exception");
		}
		System.out.println("Markslist");
		for(int i=0;i<5;i++)
			System.out.println(marks[i]);
	}

}
