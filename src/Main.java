import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        double yourDeposit = 0;
        double yourProfit = 0;
        Scanner in = new Scanner(System.in);

        yourDeposit = in.nextDouble();

        if(yourDeposit < 100) {
            double perc = yourDeposit;
            perc = yourDeposit / 100 * 5;
            yourProfit = yourDeposit + perc;
            System.out.println("Your earned money = " + yourProfit);

        } else if(yourDeposit > 100 && yourDeposit < 200) {
            double perc = yourDeposit;
            perc = yourDeposit / 100 * 7;
            yourProfit = yourDeposit + perc;
            System.out.println("Your earned money = " + yourProfit);

        } else if(yourDeposit > 200) {
            double perc = yourDeposit;
            perc = yourDeposit / 100 * 10;
            yourProfit = yourDeposit + perc;
            System.out.println("Your earned money = " + yourProfit);
        }
        in.close();
    }
}
