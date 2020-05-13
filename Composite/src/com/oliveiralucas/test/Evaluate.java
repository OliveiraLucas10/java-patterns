package com.oliveiralucas.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.oliveiralucas.java.ManyValues;
import com.oliveiralucas.java.MyList;
import com.oliveiralucas.java.SingleValue;

class Evaluate {

    @Test
    public void test() {
	SingleValue singleValue = new SingleValue(11);
	ManyValues otherValues = new ManyValues();
	otherValues.add(22);
	otherValues.add(33);
	assertEquals(66, new MyList(List.of(singleValue, otherValues)).sum());
    }

}
