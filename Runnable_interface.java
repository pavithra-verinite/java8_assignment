import java.lang.*;
import java.util.*;
public class Runnable_interface {
	
		   public static void main(String[] args) {
			   Thread thread = new Thread(() -> System.out.print(false));

		      
		     
			      Thread a=new Thread(() ->{ 
				      
				      for(int i=0;i<5;i++)
				      {
				    	  System.out.println("Runnable interface first-----");
				    	  try {
				    		  Thread.sleep(100);
				    	  }
				    	  catch(Exception e)
				    	  
				    	  {
				    		  
				    	  }
				    	  
				      }
				      });
			      Thread a1=new Thread(() ->{ 
				      
				      for(int i=0;i<5;i++)
				      {
				    	  System.out.println("Runnable interface second");
				    	  try {
				    		  Thread.sleep(100);
				    	  }
				    	  catch(Exception e)
				    	  
				    	  {
				    		  
				    	  }
				    	  
				      }
				      });
			      
			      a.start();
			      a1.start();
			      
		      
		      
			      
		   }
		   
		}
		
