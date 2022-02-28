/*Write a program in java using inheritance to show how to call the base class
parameterized constructors from the derived class using super. */

class Base {
    int var_value;

    Base(int var_parameter) {
        this.var_value = var_parameter;
    }
}

class Derived extends Base{
    Derived(){
        super(89);
    }
    void display(){
        System.out.println("The value of class variable is: "+var_value);
    }
}
public class p6{
    public static void main(String[] args) {
        Derived d = new Derived();
        d.display();
    }
}

