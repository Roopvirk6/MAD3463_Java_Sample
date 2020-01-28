package com.lambton;

public class arithematic {
    private int a,b;
    private String s1="world";
    private String s2;

    int add(int a, int b)
    {

        return a+b;
    }
    float add(float a,float b)
    {
        return a+b;
    }
     String add(String a, String b)
    {

        return a+b;
    }
    String add(int a, String b)
    {
        return a+b;
    }
    int add( int a, int b, int c)
    {
        return a+ add(b,c);
    }
    float add(int a,int b,float c)
    {
        return(float)add(a,b)+c;
    }
    float add(float a, int b)
    {
        return a+b;
    }
    float add(float a, int b, int c)
    {
        return (float)add(a,b)+c;
    }



}
