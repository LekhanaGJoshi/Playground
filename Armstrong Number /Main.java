import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in=new Scanner(System.in);
      int num=in.nextInt();
      int n=0, r;
      double res=0;
      int x=num;
      while(num!=0)
      {
        num=num/10;
        ++n;
	}
      num=x;
      while(num!=0)
      {
        r=num%10;
        res=res+Math.pow(r,n);
        num=num/10;
      }
      if(res==x)
        System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
    }
}

