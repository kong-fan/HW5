package test5;

public class test55 {
	public static void main(String[] args)
	{
		Company2 cmp=new Company2();
		
		Driver2 drv1=new Driver2(cmp);
		drv1.start();
		
		Driver2 drv2=new Driver2(cmp);
		drv2.start();
	}
}
class Company2
{
	private int sum=0;
	public synchronized void add(int a) {
		int tmp=sum;
		System.out.println("�ثe���X�p���B�O"+tmp+"��");
		System.out.println("�Ȩ�"+a+"���F");
		tmp=tmp+a;
		System.out.println("�X�p���B�O"+tmp+"��");
		sum=tmp;
	}
}
class Driver2 extends Thread
{
	private Company2 comp;
	public Driver2(Company2 c) {
		comp=c;
	}
	
	public void run() {
		for(int i=0;i<3;i++) {
			comp.add(50);
		}
	}
}

