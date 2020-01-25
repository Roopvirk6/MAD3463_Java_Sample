package com.lambton;
import java.time.LocalDate;
import java.util.Date;
enum gender
{
    Male,
    Female,
    other
}


public class Student {
    int studentid;
    String Firstname;
    String Lastname;
    Date birthdate;
    gender gender;
    float totalmarks;

    public void setdata(int studentid, String Firstname, String Lastname,Date birthdate, gender gender,
        float totalmarks){
        this.studentid=studentid;
        this.Firstname=Firstname;
        this.Lastname=Lastname;
        this.birthdate=birthdate;
        this.gender=gender;
        this.totalmarks=totalmarks;
        //LocalDate localDate;
        //localDate = LocalDate.of(2020,12,23);

    }
    public void printdata()
    {
        System.out.println("studentid " + studentid);
        System.out.println("Firstname " + Firstname);
        System.out.println("Lastname " + Lastname);
        System.out.println("gender " + gender);
        System.out.println("birthdate" + birthdate);
        //System.out.println("getlocaldate " + LocalDate);
        System.out.println("totalmarks " + totalmarks);



    }

}