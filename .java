package com.mycompany.mavenproject1;

class Employee {
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

public class NewClass {
    public static void main(String[] args) {
        Employee e1 = new Employee("Sami", 466, 50000.0);

        System.out.println("Employee Name: " + e1.getName());
        System.out.println("Employee ID: " + e1.getId());
        System.out.println("Employee Salary: " + e1.getSalary());
    }
}
