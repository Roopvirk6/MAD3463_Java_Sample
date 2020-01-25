package com.lambton;

import java.time.LocalDate;
import java.util.Date;

public class studentMain {
    public static void main(String[] args) {
        Student s1= new Student();
        s1.setdata(1,"roop","virk",new Date(), gender.Female,60.8F);
        s1.printdata();
       // LocalDate s1birthdate= LocalDate.of(2020,12,23);


    }
}
