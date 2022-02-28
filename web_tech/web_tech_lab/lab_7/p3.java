/* Program on Dynamic Method Dispatch. */

class test {
    public void method() {
       System.out.println("tests are done");
    }
 }
 
 class sub_test extends test {
    @Override
    public void method() {
       super.method();
       System.out.println("sub_tests are also done");
    }
 }
public class p3{   
    public static void main(String[] args) {
        test sub_test = new sub_test();                     
        sub_test.method();               
    }
}