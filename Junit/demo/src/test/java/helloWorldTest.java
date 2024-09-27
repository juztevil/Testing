// package com.helloworld;

import static org.junit.Assert.assertEquals;
// import static org.junit.Assert.assetEquals;
import org.junit.Test;

import com.helloworld.Main;

public class helloWorldTest {
    @Test
    public void test1() {
        Main obj = new Main();
        assertEquals("HelloWorld!", obj.sayHello());
    }
}
