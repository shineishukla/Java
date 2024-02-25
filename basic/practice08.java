package basic;

public class practice08 {
    public static void main(String[] args) {
        //arithmetic
        int a=20, b=30;
        System.out.println(a+b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        //unary
        int w=a++;
        System.out.println(w);
        int y=++b;
        System.out.println(y);
        int x= b--;
        System.out.println(x);
        int z=--a;
        System.out.println(z);
        
        //assignment
        int p = 10;
        p += 5; // now 15
        System.out.println(p);
        p -= 3; // now 12
        System.out.println(p);
        p *= 2; // now 24
        System.out.println(p);
        p /= 4;
        System.out.println(p);

    }
}
