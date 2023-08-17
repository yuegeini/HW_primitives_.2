
public class Main {
    public static void main(String[] args) {


        int check = 100;
        int cash = 1050;
        check += cash;

        int add = (check - 100) / 100;
        if (check > 1100) {
            check += add;
        } else {
            add = 0;
        }
        System.out.println("New check: " + check);
        System.out.println("Bonus money: " + add);

    }
}
