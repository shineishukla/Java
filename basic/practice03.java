/*input methods: BufferReader Class and Scanner Class */


//BufferReader Class
package basic;
import java.io.*;

//string
class inputMethodString {
    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a string: ");
        String s= br.readLine();
        System.out.println("You entered: "+ s); 
    }
}

//integer
class inputMethodinteger {
    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number: ");
        int t= Integer.parseInt(br.readLine());
        System.out.println("You entered: "+ t); 
    }
}


