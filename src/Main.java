//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double balance, intrestRate, monthlyRate, balanceOneMonth, intrestOneMonth;
        double balanceTwoMonths, intrestTwoMonths;
        intrestRate =0.17;
        balance =5000.00;
        monthlyRate = intrestRate / 12;
        balanceOneMonth = balance * (1 + monthlyRate);
        intrestOneMonth = balanceOneMonth - balance;
        System.out.printf("Balance After 1 month: $");
        System.out.println(intrestOneMonth);
        System.out.printf("Intrest after 1 month: $");
        System.out.println(balanceOneMonth);
        balanceTwoMonths = balanceOneMonth * (1 + monthlyRate);
        intrestTwoMonths = balanceTwoMonths - balanceOneMonth;
        System.out.printf("Balance after 2 months: $");
        System.out.println(balanceTwoMonths);
        System.out.printf("Intrest after 2 months: $");;
        System.out.println(intrestTwoMonths);






    }
}