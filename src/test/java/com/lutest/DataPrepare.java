package com.lutest;

import org.testng.annotations.DataProvider;

public class DataPrepare {
    @DataProvider(name = "create")
    public static Object[][] createData() {
        return new Object[][] {
                new Object[][]{ { "testuser_1", "Test@123" }, { "testuser_1", "Test@123" }}
        };
    }

}
