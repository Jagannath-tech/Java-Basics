package array;

public class target {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,-7,4,3,5};
		int target=7;
		
		for(int i=0;i<a.length;i++) {
			int sum=0;
			for(int j=i;j<a.length;j++) {
				sum+=a[j];
				if(sum==target){
					for(int k=i;k<=j;k++) {
						System.out.println(a[k]);
					}
				}
				 
			}
		}
	}
}
