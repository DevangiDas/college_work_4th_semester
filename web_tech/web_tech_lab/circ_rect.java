import java.io.IOException;

class shape 
{
    int area;
    void showarea(int area)
    {
        System.out.println("area is:" + area);
    }
}

class circle extends shape 
{
    double areacir;

    int areacircle() 
    {
        int r = 2;
        areacir = 3.14 * r * r;
        return areacircle();
    }
}

class rectangle extends shape 
{
    int arearec;

    int arearect() 
    {
        int l = 2, b = 3;
        arearec = l * b;
        return arearect();
    }
}

public class circ_rect {
    static int q;
    static int p;

    public static void main(String[] args) throws IOException
    {
        circle c = new circle();
        rectangle r = new rectangle();
        q = r.arearect();
        r.showarea(q);
        p = c.areacircle();
        c.showarea(p);
    }
}