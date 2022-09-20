package com.example.task.com.example.task;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Record{
    String firstName;

    String lastName;

    String age;
    String className;
    String rollNo;
    Scanner sn=new Scanner(System.in);
    public void setData(){

        System.out.print("Enter Studdent First Name: ");
        firstName=sn.nextLine();

        System.out.print("Enter Studdent Last Name: ");
        lastName=sn.nextLine();

        System.out.print("Enter Studdent Age: ");
        age=sn.nextLine();

        System.out.print("Enter Studdent Class: ");
        className=sn.nextLine();

        System.out.print("Enter Studdent Roll No: ");
        rollNo=sn.nextLine();
        System.out.println("");

    }
    public List<Record> search(List<Record> r){
        System.out.print("Enter to search: ");
        String name=sn.nextLine();
        System.out.println("");
        List<Record> students=r.stream().filter(x -> x.firstName.equals(name)).collect(Collectors.toList());
        List<Record> student1=r.stream().filter(x -> x.lastName.equals(name)).collect(Collectors.toList());
        List<Record> student2=r.stream().filter(x -> x.age.equals(name)).collect(Collectors.toList());
        List<Record> student3=r.stream().filter(x -> x.className.equals(name)).collect(Collectors.toList());
        List<Record> student4=r.stream().filter(x -> x.rollNo.equals(name)).collect(Collectors.toList());
        if(students.size()>0){
            return students;
        }else if (student1.size()>0){
            return student1;
        } else if (student2.size()>0) {
            return student2;
        } else if (student3.size()>0) {
            return student3;
        }else
            return student4;

    }

    @Override
    public String toString() {
        return "FirstName: '" + firstName +"', LastName: '" + lastName +"', Age: '" + age +
                "', Class: '" + className +
                "', Roll No: '" + rollNo + "'";
    }
}

public class Student {

    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        List<Record> recordList= new ArrayList<>();
        String check;
        do{
            Record record=new Record();
            record.setData();
            recordList.add(record);
            System.out.println("Enter new Student Record Y/N");
            check=sn.nextLine();
        }while (check.equals('N') || check.equals('n'));
        Record record=new Record();
                List<Record> students = record.search(recordList);
        if(students.size()==0){
            System.out.println("Student not found");
        }else {
            students.stream().forEach(x-> System.out.println(x.toString()));
        }
    }
}
