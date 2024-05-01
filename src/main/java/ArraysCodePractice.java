import java.sql.SQLOutput;

public class ArraysCodePractice {
    public static void main(String[] args) {
        int a =15;
        int b = 20;
        swap(a,b);
    }
    static void swap(int a, int b){
        System.out.println("Original values before swap");
        System.out.println("a: "+a);
        System.out.println("b: "+ b);
        int temp = a;
        a=b;
        b=temp;
        System.out.println("values after swap");
        System.out.println("a: "+a);
        System.out.println("b: "+ b);
    }
}
