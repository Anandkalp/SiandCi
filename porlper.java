
	import java.util.Scanner;
class PorLper
{
public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Cost Prise");
		float cp=sc.nextFloat();

		System.out.println("Enter Selling Price");
		float sp=sc.nextFloat();

		if(sp>cp)
		{
			float profit=sp-cp;
			System.out.println("Profit Amount is :"+profit);
			
			double profitperc=(profit/cp)*100;
			System.out.println("Profit % is :"+profitperc);
		}
		else if(sp<cp)
		{
			float loss=cp-sp;
			System.out.println("Loss Amount is :"+loss);
			
			double lossperc=(loss/cp)*100;
			System.out.println("Loss % is :"+lossperc);
		}
		else
		{
			System.out.println("Neither Profit or Loss");
		}
	}
}

