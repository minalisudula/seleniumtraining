package webdriver;



public class inheritance {
	
	public void details(int a1,int a2)
	{
		int c=a1+a2;
		System.out.println(c);
		
	}
	
	class k extends inheritance
	{
		public void details(int a1,int a2)
		{
			int c=a1+a2;
			System.out.println(c);
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inheritance x=new inheritance();
		x.details(1, 3);

	}

}
