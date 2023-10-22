package com.tx.maven;

import org.junit.Test;

public class HelloMavenTest {

    @Test
    public void testHelloMaven() {
        String var = new HelloMaven().hello();
        System.out.println(var);
    }
}
