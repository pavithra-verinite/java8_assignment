import java.util.*;

public class Optional_class {
	static String show()
	{
		return "value";
	}
	public static void main(String args[]) throws Exception
	{
		String s=null;
		
		if(s!=null)
			System.out.println(s.length());
		else
			System.out.println("null");
		String name ="a";
	    Optional<String> opt = Optional.of(name);
	    System.out.println(opt);
	    System.out.println("ispresent:"+opt.isPresent());
	    System.out.println("isEmpty:"+opt.isEmpty());
	    Optional<String> opt1 = Optional.ofNullable(null);
	    System.out.println(opt1);
	    System.out.println("ispresent:"+opt1.isPresent());
	    System.out.println("isEmpty:"+opt1.isEmpty());
	  opt.ifPresent(x->{System.out.println("yes");
	  System.out.println("multiple");}
	  
		  
	  );
	  String name1 = Optional.ofNullable(s).orElse("john");
	  System.out.println(name1);
//	  String name2=Optional.ofNullable(s).orElseThrow();
//	  System.out.println(name2);
//	 String name2=Optional.ofNullable(s).orElseThrow(() -> new Exception("wrong arugment - "));
//	  System.out.println(name2); 
	 name1 = Optional.ofNullable(s).orElseGet(()->"jan");
	  System.out.println(name1);
	  name1 = Optional.ofNullable(s).orElse(show());
	  System.out.println(name1);
	 
	  
}
}
