package com.oliveiralucas.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.oliveiralucas.java.SingletonTester;

public class Evaluate {
    @Test
    public void test() {
	Object obj = new Object();
	assertTrue(SingletonTester.isSingleton(() -> obj));
	assertFalse(SingletonTester.isSingleton(Object::new));
    }
}