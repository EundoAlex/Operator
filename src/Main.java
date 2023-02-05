public class Main {

    public static void main(String[] args) {
        int money = 100;
        int rep = 1100;
        int bonus;
        if (rep >= 1000) {
            bonus = rep / 100;
        } else {
            bonus = 0;
        }
        int total = money + rep + bonus;

        System.out.println("Пополнение счета: " + rep + " руб");
        System.out.println("Итоговый баланс: " + rep + " руб + бонус за пополнение " + bonus + " руб = " + total + " руб");
    }
}



