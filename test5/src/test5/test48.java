package test5;

public class test48 {
	public static void main(String[] args)
	{
		Car2 car1=new Car2("1號車");
		car1.start();

			try 
			{
				car1.join();
			}
			catch(InterruptedException e)
			{
			}
		System.out.println("結束main()的處理工作");
	}
}
