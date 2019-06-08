import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code 
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int i,fact,r,sum=0,temp;
      temp=n;
      while(n>0)
      {
        fact=1;
        r=n%10;
        for(i=1;i<=r;i++)
          fact=fact*i;
        sum=sum+fact;
        n=n/10;
      }
      if(sum==temp)
        System.out.println("Yes");
      else
        System.out.println("No");
    }
}


