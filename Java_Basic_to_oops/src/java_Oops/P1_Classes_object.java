package java_Oops;


class Pen{
	String colour;
	String type;
	
	public void print() {
		System.out.println(this.colour);
		System.out.println(this.type);
	}
}
class employye{
	
	String name;
	int id;
	float salary;
	
	public void getinfo(String name,int id,float salary) {
		this.name=name;
		this.id=id;
		this.salary=salary;
		
	}
	
	public void printinfo() {
		System.out.println("Id is "+ id + " name is " + name + " salary is "+ salary);
	}
}
class Tringle{
	int length;
	int hight;
	
	public void getinfo(int length,int hight) {
		this.length=length;
		this.hight=hight;
	}
	public void calculate() {
		System.out.println("Area of tringle is:" + (length*hight));
	}
}
public class P1_Classes_object {

	public static void main(String args[]) {
	
//	Pen obj =new Pen();
//	
//	obj.colour="red";
//	
//	obj.print();
		
//		employye obj1=new employye();
//		obj1.getinfo("mayank", 20011594, 330000);
//		obj1.printinfo();
//		
		
		Tringle obj1=new Tringle();
		obj1.getinfo(10, 90);
		obj1.calculate();
	}
}
