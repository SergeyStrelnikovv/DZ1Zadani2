public class Main {
        public static void main(String[] args) {
            int pay = 1000;
            int balance = 100;
            int bonus = pay / 100;

            if (pay > 1000){
                bonus = pay / 100;
                balance = balance + pay + bonus;
            } else {
                balance = pay + balance;
            }
            System.out.println("Ваш баланс равен:" + balance);
        }
}


