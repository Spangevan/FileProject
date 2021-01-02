package fileprogram;

import java.io.IOException;

public class App {
	
	public static void main (String [] args) throws IOException {
		
		CreateAndWriteFile program = new CreateAndWriteFile();
		
		program.createFile();
		
		program.writeToFile();
		
		
		
	}

}
