package com.edu.twond;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TwoMain {

    public static void main(String[] args) throws ParseException{

        String logs = "2019/05/01 00:59:19," +
                "2019/06/01 01:35:20," +
                "2019/08/01 02:01:22," +
                "2019/08/01 02:01:23," +
                "2019/08/02 03:02:35," +
                "2019/10/03 04:05:40," +
                "2019/10/04 06:23:10," +
                "2019/10/10 08:23:20," +
                "2019/10/12 08:42:24," +
                "2019/10/23 08:43:26," +
                "2019/11/14 08:43:29," +
                "2019/11/01 10:19:02," +
                "2019/12/01 11:23:10";

        Two two = new Two();

        two.solution(logs);

    }

}
