package test5;

public class test47 {
	public static void main(String[] args)
	{
		Car2 car1=new Car2("1����");
		car1.start();
		for(int i=0;i<5;i++) 
		{
			try 
			{
				Thread.sleep(1000);
				System.out.println("���b�i��main()���B�z�u�@");
			}
			catch(InterruptedException e)
			{
			}
		}
	}
}
