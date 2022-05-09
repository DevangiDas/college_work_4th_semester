package myPackage1;
public class Point {
    public double X, Y;
    public Point(double x, double y)
    {
        X = x;
        Y = y;
    }
    public double distance()
    {
        return Math.sqrt(X*X + Y*Y);
    }
    public double distance(double x, double y)
    {
        return Math.sqrt(Math.pow((y-Y), 2) + Math.pow((x-X), 2));
    }
    public double distance(Point another)
    {
        return Math.sqrt(Math.pow((another.Y-this.Y), 2) + Math.pow((another.X-this.X), 2));
    }
}
