// Program to find no. of objects created out of a class using 'static' modifier.

import java.io.*;

public class p8 {

    static int count = 0;

    public p8() {
        count++;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        p8 ob1 = new p8();
        p8 ob2 = new p8();
        p8 ob3 = new p8();
        p8 ob4 = new p8();
        p8 ob5 = new p8();

        System.out.println("\nnumber of objects created:\t" + count);
        System.out.println("\n");
    }

}