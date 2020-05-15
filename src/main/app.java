package main;

import model.employee;

public class app {
    public static void main(String[] args) {

        System.out.println("Hello Bitches");
        employee myEmployee = new employee();
        myEmployee.setEmployeeID(10);
        myEmployee.setSalary(100000);
        myEmployee.setEmployeeName("Daniel");
        System.out.println(myEmployee.getEmployeeID() + " " + myEmployee.getEmployeeName() +" makes " + myEmployee.getSalary() + " dollars a year");
    }
}
