package fileprogram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {

	public static void main(String[] args) throws IOException {

		CreateAndWriteFile newFile = new CreateAndWriteFile();
		ReadFile createdFile = new ReadFile();

		newFile.createFile();

		newFile.writeAndAppendFile();
		
		System.out.println("Below are the contents of the file!");
		
		createdFile.readFile();


	}

}
