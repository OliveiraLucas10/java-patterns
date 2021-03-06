package com.oliveiralucas.single.responsibility.principal;

import java.io.PrintStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Journal {

	private final List<String> entries = new ArrayList<String>();

	private static int count = 0;

	public void addEntry(String text) {
		entries.add("" + (++count) + ": " + text);
	}

	public void removeEntry(int index) {
		entries.remove(index);
	}

	@Override
	public String toString() {
		return String.join(System.lineSeparator(), entries);
	}

	// here we break SRP
	public void save(String filename) throws Exception {
		PrintStream out = new PrintStream(filename);
		out.println(toString());

		out.close();
	}

	public void load(String filename) {
	}

	public void load(URL url) {
	}

}
