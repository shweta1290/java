package day5;

public class operators {
	public static void main(String[] args) {
	
	int a = 10, y=20;
	System.out.println(a+y);
	System.out.println(--a);
	System.out.println(++y);
	int x = 5;
    if(x != 5)
    {
  	  System.out.println("Value of x is not 5");
  	  
    }
    else
    {
    System.out.println("Value of x is 5");
    }
 
	
    if(x >= y)
    {
 	   System.out.println("true");
    }
    else
    {
 	   System.out.println("false");
    }

    if(!(x < y) || (x == y))
	  { 
		  System.out.println("Condition is TRUE");
	  }
	  else
	  { 
		  System.out.println("Condition is FALSE"); 
	}
    x = (10 == x) ? 1 : 0;//ternary operator
	
	System.out.println(x);
 

	 




	}

}
