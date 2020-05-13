package com.oliveiralucas.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.oliveiralucas.java.Person;
import com.oliveiralucas.java.PersonFactory;

public class Evaluate {
	
	@Test
	public void test() {
		PersonFactory pf = new PersonFactory();

		Person p1 = pf.createPerson("Chris");
		assertEquals("Chris", p1.name);
		assertEquals(0, p1.id);

		Person p2 = pf.createPerson("Sarah");
		assertEquals(1, p2.id);
	}
}
