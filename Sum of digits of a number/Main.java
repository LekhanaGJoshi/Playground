import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
        int n= in.nextInt();
      int a=n;
      int sum=0;
      while(a>0)
      {
        int x=a%10;
        sum=sum+x;
        a=a/10;
	}
      System.out.println(sum);
}
}