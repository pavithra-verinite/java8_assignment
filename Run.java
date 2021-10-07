import java.lang.*;
public class Run {
	public static void main(String atgs[])
	{
		Runnable a=()->{
			for(int i=0;i<4;i++)
			{
			System.out.println("run A");
			try
			{
				Thread.sleep(100);
			}
			catch(Exception e)
			{
				
			}
			}
		};
		Runnable b=()->{
			for(int i=0;i<4;i++)
			{
			System.out.println("run B");
			try
			{
				Thread.sleep(100);
			}
			catch(Exception e)
			{
				
			}
			}
		};
		Thread f=new Thread(a);
		Thread g=new Thread(b);
		f.start();
		g.start();
	}
	

}
