/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int tar=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
		    a[i]=sc.nextInt();
		}
		
		int st=0;
		while(st<n){
		    
		    if(st==tar){
		        System.out.println(st+"");
		        break;
		    }
		    st+=Math.max(1,Math.abs(tar-a[st])/k);
		    
		    
		}
		 System.out.println("Element not found"); 
	}
}
