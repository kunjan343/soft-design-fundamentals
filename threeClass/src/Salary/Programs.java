package Salary;

public class Programs {
    public static void main(String[] args) {
        Employee emp = new Employee(13, 10);
        Manager mng = new Manager(16, 14, 70);

        System.out.println("Employee salary:" + emp.calculatePay());
        System.out.println("Manager salary:" + mng.calculatePay());
    }
}
