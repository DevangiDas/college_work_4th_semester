/*Define an interface with three methods – earnings(), deductions() and bonus(). 
Further define a Java class “Manager‟ that implements the above interface partially
 without implementing the bonus() method. Also define another Java class “Substaff‟ that
extends the “Manager‟ class and implements bonus() method. Write the complete
program to find out earnings, deduction and bonus of a sub-staff with basic salary 
amount entered by the user. The amounts are to be computed as per the following guidelines – 
earnings = basic + DA (80% of basic) + HRA (15% of basic), 
deductions = PF @12% of basic, and bonus = 50% of basic pay. */

import java.util.Scanner;
interface Payment {
	void deduction();
	void bonus();
	void earning();
}
class Manager implements Payment {
	Scanner in = new Scanner(System.in);
	double bs, da, hra, earning_val, deduction_val,
	       bonus_val;
	Manager() {
		System.out.println("enter your basic salary");
		bs = in.nextInt();
	}
	public void earning() {
		earning_val = bs + 0.8 * bs + 0.15 * bs;
		System.out.println("Earning =" + earning_val);
	}
	public void deduction() {
		deduction_val = 0.12 * bs;
		System.out.println("Deduction =" +
		                   deduction_val);
	}
	public void bonus() {}
}
class Substaff extends Manager {
public void bonus() {
		bonus_val = 0.12 * bs;
		System.out.println("Bonus =" + bonus_val);
	}
}
class p1{
	public static void main(String args[]) {
		Manager ob1 = new Manager();
		ob1.earning();
		ob1.deduction();
		Substaff ob2 = new Substaff();
		ob2.bonus();
	}
}