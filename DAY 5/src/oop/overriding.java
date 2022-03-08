package oop;
class Parent
{
	void show() {
		System.out.println("this is main class");
	}
	
}
class child extends Parent{
	void show()
	{
		System.out.println("This is inherited class overriden the main");
		
	}


public static void main(String args[])
{
	child c=new child();
	Parent p=new Parent();

	p.show();
	c.show();
	
}
}

