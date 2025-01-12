package org.example;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Day1 {
    @AfterTest
    public void lastexecution(){
        System.out.println("I will execute at last");
    }
    @Test
    public void demo(){
        System.out.println("Hello");
        System.out.println("Sahil");
    }
    @Test
    public void secondTest(){
        System.out.println("Bye");
    }
}

