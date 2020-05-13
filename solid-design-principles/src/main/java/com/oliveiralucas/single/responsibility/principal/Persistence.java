package com.oliveiralucas.single.responsibility.principal;

import java.io.File;
import java.io.PrintStream;
import java.net.URL;

public class Persistence {

	public void saveToFile(Journal journal, String filename, boolean overwrite) throws Exception {
		if (overwrite || new File(filename).exists()) {
			PrintStream out = new PrintStream(filename);
			out.println(journal.toString());
			out.close();
		}
	}

	public void load(Journal journal, String filename) {
	}

	public void load(Journal journal, URL url) {
	}

}
