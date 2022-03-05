package Oops;

class Shape{
	public void area() {
		System.out.println("display area");
	}
}

class Triangle extends Shape{
	public void area(int l,int h) {
		System.out.println(1/2*l*h);
		
	}
}
class EquTriangle extends Triangle{
	public void area(int l,int h) {
		System.out.println(1/2*l*h);
	}
}
class Circle extends Shape{
	public void area(int r) {
	
}
public static class inheritance {
public static void main(String [] args) {
	Triangle t1 = new Triangle();
	
	
	
}
}
}