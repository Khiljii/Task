package com.example.task.com.example.task;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Record{
    String name;
    String className;
    String rolNo;
    public Record(String n,String c,String r){
        this.name=n;
        this.className=c;
        this.rolNo=r;
    }

    @Override
    public String toString() {
        return "Name: '" + name +
                "', Class: '" + className +
                "', Roll No: '" + rolNo + "'";
    }
}

public class Student {

    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        List<Record> recordList= new ArrayList<>();
        String check;
        do{
            System.out.print("Enter Studdent Name: ");
            String name=sn.nextLine();
            System.out.println("");
            System.out.print("Enter Studdent Class: ");
            String className=sn.nextLine();
            System.out.println("");
            System.out.print("Enter Studdent Roll No: ");
            String rollNo=sn.nextLine();
            System.out.println("");
            recordList.add(new Record(name,className,rollNo));
            System.out.println("Enter new Student Record Y/N");
            check=sn.nextLine();
        }while (check.equals('Y') || check.equals('y'));
        System.out.print("Enter name to search: ");
        String name=sn.nextLine();
        System.out.println("");
        List<Record> students = recordList.stream().filter(x -> x.name.equals(name)).collect(Collectors.toList());
        if(students.size()==0){
            System.out.println("Student not found");
        }else {
            students.stream().forEach(x-> System.out.println(x.toString()));
        }
    }
}
