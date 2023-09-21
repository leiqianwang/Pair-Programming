package com.techelevator;

public class Employee {
    private long employeeId;
    private String firstName;
    private String lastName;
    private String email;
    private double salary;
    private Department department;
    private String hireDate;
    final static double SALARY = 60000;

    public long getEmployeeId(){
        return employeeId;
    }
    public void setEmployeeId(long employeeId){
        this.employeeId = employeeId;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public Department getDepartment(){
        return department;
    }
    public void setDepartment(Department department){
        this.department = department;
    }
    public String getHireDate(){
        return hireDate;
    }
    public void setHireDate(String hireDate){
        this.hireDate = hireDate;
    }


    //constructor 1
    public Employee(long employeeId, String firstName, String lastName, String email,
                    Department department, String hireDate){
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.department = department;
        this.hireDate = hireDate;
        this.salary = 60000;
    }

    //constructor 2
    public Employee(){

    }

    //derived property
    public String getFullName(){
        return this.lastName + ", " + this.firstName;
    }

    //method, questions: is this method should return value or void?
    public double raiseSalary(double percent) {
        if (percent > 0.00) {
            salary = salary * (1.0 + (percent / 100));
        }
        return salary;

    }
}
