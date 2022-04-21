package java_Oops;



class Cons{
	
	Cons(){
		System.out.println(" object created and Constructor called");
	}
	
}
class student{
	int id;
	String name;
	int age;
	
	student(int id,String name){
		this.id=id;
		this.name=name;
		
	}
	
	student(int id,String name,int age){
		this.id=id;
		this.name=name;
		this.age=age;
	}
	
	public void printelemtn(){
		System.out.println("Id is "+ id + "\nName is: "+ name+ "\nAge is:" +age);
	}

}
public class P3_Constructor {
public static void main(String agrs[]) {
//   Cons obj1=new Cons();
   
	student obj1=new student(20011594,"mayank",10);
	obj1.printelemtn();
    
	
}
}
