package test5;

public class test50 {
	public static void main(String[] args)
	{
		Car4 car1=new Car4("�@����");
		Thread th1=new Thread(car1);
		th1.start();
		for(int i=0;i<5;i++) 
		{
			System.out.println("���b�i��main()���B�z�u�@");
		}
	}
}
class Car4 implements Runnable{
	private String name;
	
	public Car4(String nm)
	{
		name = nm;
	}
	
	public void run()
	{
		for(int i=0;i<5;i++) 
		{
			System.out.println("���b�i��"+name+"���B�z");
		}
	}
}