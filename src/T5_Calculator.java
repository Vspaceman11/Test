import java.util.Scanner;

public class T5_Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        calculate(a,b,c);
        var ded = 10.1;        System.out.println(ded);
    }
    static void calculate(int a, int b, int c){
        System.out.println(a / 5);
        System.out.println(b / 5);
        System.out.println(c / 5);
    }
}
