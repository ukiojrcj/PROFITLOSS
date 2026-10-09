import java.util.Scanner;

class ProfitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double cost_price, selling_price;

        System.out.print("Enter Cost Price: ");
        cost_price = sc.nextDouble();

        System.out.print("Enter Selling Price: ");
        selling_price = sc.nextDouble();

        if (selling_price > cost_price) {
            System.out.println("Profit = " + (selling_price - cost_price));
        } 
        else if (cost_price > selling_price) {
            System.out.println("Loss = " + (cost_price - selling_price));
        } 
        else {
            System.out.println("No Profit, No Loss");
        }

        sc.close();
    }
}