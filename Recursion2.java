//sum of first n natural numbers

public class Recursion2 {

	public static void printSum(int n,int i,int sum) 
	{
	 //sum=0;
	
	if(i==n)
		{sum+=i;
	System.out.println(sum);
		return;
		}
	sum=sum+1;
	printSum(i=i+1,n,sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
printSum(1,5,0);
	}

}
