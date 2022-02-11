public class Main {
        public static void main(String[] args) {
            int pay = 1000;
            int balance = 100;
            int bonus;

            if (pay > 1000){
                bonus = pay / 100;
            } else {
                bonus = 0;
            }
            balance = balance + pay + bonus;
            System.out.println("Ваш баланс равен:" + balance);
        }
}


