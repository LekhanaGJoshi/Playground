import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
        int n= in.nextInt();
      int sd=0;
      int rem;
      while(n>=10)
      {
        rem=n%10;
        sd=rem;
        n=n/10;
      }
      System.out.println(sd);
    }
}
