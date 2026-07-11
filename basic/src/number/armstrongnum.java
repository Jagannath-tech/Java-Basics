package number;

public class armstrongnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=150;
		int b=0;
		int count=0;
		int c=0;
		for(int i=a;i>0;i=i/10) {
			count++;
			
		}
		int y=0;
		for(int i=a;i>0;i=i/10) {
			b=i%10;
			 y=(int) Math.pow(b,count);
			c+=y;
		}
		if(c==a) {
			System.out.println("it is a armstrong no.");
		}
		else {
			System.out.println("not a armstrong no.");
		}
	}

}
