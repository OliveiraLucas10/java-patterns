package com.oliveiralucas.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.oliveiralucas.java.Dragon;

class Evaluate {

    @Test
    public void test() {
	Dragon dragon = new Dragon();

	assertEquals("flying", dragon.fly());
	assertEquals("too young", dragon.crawl());

	dragon.setAge(20);

	assertEquals("too old", dragon.fly());
	assertEquals("crawling", dragon.crawl());
    }
}
