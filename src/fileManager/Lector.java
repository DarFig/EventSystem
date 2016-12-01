package fileManager;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


/**
 * 
 * @author Dariel
 *
 */
public class Lector {
	
	private FileReader file;
	private BufferedReader buffer;
	
	Lector(String fileOut) throws IOException{
		file = new FileReader(fileOut);
		buffer = new BufferedReader(file);
	}
	public String readNextLine() throws IOException {
		return buffer.readLine();
	}
	public String readLinesWithDate(String date) {
		
		return "No implementado";
	}
	
	public void closeFile() throws IOException {
		buffer.close();
		file.close();
	}
}
