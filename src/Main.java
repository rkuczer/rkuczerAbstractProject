import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        var allEmployees = new ArrayList<Employee>();
        var emp1 = new CommissionEmployee();
        emp1.makeSale();
        emp1.makeSale();
        allEmployees.add(emp1);
        Employee emp = new CommissionEmployee();
        allEmployees.add(emp);
        emp = new SalariedEmployee(50000); //do not need to change name abstract variable takes care of that
        allEmployees.add(emp);

        for(var payee : allEmployees){
            System.out.println("paying employee " + payee.calculateBiWeeklyPay());
        }
    }
}
