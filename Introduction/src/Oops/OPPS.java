package Oops;
class Pen{
	String color;
	String type;
	public void write() {
		System.out.println("writing something");
	}
	public void printColor() {
		System.out.println(this.color);
		
	}
	public void printType() {
		System.out.println(this.type);
		
	}
}
class Student{
	String name;
	int age;
	
	public void printInfo() {
		System.out.println(this.name);
		System.out.println(this.age);
	}
	
	public void print(String name) {
		System.out.println(this.name);
	}
	public void print(int age) {
		System.out.println(this.age);
	}
	public void print(String name, int age) {
		System.out.println(this.name);
		System.out.println(this.age);
	}
	
}
abstract class Animal{
	abstract public void walk();
}
class Horse extends Animal{
public void walk() {
		System.out.println("walkson 4 legs");
	}
}
class Chicken extends Animal{
public void walk() {
		System.out.println("walks on 2 leg");
	}
}
interface Animal1{
	int eye=2;
	void walk();
}

class Loin implements Animal1{
   public void walk() {
	   System.out.println("walkson 4 legs");
   }
}
public class OPPS {

	public void main(String args[]) {
		Pen pen1= new Pen();
		pen1.color="Blue";
		pen1.type="gel";
		pen1.write();
		
		Pen pen2=new Pen();
		pen2.color="Green";
		pen2.type="ball point";
		
		pen1.printColor();
		pen2.printColor();
		pen1.printType();
		
		Student s1= new Student();
		s1.name="YOgesh";
		s1.age=23;
		s1.printInfo();
		s1.print(s1.age);
		s1.print(s1.name);
		Horse horse =new Horse();
		horse.walk();
		Animal animal = new Animal();
		animal.walk();
		Loin lion =new Lion();
		lion.walk();
	}

}
