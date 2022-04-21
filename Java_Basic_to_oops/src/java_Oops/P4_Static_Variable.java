package java_Oops;

class std{
	int id;
	String name;
	static String schl="Graphic era hill university";
	
	public void getinfo(int id,String name) {
		this.id=id;
		this.name=name;
		
	}
	
	public void printinfo() {
	System.out.println("Id id: " + id + "\nname is: "+ name + "\nSchool name is: " +schl);
	}
}
public class P4_Static_Variable {

	public static void main(String agrs[]) {
		
		std obj=new std();
		obj.getinfo(20011594, "mayank");
	    obj.printinfo();
		
	    std obj1=new std();
	    obj1.getinfo(20011595,"rajat");
	    obj.printinfo();
	}
}
