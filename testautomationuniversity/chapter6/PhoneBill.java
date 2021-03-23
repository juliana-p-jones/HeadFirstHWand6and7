package testautomationuniversity.chapter6;

public class PhoneBill {
    //global variables
    public static int minutes = 200;
    public static double baseCost = 50.00;
    public static int id= 1234567890;
    public static double budget = 75.00;

    public static double overage(int mins){
        double overage = (baseCost + (minutes / mins) / budget);
        return overage;
    }
    public static double tax(double overage){
        double taxFee = .1 * overage;
        return taxFee;
    }
    public static double totalCost(double taxFee){
        double totalCost = taxFee + baseCost;
        return totalCost;
    }
    public static String printBill(double totalCost){
        String print = "Your bill for number " + id + " this month is: $" + totalCost;
        return print;
    }


}
