public abstract class Employee{

    abstract public  double calculateBiWeeklyPay();

    public void notAbstract(){

    }

    public void withholdTaxes(){
        System.out.println("We are witholding " +
                calculateBiWeeklyPay()*.1+ "From your paycheck");
    }

    public final void fileW2Forms(){
        System.out.println("That is one copy for you, and one for the IRS");
    }
}