package employeeWage;

public class EmployeeWages {
    public static void main(String[] args) {
        int is_Full_Time = 1;
        int EMP_RATE_PER_HOUR = 20;
        int empHrs = 0;
        int empWage;

        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == is_Full_Time)
            empHrs = 8;
        empWage = empHrs * EMP_RATE_PER_HOUR;
            System.out.println("Daily Employee Wage : " + empWage);
    }
}
