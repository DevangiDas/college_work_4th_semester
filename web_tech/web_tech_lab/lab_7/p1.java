/*A plastic manufacturer sells plastic in different shapes like 2D sheet and 3D
box. The cost of sheet is Rs 40/ per square ft. and the cost of box is Rs 60/ per
cubic ft. Implement it in Java to calculate the cost of plastic as per the
dimensions given by the user where 3D inherits from 2D. */

class twoDimension{
    public double x,y,cost;
    twoDimension(double x, double y){
        this.x=x;
        this.y=y;
       
    }
    public void setCost(double cost){
        this.cost=cost;
    }
    public double calculateArea(){
        setCost(40*x*y);
        return x*y;
    }
    public void showCost(){
        System.out.println("The cost of the plastic is: Rs. "+cost);
    }
}
class threeDimension extends twoDimension{
    double z;
    threeDimension(double x, double y, double z){
        super(x,y);
        this.z=z;
        
    }

    @Override 
    public double calculateArea(){
        setCost(60*x*y*z);
        return x*y*z;
    } 
    
}
public class p1
{
    public static void main(String[] args) {
        twoDimension obj1 = new twoDimension(7,8);
        obj1.calculateArea();
        obj1.showCost();

        threeDimension obj2 = new threeDimension(9,5,3);
        obj2.calculateArea();
        obj2.showCost();
        
    }
}