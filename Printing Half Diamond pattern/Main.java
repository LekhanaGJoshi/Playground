import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
        int n=in.nextInt();
      for(int j=1;j<=n;j++)
      {
        for(int k=1;k<=(n-j);k++)
        {
          System.out.print(" ");
	}
        for(int i=1;i<=2*j-1;i++)
        {
          System.out.print("*");
        }
        System.out.println();
      }
    }
}
