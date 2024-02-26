package basic;

class practice{
    public static void main(String[] args) {
        //relational operator
        int a = 12, b = 5;
        System.out.println(a == b);  // false
        System.out.println(a != b);  
        System.out.println(a <= b);  
        System.out.println(a >= b);
        System.out.println(a > b);  
        System.out.println(a < b);  

        //logical operator
        System.out.println((5 > 3) && (8 > 5));  //true
        System.out.println((5 > 3) && (8 < 5));  //false
        System.out.println((5 < 3) || (8 > 5));  // true
        System.out.println((5 < 3) || (8 < 5));  // false
        System.out.println(!(5 == 3));  // true
        System.out.println(!(5 > 3));  // false

    }
}
