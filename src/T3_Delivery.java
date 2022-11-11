import java.util.Scanner;

public class T3_Delivery {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введіть число: ");
        int factorial =  factorial(input.nextInt());
        System.out.println("Факторіл дорівнює " + factorial);
    }

    // Використання рекурсії при обчісленні факторіала може привести до переповнення пам'яті

    static int factorial(int a){
        if(a == 0)
            return 1;
        else
            return a * factorial(a - 1);

    }
}
