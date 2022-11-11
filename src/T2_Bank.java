import java.util.Scanner;

public class T2_Bank {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Стан кредиту: 700 грн.");
        System.out.print("Введіть суму кредиту яку хочете сплатити: ");
        int payment = input.nextInt();
        paymentForCredit(payment);
    }
    static void paymentForCredit(int payment){
        int debtAmount = 700;
        Scanner input = new Scanner(System.in);
        while (true){
            debtAmount -= payment;

            if (debtAmount > 0){
                System.out.println("Стан кредиту: " + debtAmount + " грн.");
                payment = input.nextInt();
            } else if (debtAmount == 0){
                System.out.println("Стан кредиту: " + debtAmount + " грн.");
                System.out.println("Ви закрили кредит.");
                break;
            } else if (debtAmount < 0) {
                System.out.println("Сума переплати становить: " + (0 - debtAmount) + " грн");
                break;
            }
        }
    }
}