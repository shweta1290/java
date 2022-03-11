package day4;
//constructors are of two types default and parameterized they are used to instantiate the values of a object
class defaultConstructor
{
	defaultConstructor()
	{
		System.out.println("This is a default constructor");
	}
}
class parameterizedConstructor
{
	int i,x;
	parameterizedConstructor(int a,int b){
		i=a;
		x=b;
		System.out.println("This is a parameterized constructor"+" "+i+" "+x);
		
	}
}


public class constructors {
	public static void main(String args[])
	{
		defaultConstructor obj1=new defaultConstructor();
		parameterizedConstructor obj2=new parameterizedConstructor(2,3);
		
	}

}
