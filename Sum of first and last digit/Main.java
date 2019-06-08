import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
          int n=in.nextInt();
      int fd=n;
      int ld=n;
      while(fd>=10)
      {
        fd=fd/10;
	}
      ld=ld%10;
      int sum=fd+ld;
      System.out.println(sum);
}
}