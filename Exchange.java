package com.example.task.com.example.task;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exchange {

    public static void main(String[] args) {
        Map<String,Float> usd = new HashMap<>();
        Map<String,Float> euro = new HashMap<>();
        Map<String,Float> aed = new HashMap<>();
        Map<String,Float> inr = new HashMap<>();
        Map<String,Float> pkr = new HashMap<>();
        Map<String,Float> cny = new HashMap<>();
        Scanner sn = new Scanner(System.in);

        usd.put("pkr", (float) 233.65);
        usd.put("euro", (float) 1.0043);
        usd.put("aed", (float) 3.5923);
        usd.put("inr", (float) 79.7935);
        usd.put("cny", (float) 6.934);

        euro.put("cny", (float) 6.8864);
        euro.put("usd", (float) 0.9931);
        euro.put("inr", (float) 6.934);
        euro.put("pkr", (float) 217.7884);
        euro.put("aed", (float) 3.6473);

        pkr.put("euro", (float) 0.0046);
        pkr.put("cny", (float) 0.0316);
        pkr.put("inr", (float) 0.3639);
        pkr.put("usd", (float) 0.0046);
        pkr.put("aed", (float) 0.0167);

        inr.put("aed", (float) 0.046);
        inr.put("pkr", (float) 2.7483);
        inr.put("usd", (float) 0.0125);
        inr.put("cny", (float) 0.0869);
        inr.put("euro", (float) 0.0126);

        cny.put("euro", (float) 0.1452);
        cny.put("pkr", (float) 31.6259);
        cny.put("usd", (float) 0.1442);
        cny.put("inr", (float) 11.5075);
        cny.put("aed", (float) 0.5296);

        aed.put("pkr", (float) 59.7127);
        aed.put("usd", (float) 0.2723);
        aed.put("cny", (float) 1.8881);
        aed.put("inr", (float) 21.7273);
        aed.put("euro", (float) 0.2742);

        int a = 0;
        int b=0;
        int c=0;
        String e="a";
        do {
            System.out.println("To enter amount in :");
            System.out.println("1: USD");
            System.out.println("2: EURO");
            System.out.println("3: CNY");
            System.out.println("4: AED");
            System.out.println("5: PKR");
            System.out.println("6: INR");
            a=sn.nextInt();
            if(a==0 || a>6){
                break;
            }
            System.out.println("Enter Amount : ");
            c=sn.nextInt();

            System.out.println("Enter in which you want to convert :");
            System.out.println("1: USD");
            System.out.println("2: EURO");
            System.out.println("3: CNY");
            System.out.println("4: AED");
            System.out.println("5: PKR");
            System.out.println("6: INR");
            b=sn.nextInt();


            switch (a){
                case 1:
                {
                    switch (b){

                        case 2:
                        {
                            Float x=usd.get("euro");
                            change ch =(m, n)->(m *n);
                            System.out.println("Your Amount in EURO is :"+ch.changeRate(c,x));
                            break;
                        }
                        case 3:
                        {
                            Float x=usd.get("cny");
                            change ch =(m, n)->(m *n);
                            System.out.println("Your Amount in CNY is :"+ch.changeRate(c,x));
                            break;
                        }
                        case 4:
                        {
                            Float x=usd.get("aed");
                            change ch =(m, n)->(m *n);
                            System.out.println("Your Amount in AED is :"+ch.changeRate(c,x));
                            break;
                        }
                        case 5:
                        {
                            Float x=usd.get("pkr");
                            change ch =(m, n)->(m *n);
                            System.out.println("Your Amount in PKR is :"+ch.changeRate(c,x));
                            break;
                        }
                        case 6:
                        {
                            Float x=usd.get("inr");
                            change ch =(m, n)->(m *n);
                            System.out.println("Your Amount in INR is :"+ch.changeRate(c,x));
                            break;
                        }
                        default:{
                            System.out.println("Wrong choice");
                            break;
                        }

                    }
                    break;
                }
                case 2:
                {
                    switch (b){
                        case 1:
                        {
                            Float x=euro.get("usd");
                            change ch =(m, n)->(m *n);
                            System.out.println("Your Amount in USD is :"+ch.changeRate(c,x));
                            break;
                        }
                        case 3:
                        {
                            Float x=euro.get("cny");
                            change ch =(m, n)->(m *n);
                            System.out.println("Your Amount in CNY is :"+ch.changeRate(c,x));
                            break;
                        }
                        case 4:
                        {
                            Float x=euro.get("aed");
                            change ch =(m, n)->(m *n);
                            System.out.println("Your Amount in AED is :"+ch.changeRate(c,x));
                            break;
                        }
                        case 5:
                        {
                            Float x=euro.get("pkr");
                            change ch =(m, n)->(m *n);
                            System.out.println("Your Amount in PKR is :"+ch.changeRate(c,x));
                            break;
                        }
                        case 6:
                        {
                            Float x=euro.get("inr");
                            change ch =(m, n)->(m *n);
                            System.out.println("Your Amount in INR is :"+ch.changeRate(c,x));
                            break;
                        }
                        default:{
                            System.out.println("Wrong choice");
                            break;
                        }
                    }
                    break;
                }
                case 3:
                {
                    switch (b){
                        case 1:
                        {
                            Float x=cny.get("usd");
                            change ch =(m, n)->(m *n);
                            System.out.println("Your Amount in USD is :"+ch.changeRate(c,x));
                            break;
                        }
                        case 2:
                        {
                            Float x=cny.get("euro");
                            change ch =(m, n)->(m *n);
                            System.out.println("Your Amount in EURO is :"+ch.changeRate(c,x));
                            break;
                        }
                        case 4:
                        {
                            Float x=cny.get("aed");
                            change ch =(m, n)->(m *n);
                            System.out.println("Your Amount in AED is :"+ch.changeRate(c,x));
                            break;
                        }
                        case 5:
                        {
                            Float x=cny.get("pkr");
                            change ch =(m, n)->(m *n);
                            System.out.println("Your Amount in PKR is :"+ch.changeRate(c,x));
                            break;
                        }
                        case 6:
                        {
                            Float x=cny.get("inr");
                            change ch =(m, n)->(m *n);
                            System.out.println("Your Amount in INR is :"+ch.changeRate(c,x));
                            break;
                        }
                        default:{
                            System.out.println("Wrong choice");
                            break;
                        }
                    }
                    break;
                }
                case 4:
                {
                    switch (b){
                        case 1:
                        {
                            Float x=aed.get("usd");
                            change ch =(m, n)->(m *n);
                            System.out.println("Your Amount in USD is :"+ch.changeRate(c,x));
                            break;
                        }
                        case 2:
                        {
                            Float x=aed.get("euro");
                            change ch =(m, n)->(m *n);
                            System.out.println("Your Amount in EURO is :"+ch.changeRate(c,x));
                            break;
                        }
                        case 3:
                        {
                            Float x=aed.get("cny");
                            change ch =(m, n)->(m *n);
                            System.out.println("Your Amount in CNY is :"+ch.changeRate(c,x));
                            break;
                        }
                        case 5:
                        {
                            Float x=aed.get("pkr");
                            change ch =(m, n)->(m *n);
                            System.out.println("Your Amount in PKR is :"+ch.changeRate(c,x));
                            break;
                        }
                        case 6:
                        {
                            Float x=aed.get("inr");
                            change ch =(m, n)->(m *n);
                            System.out.println("Your Amount in INR is :"+ch.changeRate(c,x));
                            break;
                        }
                        default:{
                            System.out.println("Wrong choice");
                            break;
                        }
                    }
                    break;
                }
                case 5:
                {
                    switch (b){
                        case 1:
                        {
                            Float x=pkr.get("usd");
                            change ch =(m, n)->(m *n);
                            System.out.println("Your Amount in USD is :"+ch.changeRate(c,x));
                            break;
                        }
                        case 2:
                        {
                            Float x=pkr.get("euro");
                            change ch =(m, n)->(m *n);
                            System.out.println("Your Amount in EURO is :"+ch.changeRate(c,x));
                            break;
                        }
                        case 3:
                        {
                            Float x=pkr.get("cny");
                            change ch =(m, n)->(m *n);
                            System.out.println("Your Amount in CNY is :"+ch.changeRate(c,x));
                            break;
                        }
                        case 4:
                        {
                            Float x=pkr.get("aed");
                            change ch =(m, n)->(m *n);
                            System.out.println("Your Amount in AED is :"+ch.changeRate(c,x));
                            break;
                        }
                        case 6:
                        {
                            Float x=pkr.get("inr");
                            change ch =(m, n)->(m *n);
                            System.out.println("Your Amount in INR is :"+ch.changeRate(c,x));
                            break;
                        }
                        default:{
                            System.out.println("Wrong choice");
                            break;
                        }
                    }
                    break;
                }
                case 6:
                {
                    switch (b){
                        case 1:
                        {
                            Float x=inr.get("usd");
                            change ch =(m, n)->(m *n);
                            System.out.println("Your Amount in USD is :"+ch.changeRate(c,x));
                            break;
                        }
                        case 2:
                        {
                            Float x=inr.get("euro");
                            change ch =(m, n)->(m *n);
                            System.out.println("Your Amount in EURO is :"+ch.changeRate(c,x));
                            break;
                        }
                        case 3:
                        {
                            Float x=inr.get("cny");
                            change ch =(m, n)->(m *n);
                            System.out.println("Your Amount in CNY is :"+ch.changeRate(c,x));
                            break;
                        }
                        case 4:
                        {
                            Float x=inr.get("aed");
                            change ch =(m, n)->(m *n);
                            System.out.println("Your Amount in AED is :"+ch.changeRate(c,x));
                            break;
                        }
                        case 5:
                        {
                            Float x=inr.get("pkr");
                            change ch =(m, n)->(m *n);
                            System.out.println("Your Amount in PKR is :"+ch.changeRate(c,x));
                            break;
                        }
                        default:{
                            System.out.println("Wrong choice");
                            break;
                        }
                    }
                    break;
                }
                default:
                {
                    System.out.println("Wrong choice");
                    break;
                }

            }
            System.out.println("");
            System.out.println("");
            System.out.println("Run Again Y/N");
            e=sn.nextLine();
        }while(e!="n" || e!="N");


    }
}
