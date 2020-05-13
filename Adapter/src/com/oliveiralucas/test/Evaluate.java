package com.oliveiralucas.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.oliveiralucas.java.Square;
import com.oliveiralucas.java.SquareToRectangleAdapter;

class Evaluate {

    @Test
    public void test() {
	Square sq = new Square(11);
	SquareToRectangleAdapter adapter = new SquareToRectangleAdapter(sq);
	assertEquals(121, adapter.getArea());
    }
}
