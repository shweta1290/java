package oop;
class first
{
	public float area(float a ,float b)
	{
		return a*b;
	}
	public double area(float a ,float b,float x)
	{
		return a*b*0.5;
	}
	public float area(float a)
	{
		return a*a;
	}
}
class overloading {
	public static void main(String srgs[])
	{
		first square=new first();
		first rectangle=new first();
		first triangle=new first();
		System.out.println(square.area(2));
		System.out.println(	rectangle.area(2,3));
		System.out.println(triangle.area(4,5,1));
		
	}

}
