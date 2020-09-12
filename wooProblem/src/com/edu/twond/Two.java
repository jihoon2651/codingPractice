package com.edu.twond;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Two {

    public int[] solution(String logs) throws ParseException {

        int[] time = new int[24];

        SimpleDateFormat sim = new SimpleDateFormat("YYYY/MM/DD hh:mm:ss");

        Date date = null;

        Calendar cal = Calendar.getInstance();
        for (int i = 0; i < time.length; i++) {
            for (int j = 0; j < logs.split(",").length; j++) {
                date = sim.parse(logs.split(",")[j]);
                cal.setTime(date);
                int hour = cal.get(Calendar.HOUR_OF_DAY) + 9;

                if(hour > 24){
                    hour = hour - 24;
                }else if( i <= hour && hour < i+1){
                    time[i] = time[i] + 1;
                }
            }
        }

        for (int i = 0; i < time.length; i++) {
            System.out.println(time[i]);
        }

        return time;
    }

}
