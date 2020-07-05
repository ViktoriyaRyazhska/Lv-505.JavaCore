package Lesson11HomeWork;

import java.time.DayOfWeek;
import java.time.LocalDate;

import static java.time.temporal.TemporalAdjusters.firstInMonth;

public class DateApi {

    public static void main(String[] args) {

//Show which today is a day of a week



        LocalDate now  = LocalDate.now();
        DayOfWeek dayweek = now.getDayOfWeek();
        System.out.println("Today is " + dayweek);



        //Show a date of first Monday for current month

        LocalDate now1 = LocalDate.now();
        LocalDate firstMonday = now.with(firstInMonth(DayOfWeek.MONDAY));
        System.out.println("First Monday of the month is " + firstMonday);


    }

}
