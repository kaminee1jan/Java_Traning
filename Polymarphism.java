package Polymarphism;

public class Polymarphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b=new SBI();
		System.out.println(b.getRateOfInterest());
		Bank b1=new ICICI();
		System.out.println(b1.getRateOfInterest());
		Bank b2=new AxisBank();
		System.out.println(b2.getRateOfInterest());
	}

}
