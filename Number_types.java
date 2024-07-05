import java.util.*;
public class Number_types {
	static void odd(int a) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
		if(i%2==0) {
			System.out.print(i+" ");
	}
}
		System.out.println();
		for(int i=0;i<n;i++) {
			if(i%2!=0) {
				System.out.print(+i+" ");
		}
	}
		System.out.println();
}
	static void palindrome(int b) { 
		Scanner sc=new Scanner (System.in);
		String c=sc.nextLine();
		String rev =new StringBuilder(c).reverse().toString();
		System.out.println("reverse :"+rev);
		if(c.equals(rev)) {
			System.out.print("Palindrome");
		}
		else {
			System.out.print("Not a Palindrome");
		}
		System.out.println();
	}
	static void magic(int z) {
		Scanner sc=new Scanner (System.in);
		int c=sc.nextInt();
		int sum=0;
		while(c!=0) {
			int b=c%10;
			sum=sum+b;
			c=c/10;
		}
		int y=sum;
		int rev=0;
		while(y!=0) {
			int d=y%10;
			rev=(rev*10)+d;
			y=y/10;
		} 
		int x=rev*sum;
		if(c==x) {
			System.out.print("Magic");
		}
		else {
			System.out.print("Not a magic");
		}
		System.out.println();
	}
	static void prime(int f) {
		Scanner sc=new Scanner (System.in);
		int a=sc.nextInt();
		for (int i = 2; i <= a; i++)
		  {
			if (isPrime(i))
			  {
				System.out.print (i + " ");
			  }
		  }
		System.out.println();
	  }
		static boolean isPrime (int s)
		{
		  if (s == 2)
			{
			  return true;
			}
		  for (int i = 2; i < s; i++)
			{
			  if (s % i == 0)
				{
				  return false;
				}

			} 
		  return true;	
		}
		static void fact(int y) {
			Scanner sc=new Scanner (System.in);
			int x=sc.nextInt();
			int f=1;
			for(int i=1;i<=x;i++) {
				f=f*i;
			}
			System.out.print("fact of"+x+" - "+f);
		System.out.println();
		}
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n=1;
		while(n==1) {
			System.out.println("Please select the Option");
			System.out.println("1.odd or even 2.palindrome 3.magic no 4.prime no 5.factorial ");
			int ch=sc.nextInt();
		switch(ch) {
		case 1:
		System.out.println("choosed odd & even");
		odd(n);
		break;
		
		case 2:
			System.out.println("choosed palindrome");
			palindrome(n);
			break;
		case 3:
			System.out.println("choosed Magic");
			magic(n);
			break;
		case 4:
			System.out.println("choosed Prime");
			prime(n);
			break;
		
		case 5:
			System.out.println("choosed factorial");
			
			fact(n);
			break;
		}
		}

}}
