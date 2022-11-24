package methods;



public class parameter {
	
	public void add()
	{
		System.out.println("null parameters");
		
	}
	
	public void add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	
	public void add(double c,double d)
	{
		double e=c+d;
		System.out.println(e);
	}
	
	public void add(String a1,String b1)
	{
		String i=a1+b1;
		System.out.println(i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parameter x=new parameter();
		x.add();
		x.add(1,2);
		x.add(3.000000,4.000000);
		x.add("1","2");

	}

}
