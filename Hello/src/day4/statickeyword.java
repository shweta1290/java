package day4;
/*The static keyword in Java is used for memory management mainly. We can apply static keyword with variables, methods, blocks and nested classes. The static keyword belongs to the class than an instance of the class.

The static can be:

Variable (also known as a class variable)
Method (also known as a class method)
Block
Nested class
1) Java static variable
If you declare any variable as static, it is known as a static variable.

The static variable can be used to refer to the common property of all objects (which is not unique for each object), for example, the company name of employees, college name of students, etc.
The static variable gets memory only once in the class area at the time of class loading.
****Advantages of static variable*****
It makes your program memory efficient (i.e., it saves memory).



*/
class counter
{
static int counter=0;
counter()
{
	System.out.println(counter++);
}
}

public class statickeyword {
	public static void main(String[] args)
	{
counter obj1=new counter();
counter obj2=new counter();
counter obj3=new counter();
		
	}

}
