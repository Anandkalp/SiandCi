import java.util.Scanner;
class IntrestValues	
{
public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter Principle Amount");
		double p=sc.nextDouble();
	
		System.out.println("Enter Time");
		double t=sc.nextDouble();
		
		System.out.println("Enter Rate");
		double r=sc.nextDouble();
		
		double b=(p*t*r)/100;
		double si=p+b;
		System.out.println("Intrest : "+b);
		System.out.println("Simple Intrest : "+si);
		
		double a=p*Math.pow((1+r/100),t)-p;
		double ci=p+a;
			System.out.println("Intrest : "+a);
		System.out.println("Compound intrest : "+ci);
		
	}
}
		
