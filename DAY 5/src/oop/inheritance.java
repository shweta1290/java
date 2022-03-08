package oop;

class inheritance
{
	int a=90;
	
}

class inherited extends inheritance{
	int a=70;
	
public static void main(String args[])
{
	inherited i=new inherited();
	System.out.println(i.a);
	inheritance s=new inheritance();
	System.out.print(s.a);
	
	
}
}