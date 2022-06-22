import java.util.Arrays;

public class VarArgs {
    public static void main(String args[])
    {
        fun();
    }
    static void fun(int ...v)
    {
        System.out.println(Arrays.toString(v));
    }

}
