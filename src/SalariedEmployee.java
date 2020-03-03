public class SalariedEmployee extends Employee{

    private double yearlySalary;

    public SalariedEmployee(double salary){
        yearlySalary = salary;
    }

    public void notAbstract(){
        System.out.println("doing something this time.");
        super.notAbstract();
    }

    public double calculateBiWeeklyPay(){
        return yearlySalary/26;
    }
}
