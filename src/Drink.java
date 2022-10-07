
public class Drink implements getCup, Comparable {

    String cupName;
    String size;
    int cupNo;
    double cupPrice;
    double cupTotal = 0;
    static double service;
    static double tax;
    static double total;
    static double subTotal = 0;

    public Drink(String cupName, String size, int cupNo) {
        getCupName(cupName);
        getSize(size);
        this.cupNo = cupNo;
        cupTotal = cupPrice * cupNo;
        subTotal += cupTotal;
        service = subTotal * 0.05;
        tax = subTotal * 0.14;
        total = service + subTotal + tax;

    }

    @Override
    public void getCupName(String cupName) {
        switch (cupName) {
            case "Americano" -> {
                this.cupName = "Americano";
                this.cupPrice = 23;
            }
            case "Latte" -> {
                this.cupName = "latté";
                this.cupPrice = 31;
            }
            case "Cappuccino" -> {
                this.cupName = "Cappuccino";
                this.cupPrice = 30;
            }
            case "Frappe" -> {
                this.cupName = "Frappé";
                this.cupPrice = 27;
            }
        }
    }

    @Override
    public void getSize(String cupSize) {
        switch (cupSize) {
            case "Small" -> size = "Small";
            case "Medium" -> {
                size = "medium";
                cupPrice += 10;
            }
            case "Large" -> {
                size = "Large";
                cupPrice += 16;
            }
        }
    }

    @Override
    public int compareTo(Object o) {
        Drink drinks = (Drink) o;
        if (cupTotal < drinks.cupTotal)
            return 1;
        else if (drinks.cupTotal < cupTotal)
            return -1;
        else return 0;
    }
}
