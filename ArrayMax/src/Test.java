
public class Test {

	public static void main(String[] args) {
                      
 System.out.println("This is for testing purpose");
		int a[]={112,51221,611,3,821,9};
		int loc=0,temp=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				
			
			if(a[i]>a[j])
			{
				loc=a[i];
				a[i]=a[j];
				a[j]=loc;
				
			}
			
			}
		}
		System.out.println(a[a.length-1]);
	}

}
