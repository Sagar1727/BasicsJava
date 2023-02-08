package com.sagar.homework;

public class CallingDataByCreatingObject {
    public static void main(String[] args) {



        CallingDataByCreatingObject callingDataByCreatingObject= new CallingDataByCreatingObject();
        System.out.println( callingDataByCreatingObject.mahesh(1, 2));


    }



    static int mahesh(int a, int b){

        System.out.println(a);
        System.out.println(b);


        return 0;
    }
}








