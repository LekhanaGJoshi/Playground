import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
      int N=in.nextInt();
      int m=N/100;
      int n=N%10;
      int sum=m+n;
      System.out.println(sum);
	}
}