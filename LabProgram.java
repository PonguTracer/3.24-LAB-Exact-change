import java.util.Scanner;

public class LabProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalPennies;
        int dollars, quarters, dimes, nickels, pennies;

        totalPennies = scanner.nextInt();

        if (totalPennies == 0) {
            System.out.println("No change");
        } else {
            dollars = totalPennies / 100;
            totalPennies %= 100;

            quarters = totalPennies / 25;
            totalPennies %= 25;

            dimes = totalPennies / 10;
            totalPennies %= 10;

            nickels = totalPennies / 5;
            pennies = totalPennies % 5;

            if (dollars > 0) {
                System.out.println(dollars + (dollars == 1 ? " Dollar" : " Dollars"));
            }
            if (quarters > 0) {
                System.out.println(quarters + (quarters == 1 ? " Quarter" : " Quarters"));
            }
            if (dimes > 0) {
                System.out.println(dimes + (dimes == 1 ? " Dime" : " Dimes"));
            }
            if (nickels > 0) {
                System.out.println(nickels + (nickels == 1 ? " Nickel" : " Nickels"));
            }
            if (pennies > 0) {
                System.out.println(pennies + (pennies == 1 ? " Penny" : " Pennies"));
            }
        }
    }
}
