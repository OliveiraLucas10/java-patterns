package com.oliveiralucas.test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.oliveiralucas.java.Square;
import com.oliveiralucas.java.VectorRenderer;

public class Evaluate {
    @Test
    public void test() {
	assertEquals("Drawing Square as lines", new Square(new VectorRenderer()).toString());
    }
}
