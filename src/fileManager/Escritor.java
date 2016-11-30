package fileManager;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
/**
 * 
 * @author Dariel
 *
 */
public class Escritor {
	private FileWriter file;
	
	Escritor(String fileOut) throws IOException{
		file = new FileWriter(fileOut);
	}
	
	public void write(String message) throws IOException {
		LocalDate time = LocalDate.now();
		file.write(time + " " + message + "\n");
	}
	public void write(String message, String info) throws IOException {
		LocalDate time = LocalDate.now();
		file.write(time + " " + message + ":" + info + "\n");
	}
	public void closeFile() throws IOException {
		file.close();
	}
	
}
