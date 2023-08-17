
public class Main {
    public static void main(String[] args) {


        int balance = 100;
        int replenishment = 1100;

        int bonus = (replenishment) / 100;
        if (replenishment > 1000) {
            balance += bonus + replenishment;
        } else {
            bonus = 0;
            balance += bonus + replenishment;
        }
        System.out.println("New check: " + balance);
        System.out.println("Bonus money: " + bonus);

    }
}
