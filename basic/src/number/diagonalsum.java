package number;

public class diagonalsum {
			public static int mm(int a[][])
			{
				int sum=0;
				int k=1;
				int i=0,j=0;
				for( i=0;i<a.length;i++)
				{
					for( j=0;j<a[i].length;j++)
					{
						if(i==j||(i+j)==a.length-1)
						{
							sum=sum+a[i][j];
						}
					}
				}
				if(i!=j)
				{
					return -1;
				}
				else
				return sum;
			}
			public static void main(String args[])
			{
				int a[][]= {{1,2,3},
						{2,4,5},
		                    {1,2,3}};
				int l=mm( a);
				System.out.println(l);
			}
	}

