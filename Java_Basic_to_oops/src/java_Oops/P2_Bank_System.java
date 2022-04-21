package java_Oops;

class Bank{
	String name;
	float  ammount;
	int account_no;
	
	public void getinfo(String name,float ammount,int account_no) {
		this.name=name;
		this.account_no=account_no;
		this.ammount=ammount;
	}
	
	public void depostie(float amt) {
		this.ammount=ammount+amt;
		System.out.println("Deposited ammouht is: " + amt);
	}
	
	public void witdraw(float amt) {
		if(ammount<amt) {
			System.out.println("Cant witdraw you have not engough money");
		}
		this.ammount=ammount-amt;
		System.out.println("Witdraw ammount is " + amt);
	}
	
	public void check_account() {
		System.out.println("Your total account balanece is "+ this.ammount);
	}
}
public class P2_Bank_System {
public static void main(String args[]) {
	Bank obj1=new Bank();
	obj1.getinfo("Mayank", 1000, 1212131);
	obj1.depostie(100);
	obj1.witdraw(10);
	obj1.check_account();
	
}
	
}
