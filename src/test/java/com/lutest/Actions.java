package com.lutest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Actions {
    @BeforeClass
    public void before(){
        System.out.println("This is before class action!");
    }

    @Test(dataProvider = "create")
    public void test(String sUsername, String sPassword) {
        System.out.println(sUsername);
        System.out.println(sPassword);
    }

    @AfterClass
    public void after(){
        System.out.println("This is after class action!");
    }

}
