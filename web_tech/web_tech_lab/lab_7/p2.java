/*Illustrate the execution of constructors in multi-level inheritance with three
Java classes – plate(length, width), box(length, width, height), wood box
(length, width, height, thick) */

class plate{
    double length,width;
    plate(double lenght, double width){
        this.length=lenght;
        this.width=width;
        System.out.println("Length and Width has been set from plate Constructor");
    }
}
class box extends plate{
    double height;
    box(double length, double width, double height){
        super(length,width);
        this.height=height;
        System.out.println("Height has been set from box Constructor");
    }
}
class woodBox extends box{
    double thick;
    woodBox(double length, double width, double height, double thick){
        super(length,width,height);
        this.thick=thick;
        System.out.println("Thick has been set from woodBox Constructor");
    }
    public void display(){
        System.out.println("Length = "+length);
        System.out.println("Width = "+width);
        System.out.println("Height = "+height);
        System.out.println("Thick = "+thick);
    }
}
public class p2{
    public static void main(String[] args) {
       woodBox wb1 = new woodBox(6.7,2.3,4.8,5.2);  
       wb1.display();
    }    
}