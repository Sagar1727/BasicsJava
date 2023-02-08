package com.batch2.learning.samples;

public class CommandLineArgumentsDemo {
    public static void main(String[] args) {
        for (String arg : args){
            System.out.println(arg);
        }
    }
}

//The arguments we send to the program at runtime is called command line arguments
