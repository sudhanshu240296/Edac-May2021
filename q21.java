import java.util.Scanner;
public class a21
{
    public static void main(String args[])
    { 
   
      Scanner sc = new Scanner(System.in);
      System.out.print("Decimal No :");
      int dec_num = sc.nextInt();
      int oct_num[] = new int[50];
      int quot = dec_num;
      int i=0;
      while(quot != 0)
    {
      oct_num[i++] = quot % 8;
      quot = quot/8;
    }
      System.out.println("Octal No :");
      for(int j=i-1; j>=0; j--)
    { 
      System.out.print(oct_num[j]);
    
	}
  
    }


}