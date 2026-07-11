package basic;

abstract class bike{
	abstract void speed();
		
	
	void price() {
		System.out.println("60000");
	}
}

class ktm extends bike{
	void speed() {
		System.out.println("25 mphr");
	}
}

public class abstractex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ktm k1=new ktm();
		k1.speed();
		k1.price();

	}

}
