import java.util.*;
class q18
{
  public static void main(String argv[])
  {
   int carry=0, i=0;
   int[]sum=new int[10];
   System.out.println("enter two binary number");
    Scanner sc= new Scanner(System.in);
	int bin1= sc.nextInt();
	int bin2= sc.nextInt();
	while(bin1!=0 || bin2!=0)
	{
	sum[i] = (int)(((bin1%10)*(bin2%10)))%2;
	i++;
	bin1=bin1/10;
	bin2=bin2/10;
	}
     
	while(i>=0)
	{
	System.out.print(sum[i]);
	i--;
	}
    
  }
}