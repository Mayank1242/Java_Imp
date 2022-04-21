package java_Questions_Lab;

class employe{
	int id;
	String name;
	static int count=0;
	static int dis=0;
	
    employe() {
	   count++;
	   
   }
    public void display() {
    	dis++;
    	System.out.println("Display Function called " + dis + " Times ");
    }
    public static void getcount() {
    	System.out.println(count);
    }
}
public class Q1_No_of_count_more_Than_ONe_object {

	public static void main(String args[]) {
		employe obj1=new employe();
		employe obj2=new employe();
		employe obj3=new employe();
		employe obj4=new employe();
		employe obj5=new employe();
		
		System.out.println(employe.count);
		obj1.display();
		obj2.display();
		obj3.display();
	}
}
 