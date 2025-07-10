package dsaprj.mca.dsa;

public class Main extends person{
	
	@Override
    	void f1() {
		// TODO Auto-generated method stub
		super.f1();
		System.out.println("this is called method");
	}

	public static void main(String[] args) 
	{
		Main p=new Main();
		p.f1();
		
	}

}
