import java.util.*;
public class Main
{
    public void fun(int n)
    {
        int rev=0,rem=0;
        int p=n;
        while(p>0)
        {
            rem=p%10;
            rev=rev*10+rem;
            p=p/10;
        }
        if (n==rev){
        System.out.print("palindrome");}
        else {
        System.out.print("not palindrome");}
    }
	public static void main(String[] args) {
	    
	  Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	  Main m=new Main();
	  m.fun(n);
	    
	}
}
