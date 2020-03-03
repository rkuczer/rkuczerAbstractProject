public class CommissionEmployee {
    private int numberOfSales;
    public static final double commission = 100; //final makes a variable unchangeable

    public CommissionEmployee(){
        numberOfSales = 0;
    }

    public void makeSale(){
        numberOfSales++;
    }

    @Override
    public double calculateBiWeeklyPay(){
        var pay = 1000 + numberOfSales*commission;
        numberOfSales = 0; //after paying commission resets
        return pay;
    }
}
