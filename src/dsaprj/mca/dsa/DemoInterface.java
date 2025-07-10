package dsaprj.mca.dsa;

public class DemoInterface implements Game{
	 
	public static void main(String[] args) {
		DemoInterface o = new DemoInterface();
		o.move();
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Moving left");
	}
	
}

