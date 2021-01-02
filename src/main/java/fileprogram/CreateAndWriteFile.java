package fileprogram;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class CreateAndWriteFile {

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

}
