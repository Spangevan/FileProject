package fileprogram;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileReader {
	
	public static void readFile() throws IOException {
		File potatoLog = new File("/Users/evanspangenberg/FileProject/potatolog.txt");
		FileInputStream stream = new FileInputStream(potatoLog);
		int r = 0;
		while((r = stream.read()) != -1) {
			System.out.print((char)r);
		}
		
	}

}
