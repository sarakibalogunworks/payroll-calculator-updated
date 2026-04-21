package com.pluralsight;

public class Employee {
    public class Employee {

        private int employeeId;
        private String name;
        private double hoursWorked;
        private double payRate;

        public Employee(int id, String n, double hours, double rate) {
            this.employeeId = id;
            this.name = n;
            this.hoursWorked = hours;
            this.payRate = rate;
        }

        public double getGrossPay() {
            return this.hoursWorked * this.payRate;
        }

        public int getEmployeeId() {
            return this.employeeId;
        }

        public String getName() {
            return this.name;
        }

        public double getHoursWorked() {
            return this.hoursWorked;
        }

        public double getPayRate() {
            return this.payRate;
        }
}
