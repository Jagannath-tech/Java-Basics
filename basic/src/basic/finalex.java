package basic;

final class s1{   //cannot inherit
	void disp() {
		System.out.println("class s1");
	}
}
 
class s2 {
	final void disp() {      //cannot override
		System.out.println("class s2");
	}
}



public class finalex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		s1 s1=new s1();
		s1.disp();
	}

}
