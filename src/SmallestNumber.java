
public class SmallestNumber{
	public static int getSmallestNumber(int a[], int total) {
	int temp;
	for (int i=0; i<total ; i++)
	{
		for (int  j=i+1 ; j<total ; j++)
		{
			if (a[i]>a[j])
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				
			}
		}
	}
	return a[0];
	}
	public static void main(String[] args ){
		int a[]= {1,2,3,4,5,6};
		int b[]= {23,12,34,25,37,20};
		System.out.println("Smallest Number :" +getSmallestNumber(a,6));
		System.out.println("Smallest number :" +getSmallestNumber(b,6));
	}
		
	}


	