import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
  		// Type your code here
      int n=in.nextInt();
      int count=1;
      for(int j=1;j<=n;j++)
      {
        for(int i=1;i<=j;i++)
        {
          if(count%2==1)
          
            System.out.print("*");
          else
            System.out.print("#");
          count++;
        }
        System.out.println();
}
    }
}
