import java.util.*;
class Employee
{
    int empID;
    double basic, da;
    public Employee()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee ID: ");
        empID = sc.nextInt();
        System.out.print("Enter Basic salary: ");
        basic = sc.nextDouble();
        System.out.print("Enter DA: ");
        da = sc.nextDouble();
        sc.close();
    }
    public void Salary()
    {
        double total = basic+da;
        System.out.println("Employee: "+empID+"\nSalary: Rs."+total);
    }
}
class Manager extends Employee
{
    double allowance;
    public Manager()
    {
        super.Salary();
        allowance = 0.1 * basic;
    }
    @Override
    public void Salary()
    {
        double total = basic+da+allowance;
        System.out.println("Employee: "+empID+"\nSalary: Rs."+total);
    }
}
public class question_2 {
    public static void main(String[] args) {
        Manager m1 = new Manager();
        m1.Salary();
    }
}