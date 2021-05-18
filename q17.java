import java.util.*;
class q17
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
	 sum[i] = (int)((bin1%10+bin2%10)+carry)%2;
	 i++;
	 carry = (int)((bin1%10+bin2%10)+carry)/2;
	 bin1=bin1/10;
	 bin2=bin2/10;
  }
	 if (carry!=0)
  {
	 sum[i]=carry;
          i++; 
  }
	
	 System.out.println("binary of two number is :");
          i--;
	 while(i>=0)
  {
	 System.out.print(sum[i]);
	      i--;
  }
       System.out.print("\n");
  }
}