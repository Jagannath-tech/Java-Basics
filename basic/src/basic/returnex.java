package basic;

public class returnex {
	int sum(int a,int b) {      	//void fn cannot return value, int fn will return int value
		int sum=a+b;
		return sum;
	}
	String getname(String name) {
		
		return name;
		
	}
		public static void main (String[] args) {
	
		returnex obj1=new returnex();
		
		int add=obj1.sum(5,19);		//sum is stored in variable add
		System.out.print(add);
		String n1=obj1.getname("jagan");
		System.out.println(n1);
	}
}
