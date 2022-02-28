/*Write a program to create an Account class containing account_number, balance as data
members and disp() to display the details. Inherit it in Person class with all mentioned
data members and functions. Person class also has name and aadhar_no as extra data
members of its own. Override disp() function. Create
5 persons‟ details. */

class Account{
    int account_number;
    double amount;
    Account(int account_number,double amount){
        this.account_number=account_number;
        this.amount=amount;
    }
    public void disp(){
        System.out.println("A/C: "+account_number+"\nAmount: Rs. "+amount);
    }
}
class Person extends Account{
    String name,aadhar_no;
    Person(int account_number,double amount,String name, String aadhar_no){
        super(account_number, amount);
        this.name=name;
        this.aadhar_no=aadhar_no;
    }
    @Override
    public void disp(){
        super.disp();
        System.out.println("Name of Account Holder: "+name);
        System.out.println("Aadhar No. of Account Hodler: "+aadhar_no);
        System.out.println("\n\n");
    }

}
public class p5{
    public static void main(String[] args) {
        Person p1 = new Person(78651,67000.78,"Devangi Das","GTE534");
        Person p2 = new Person(78602,13894.23,"Prapti Patra","6TRE43");
        Person p3 = new Person(78253,39452.78,"Ishita Mohapatra","OKI78R");
        Person p4 = new Person(78264,17098.00,"Apoorva Singh","QWE432");
        Person p5 = new Person(78275,38098.64,"Ritika Saha","OKN401");
        
        p1.disp(); 
        p2.disp(); 
        p3.disp(); 
        p4.disp(); 
        p5.disp(); 
    }
}