package com.techelevator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Application {

    /**
     * The main entry point in the application
     *
     * @param args
     */

   List<Department> departments = new ArrayList<>();


   List<Employee>employees = new ArrayList<>();

   Map<String,Project> projects = new HashMap<>();
   List<Employee>engineers = new ArrayList<>();
    List<Employee>marketers = new ArrayList<>();



    public static void main(String[] args) {
        Application app = new Application();
        app.run();
    }

    private void run() {
        // create some departments
        createDepartments();

        // print each department by name
        printDepartments();

        // create employees
        createEmployees();

        // give Angie a 10% raise, she is doing a great job!

        // print all employees
        printEmployees();

        // create the TEams project
        createTeamsProject();
        // create the Marketing Landing Page Project
        createLandingPageProject();

        // print each project name and the total number of employees on the project
        printProjectsReport();
    }

    /**
     * Create departments and add them to the collection of departments
     */
    private void createDepartments() {
      Department marketing = new Department(001, "Marketing");
      Department sales = new Department(002, "Sales");
      Department engineering = new Department(003, "Engineering");
      departments.add(marketing);
      departments.add(sales);
      departments.add(engineering);

    }
    /**
     * Print out each department in the collection.
     */
    private void printDepartments() {
        System.out.println("------------- DEPARTMENTS ------------------------------");
        for(Department department: departments){
            System.out.println(department.getName());
        }
    }

    /**
     * Create employees and add them to the collection of employees
     */
    private void createEmployees() {
        Employee dean = new Employee();
        dean.setFirstName("Dean");
        dean.setLastName("Johnson");
        dean.setEmail("djohnson@teams.com");
        dean.setSalary(60000);
        dean.setDepartment(departments.get(2));
        dean.setHireDate("08/21/2020");
        dean.setEmployeeId(1);

        //public Employee(long employeeId, String firstName, String lastName, String email,
        //                    Department department, String hireDate, double salary){
        //        this.employeeId = employeeId;
        //        this.firstName = firstName;
        //        this.lastName = lastName;
        //        this.email = email;
        //        this.department = department;
        //        this.hireDate = hireDate;
        //        this.salary = salary;

        Employee angie = new Employee(2, "Angie", "Smith", "asmith@teams.com", departments.get(2), "08/21/2020");
        Employee margaret = new Employee(3, "Margaret", "Thompson", "mthompson@teams.com", departments.get(0), "08/21/2020");

        angie.raiseSalary(10);
        employees.add(dean);
        employees.add(angie);
        employees.add(margaret);
    }

    /**
     * Print out each employee in the collection.
     */
    private void printEmployees() {
        System.out.println("\n------------- EMPLOYEES ------------------------------");
        for(Employee employee: employees){
            System.out.println(employee.getFullName() + " (" + employee.getSalary() + ") " + employee.getDepartment().getName());
        }

    }


    /**
     * Create the 'TEams' project.
     */
    private void createTeamsProject() {
        Project TEams = new Project("TEams", "Project Management Software", "10/10/2020", "11/10/2020");
        for(Employee employee: employees){
            if(employee.getDepartment().equals(departments.get(2))){
                engineers.add(employee);
            }
        }
        TEams.setTeamMembers(engineers);
        projects.put(TEams.getName(),TEams);
    }

    /**
     * Create the 'Marketing Landing Page' project.
     */
    private void createLandingPageProject() {
        Project TEams = new Project("TEams", "Lead Capture Landing Page for Marketing", "10/10/2020", "10/17/2020");
        for(Employee employee: employees){
            if(employee.getDepartment().equals(departments.get(0))){
                marketers.add(employee);
            }
        }
        TEams.setTeamMembers(marketers);
        projects.put(TEams.getName(),TEams);
    }



    /**
     * Print out each project in the collection.
     */
    private void printProjectsReport() {
        System.out.println("\n------------- PROJECTS ------------------------------");

        System.out.println("TEams: " + engineers.size());
                System.out.println("Marketing Landing Page: " + marketers.size());

    }

}
