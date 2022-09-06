package com.example.task.com.example.task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exchange {
    public static void main(String[] args) {

        float[] array = new float[]{(float) 233.65, (float) 1.0043, (float) 3.5923, (float) 79.7935, (float) 6.934};
        ArrayList<Float> rate =new ArrayList<>();
        rate.add(0, (float) 233.65);
        rate.add(1, (float) 1.0043);
        rate.add(2, (float) 3.5923);
        rate.add(3, (float) 79.7935);
        rate.add(4, (float) 6.934);

        Scanner sn = new Scanner(System.in);
        int a = 0;
        int b=0;
        float c=0;
        String e="a";
        change ch=(x,y)->x*y;
        do {
            System.out.println("To enter amount in :");
            System.out.println("1: PKR");
            System.out.println("2: EURO");
            System.out.println("3: AED");
            System.out.println("4: INR");
            System.out.println("5: CNY");
            System.out.println("6: USD");
            a = sn.nextInt();
            if (a == 0 || a > 6) {
                break;
            }
            System.out.println("Enter Amount : ");
            c = sn.nextInt();
            if (a != 6) {
                c = c / rate.get(a - 1);
            }


            System.out.println("Enter in which you want to convert :");
            System.out.println("1: PKR");
            System.out.println("2: EURO");
            System.out.println("3: AED");
            System.out.println("4: INR");
            System.out.println("5: CNY");
            System.out.println("6: USD");
            b = sn.nextInt();
            if (b != 6) {
                System.out.println("Your Amount after Exchange is :" + ch.changeRate(c, rate.get(b - 1)));
            }else{
                System.out.println("Your Amount after Exchange is :" + c);
            }
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("Wants to run again Y/N");
            e=sn.nextLine();

        }while (e!="n" || e!="N");

    }
}
