package com.lambton;

import java.time.LocalDate;
import java.util.Date;

public class studentMain {
    public static void main(String[] args) {
        student[] listofStudents= new student[2];

        student  s1= new student(1,"roop","virk", LocalDate.now(), Gender.Female);

        s1.printData();

       LocalDate s1birthdate= LocalDate.of(2020,12,23);


    }
}
