package test5;

public class test48 {
	public static void main(String[] args)
	{
		Car2 car1=new Car2("1����");
		car1.start();

			try 
			{
				car1.join();
			}
			catch(InterruptedException e)
			{
			}
		System.out.println("����main()���B�z�u�@");
	}
}
