package dsaprj.mca.dsa;

public class Mainpayment extends payment{

	@Override
	void pay() {
		// TODO Auto-generated method stub
	System.out.println("cash pay");	
	}
	public static void main(String[] args) {
		Mainpayment p = new Mainpayment();
		p.pay();
		p.printbill();
	}
	

}
