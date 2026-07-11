package number;

public class sumofnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=2;
		int sum=0;
		for(int i=a;i>0;i=i/10) {
			int b=i%10;
			sum+=b;
			if(sum>=10) {
				int sum2=0;
				for(int j=sum;j>0;j=j/10) {
					int c=j%10;
					sum2+=c;
				}
				sum=sum2;

			}
		}
		System.out.println(sum);
	}
}
