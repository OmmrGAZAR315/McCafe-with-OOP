import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main implements size {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        boolean wrongInput;
        ArrayList<Drink> orders = new ArrayList<>();
        String cupName;
        String Cupsize;
        int cupNo;
        char checkout;
        do {
            do {
                System.out.println("Please Choose your order!");
                System.out.println("1 - Americano---from L.E. 23.00");
                System.out.println("2 - Latté-------from L.E. 31.00");
                System.out.println("3 - Cappuccino----from L.E. 30.00");
                System.out.println("4 - Frappé--------from L.E. 27.00");
                System.out.println("(Regular: L.E. +10 , Large: L.E. +16)");
                String[] cupNameChooserPossibilities = {"1", "americano", "2", "latte", "3", "cappuccino", "4", "frappe"};
                cupName = size.Checker(cupNameChooserPossibilities);
            } while (cupName == null);
            do {
                System.out.print("What size do you want?");
                System.out.println(" ( Small, Medium, Large ) ");
                String[] cupSizeChooserPossibilities = {"1", "small", "2", "medium", "3", "large", " ", " "};
                Cupsize = size.Checker(cupSizeChooserPossibilities);
            } while (Cupsize == null);
            do {
                System.out.println("How many cups would you like to buy?");
                cupNo = size.noChecker(input.nextInt());
                if (cupNo == 0) System.out.println("you can't order zero cup >:(");
                System.out.println();
            } while (cupNo == 0);
            orders.add(new Drink(cupName, Cupsize, cupNo));
            do {
                wrongInput = false;
                System.out.println("Go to checkout y/n?");
                checkout = input.next().toLowerCase().charAt(0);
                if (checkout != 'n' && checkout != 'y') {
                    System.out.println("Wrong input, please try again");
                    wrongInput = true;
                }
            } while (wrongInput);
        } while (checkout == 'n');

        int arraySize = orders.size();
        for (int x = 0; x < arraySize; x++) {
            for (int j = 0; j < orders.size(); j++) {
                if (orders.get(x).cupName.equals(orders.get(j).cupName) && orders.get(x).size.equals(orders.get(j).size)) {
                    if (x != j) {
                        orders.get(x).cupNo += orders.get(j).cupNo;
                        orders.get(x).cupTotal += orders.get(j).cupTotal;
                        orders.remove(orders.get(j));
                        arraySize = orders.size() - 1;
                        j--;
                    }
                }
            }

        }
        Collections.sort(orders);
        System.out.println("\nyour Order Summary");
        for (
                Drink cup : orders) {
            System.out.println(cup.cupName + " " + cup.size + " x " + cup.cupNo + " = " + df.format(cup.cupTotal));
        }
        System.out.println("Subtotal:       " + df.format(Drink.subTotal) + " .L.E.");
        System.out.println("Service:        " + df.format(Drink.service) + " .L.E.");
        System.out.println("Tax:            " + df.format(Drink.tax) + " .L.E.");
        System.out.println("Total:          " + df.format(Drink.total) + " .L.E.");

    }
}