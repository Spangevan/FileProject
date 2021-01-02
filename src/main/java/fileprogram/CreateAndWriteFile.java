package fileprogram;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class CreateAndWriteFile {

	BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

	public void createFile() {

		File textFile = new File("/Users/evanspangenberg/FileProject/potatolog.txt");
		{
			try {
				if (textFile.createNewFile()) {
					System.out.println("File Created: " + textFile.getName());
				} else {
					System.out.println("File Already Exists");

				}
			} catch (IOException e) {

				System.out.println("An error has occured");

				e.printStackTrace();
			}

		}

	}

	public void writeToFile() throws IOException {

		FileWriter fileWriter = new FileWriter("/Users/evanspangenberg/FileProject/potatolog.txt");

		System.out.println("please input text you would like to add to the file");

		fileWriter.write(bufferedReader.readLine());
		fileWriter.close();

		System.out.println("Successfully wrote to the file!");

	}

}
