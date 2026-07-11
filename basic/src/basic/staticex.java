package basic;

class Student{
	static int mark=0;
}

public class staticex {
    static {
    	System.out.println("hello");
    }
    static int a=20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hey there");
		System.out.println(a);
		
		Student s1=new Student();
		Student s2=new Student();
        s1.mark=40;
        s2.mark=80;
        System.out.println(s1.mark);
        System.out.println(s2.mark);

	}

}
