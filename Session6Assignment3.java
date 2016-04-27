
public class Session6Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle t =new Triangle();
		Rectangle r=new Rectangle();
		Square s=new Square();
		t.draw();
		System.out.println("Area of Triangle is :-> "+t.area(2, 3));
		
		r.draw();
		System.out.println("Area of Rectangle is :-> "+r.area(4,5));
		
		s.draw();
		System.out.println("Area of Square is :-> "+s.area(5, 5));
}

}

class Triangle implements Shape
{
	public void draw()
	{
		System.out.println("Triangle Class Draw Method");
	}
	public int area(int a, int b)
	{
		return (a*b)/2;
	}
}

class Rectangle implements Shape
{
	public void draw()
	{
		System.out.println("Rectangle Class Draw Method");
	}
	public int area(int a, int b)
	{
		return (a*b);
	}
}

class Square implements Shape
{
	public void draw()
	{
		System.out.println("Square Class Draw Method");
	}
	public int area(int a, int b)
	{
		return (a*b);
	}
}


interface Shape
{
	public void draw();
	public int area(int x, int y );
	
}
