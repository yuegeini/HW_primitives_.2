import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter additional money: ");

        int check = myObj.nextInt() + 100;

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
