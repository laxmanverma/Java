public class MainClass{
	public static void main(String[] args){
		MyClass rectangle = new MyClass();
	//	MyClass.i = 4;
		rectangle.width = 1.0f;
		rectangle.height = 2.0f;
		
		Circle circle = new Circle();
		circle.perimeter = 2.0f;
		
		Shape shape = new Shape();
		shape.perimeter = 5.0f;
		
		printPerimeter(circle);
		//System.out.println(circle.perimeter);
		//System.out.println(shape.perimeter);
}

public static void printPerimeter(Shape shape){		//as circle inherits shape so it is allowed, this is an example of polymorphism
	System.out.println(shape.perimeter);
}
}
