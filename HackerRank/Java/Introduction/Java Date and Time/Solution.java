/*
Problem     : Java Date and Time
Difficulty  : Easy
Max Score   : 15
URL         : https://www.hackerrank.com/challenges/java-date-and-time/problem
*/

import java.io.*;
import java.time.LocalDate;

class Result {

    public static String findDay(int month, int day, int year) {
        LocalDate localDate = LocalDate.of(year, month, day);

        java.time.DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        System.out.println(dayOfWeek);

        return dayOfWeek.toString();
    }

}
