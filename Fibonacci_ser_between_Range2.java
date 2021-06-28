import java.util.Scanner;

public class Fibonacci_ser_between_Range2
 {

	public static void main(String[] args) {
Scanner s = new Scanner (System.in);
System.out.println("Enter a number :");
int  n =s.nextInt();
int sum = 0;
int a =0;
int b = 1;
//for(int i = 1; i<=n; i++)
while(sum < n )
{
/*	if(sum > n )
	{
		break;
	}*/
sum = a + b;
  if(sum%2== 0 && sum<= n)
  {
	  System.out.println(sum);
  }
    a=b;
	b = sum;
	
}
	}

}
