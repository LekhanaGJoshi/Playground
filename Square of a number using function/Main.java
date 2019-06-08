import java.util.Scanner;
class Main
{
  public static int sq(int n)
  {
    int sq=n*n;
  return sq;
}
	public static void main (String[] args)
    {
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      {
	  int x=sq(n);
      n=x;
      }
	
  System.out.println(n);
}
}
