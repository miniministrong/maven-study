package com.example;

import org.junit.Assert;
import org.junit.Test;

public class TestHelloMaven {
    @Test
    public void testAdd(){
        System.out.println("-------------maven testAdd execute---------------");
        HelloMaven helloMaven = new HelloMaven();
        int retValue = helloMaven.add(10, 20);
        // 判断结果是否正确
        Assert.assertEquals(30, retValue);
    }
}
