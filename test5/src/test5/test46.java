package test5;

public class test46 {
	public static void main(String[] args)
	{
		Car3 car1=new Car3("1����");
		car1.start();
		for(int i=0;i<5;i++) 
		{
			System.out.println("���b�i��main()���B�z�u�@");
		}
	}
}
class Car3 extends Thread{
	private String name;
	
	public Car3(String nm)
	{
		name = nm;
	}
	
	public void run()
	{
		for(int i=0;i<5;i++) 
		{
			try 
			{
				sleep(1000);
				System.out.println("���b�i��"+name+"���B�z�u�@");
			}
			catch(InterruptedException e) 
			{
			}
		}
	}
}

