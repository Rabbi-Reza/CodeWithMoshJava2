package com.nirzhor;

public class ProceduralToOOP {

    public static void main(String[] args) {

        /*
        var browser = new Browser();
        browser.navigate("123");
        */

        var employee = new Employee(
                50_000,
                0);
       // employee.setBaseSalary(50_000);
       // employee.setHourlyRate(20);

       /// employee.getBaseSalary();
        ///employee.baseSalary = 50_000;
       /// employee.getBaseSalary();

       /// System.out.println(Employee.numberOfEmployees);
        Employee.printNumberOfEmployee(); /// Static
        int wage = employee.calculateWage(10);
        System.out.println(wage);
        

    }

}
