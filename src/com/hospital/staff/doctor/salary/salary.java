package com.hospital.staff.doctor.salary;

public class salary {
    protected void calculatesalary(double amt, double tax) {
        double salaryAfterTax = amt - tax;
        System.out.println("Salary after tax deduction: " + salaryAfterTax);
    }
}
