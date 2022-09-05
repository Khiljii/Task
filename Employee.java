package com.example.task.com.example.task;

import java.util.Scanner;

public class Employee {
    int salary;
    int hours;

    public Employee() {

    }

    public void getInfo() {
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter Salary");
        salary=sn.nextInt();
        System.out.println("Enter Working Hours");
        hours=sn.nextInt();
    }

    public void addSel() {

        if (salary <= 500) {
            salary =salary+10;
        }
        System.out.println("Salary is " + salary);
    }

    public void addWork() {
        if (hours > 6) {
            salary=salary+5;
        }
        System.out.println("Salary is " + salary);
    }


    public static void main(String[] args) {
        Employee em = new Employee();
        em.getInfo();
        em.addSel();
        em.addWork();
    }
}