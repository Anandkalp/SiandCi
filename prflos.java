
import java.util.Scanner;
class PorL
{
public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter cost price");
		float cp=sc.nextFloat();

		System.out.println("Enter selling Price");
		float sp=sc.nextFloat();

		float profit=sp-cp;
		System.out.println("Profit: "+profit);
		
		float profitperc=(profit/cp)*100;
		System.out.println("Profit%: "+profitperc);
		
		if(sp>cp)
		{
			System.out.print("Overall: ");
			System.out.println("Profit");
		}
		else
		{
			System.out.print("Overall: ");
			System.out.println("Loss");
		}
		sc.close();
		
	}
}

	
