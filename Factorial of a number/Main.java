import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code 
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      long fact=1;
      for(int i=1;i<=n;++i)
      {
        fact=fact*i;
	}
      System.out.println(fact);
}
}
