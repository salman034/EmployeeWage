package employeeWage;

public class EmployeeWages {
    public static void main(String[] args) {
        int is_Full_Time = 1;
        int is_Part_Time = 2;
        int EMP_RATE_PER_HOUR = 20;
        int empHrs = 0;
        int empWage;

        double empCheck = Math.floor(Math.random() * 10) % 3;
        if (empCheck == is_Full_Time)
            empHrs = 8;
        else if (empCheck == is_Part_Time)
            empHrs = 4;
        empWage = empHrs * EMP_RATE_PER_HOUR;
            System.out.println("Employee Wage : " + empWage);
    }
}
