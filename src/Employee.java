public abstract class Employee {
    abstract public double calculateWeeklyPay();

    public void withholdTaxes(){
        System.out.println("We are witholding " + calculateWeeklyPay()*.1 + " from your paycheck");
    }

    public void fileW2Forms(){
        System.out.print("One copy for you and one for the IRS.");
    }
}
