public abstract class Employee {
    abstract public double calculateBiWeeklyPay();

    public void withholdTaxes(){
        System.out.println("We are witholding " + calculateBiWeeklyPay()*.1 + " from your paycheck");
    }

    public void notAbstract(){

    }

    public final void fileW2Forms(){
        System.out.print("One copy for you and one for the IRS.");
    }


}
