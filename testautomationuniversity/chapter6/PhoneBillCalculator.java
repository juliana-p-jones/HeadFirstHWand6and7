package testautomationuniversity.chapter6;

public class PhoneBillCalculator {
    public static void main(String[] args) {
        System.out.println(PhoneBill.overage(100));
        System.out.println(PhoneBill.tax(100));
        System.out.println(PhoneBill.totalCost(10.0));
        System.out.println(PhoneBill.printBill(60.0));
    }
}
