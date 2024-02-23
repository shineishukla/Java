package basic;
//data types
class test{

    public static void main(String[] args) {
        int age= 37;
        String name="John";
        float num=3.5f;
        byte marks=48;
        char gender='M';
        System.out.println(age);
        System.out.println(name);
        System.out.println(num);
        System.out.println(gender);
        System.out.println(marks);
        //implicit conversions
        int x= 100;
        long y=x;
        float z=y;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        //explicit conversion
        double p=55.7;
        int i= (int) p;
        System.out.println(p);
        System.out.println(i);
    }
}

//swap two numbers
class Swap{

    public static void main(String[] args) {
        int a=10;
        int b=20;
        int temp=0;
        temp=a;
        a=b;
        b=temp;
        System.out.println(a);
        System.out.println(b);
    }
}


