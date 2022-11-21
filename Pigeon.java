package abstractclassexample;

public class Pigeon extends Bird {

	public void fly()
	{
		System.out.println("I can fly");
	}
	public static void main(String[] args) {
		Pigeon p1=new Pigeon();
		p1.fly();
		p1.color();
	}

}


