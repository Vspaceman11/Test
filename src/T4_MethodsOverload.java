import java.util.Scanner;

public class T4_MethodsOverload {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введіть 5 чисел:");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        int e = input.nextInt();

        int averageA = arithmeticMean(a, b, c);
        System.out.println("Середнє арфіметичне 3 чисел: " + averageA);

        int averageB = arithmeticMean(a, b, c, d);
        System.out.println("Середнє арфіметичне 4 чисел: " + averageB);

        int averageC = arithmeticMean(a, b, c, d, e);
        System.out.println("Середнє арфіметичне 5 чисел: " + averageC);

        maxAverageMin(averageA, averageB, averageC);
    }
    static int arithmeticMean(int a, int b, int c){
        return (a + b + c) / 3;
    }
    static int arithmeticMean(int a, int b, int c, int d){
        return (a + b + c + d) / 4;
    }
    static int arithmeticMean(int a, int b, int c, int d, int e){
        return (a + b + c + d + e) / 5;
    }
    static void maxAverageMin(int averageA, int averageB, int averageC){
     int max = 0;
     int min = 0;
     int average = 0;

     if ((averageA >= averageB) && (averageA >= averageC))
         max = averageA;
     else if ((averageB >= averageA) && (averageB >= averageC))
         max = averageB;
     else
         max = averageC;


     if ((averageA <= averageB) && (averageA <= averageC))
         min = averageA;
     else if ((averageB <= averageA) && (averageB <= averageC))
        min = averageB;
     else
         min = averageC;


     if ((averageA < max) && (averageA > min))
         average = averageA;
     else if ((averageB < max) && (averageB > min))
         average = averageB;
     else
         average = averageC;

     System.out.println("Максимальне значення: " + max);
     System.out.println("Середнє значення: " + average);
     System.out.println("Мінімальне значення: " + min);
    }

}
