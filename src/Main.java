public class Main {
    public static void main(String[] args) {
        int balance = 200;
        int refillBalance = 500;
        int bonus;
        int totalBalance;

        if(refillBalance >= 1000) {
            bonus = refillBalance/100;
            totalBalance = balance + refillBalance + bonus;}
        else {
            bonus = 0;
            totalBalance = balance + refillBalance;
        }
        System.out.print("Баланс после пополнения равен = ");
        System.out.println(totalBalance);
        System.out.print("Сумма бонусов равна = ");
        System.out.println(bonus);
    }
}