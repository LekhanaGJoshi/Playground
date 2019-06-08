import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
      int N=in.nextInt();
    int a=N/100;
    int b=(N/10)%10;
    int c=N%10;
    int r=(c*100)+(b*10)+a;
    System.out.println(r);
  }
}