public class Main {
    public static void main(String[] args) {
        System.out.println("Получи рубль за каждые 100!");
        int check = 100;
        int replenishment = 100;
        int bonus = replenishment / 100;
        if (replenishment <= 1000) {
            check = check + replenishment;
            bonus = 0;
        } else {
            check = check + replenishment + bonus;
        }
        System.out.println("Ваш Счёт: " + check);
        System.out.println("Ваши бонусы: " + bonus);
        System.out.println("Спасибо, что выбрали нас!");
    }
}