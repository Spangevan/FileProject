package fileprogram;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadFile {

	public void readFile() throws IOException {

		String potatoLog = "/Users/evanspangenberg/FileProject/potatolog.txt";
		FileInputStream stream = new FileInputStream(potatoLog);

		int r = 0;
		while ((r = stream.read()) != -1) {
			System.out.print((char) r);

		}

	}

}
