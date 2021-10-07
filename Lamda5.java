
import java.util.*;
interface Bottle
{
	void Water();
}
interface Clothes
{
	void wash();
}


public class Lamda5 {
	public static void main(String args[])
	{
		 Bottle m =()->System.out.println("fill water in bottle");
		 m.Water();
		 Clothes c=()->System.out.println("wash the cloths");
		 c.wash();
		 c=()->{
			Scanner sc=new Scanner(System.in); 
			System.out.println("enter numner to find given num is even r odd");
			int n=sc.nextInt();
			if(n%2==0)
				System.out.println("even");
			else
				System.out.println("not even");
		 };
		 c.wash();
		
			
		
		
	}
	

}
