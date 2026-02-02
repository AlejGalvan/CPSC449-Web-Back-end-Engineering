import java.io.*;
import java.util.*;

// Employee Class
class Employee {
  
    // Attributes of employee
    private String name;
  
    // Constructor of Employee class
    public Employee(String name)
    {
        // this keyword refers to current instance
        this.name = name;
    }

    // Method of Employee class
    public String getEmployeeName()
    {
        // returning the name of employee
        return this.name;
    }
}

// Bank Class
class Bank {

    // Attributes of bank
    private String bankName;
    private Set<Employee> employees;
  
    // Constructor of Bank class
    public Bank(String bankName)
    {
        this.bankName = bankName;
    }

    // Method of Bank class
    public String getBankName()
    {
        // Returning name of bank
        return this.bankName;
    }

    public void setEmployees(Set<Employee> employees)
    {
        this.employees = employees;
    }
  
    public Set<Employee> getEmployees()
    {
        return this.employees;
    }
}

// Association between Bank and Employee
public class Association {
    public static void main(String[] args) {
        // Create employee objects
        

        // Create a set of employees
        

        // Create bank object
        

        // Display bank employees
        
    }
}
