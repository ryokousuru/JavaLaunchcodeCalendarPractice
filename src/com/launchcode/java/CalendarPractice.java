package com.launchcode.java;

import java.awt.desktop.SystemEventListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Arrays;
import java.util.Scanner;
//import java.util.*;   * import statement increases compilation time

public class CalendarPractice {


    public static void main(String[] args) {

        Calendar ca = Calendar.getInstance();
        ca.add(Calendar. DATE, 111);          //0 is today's date; 1 is tomorrow
        System.out.println(ca.getTime());
        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-mm-dd");
        String formatted = format1.format(ca.getTime());
        System.out.println(formatted);

        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int[]array = new int[b];
        for (int c = 0; c < b; c += 1){
            array[c] = sc.nextInt();
        }

    }
}
