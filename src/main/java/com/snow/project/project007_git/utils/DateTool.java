package com.snow.project.project007_git.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTool {
    private static SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static String getLocalTime(){
        return sdf.format(new Date());
    }
}
