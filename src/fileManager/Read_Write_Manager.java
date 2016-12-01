package fileManager;

import java.io.IOException;
//import java.util.concurrent.Semaphore;


/**
 * 
 * @author Dariel
 * Manager System
 * -Ensures mutual exclusion in reading and writing
 * -Asegura la exclusión mutua en lectura y escritura
 * @param name of file to read/write operations
 */
public class Read_Write_Manager {
	String fichero;
	Escritor out;
	Lector in;
	//Semaphore lec_escr;
	
	public Read_Write_Manager(String ioFile) {
		fichero = ioFile;
		//lec_escr = new Semaphore(1);
		try {
			out = new Escritor(ioFile);
			in = new Lector(ioFile);
			
		} catch (IOException e) {
			System.err.println("IO system error.");
			System.err.println("Read_Write_Manager filed.");
		}
		
	}
	public synchronized void write(String message){
		try {
			//lec_escr.acquire();
			System.out.println(message);
			out.write(message);
		} catch (Exception e) {
			System.err.println("IO system error.");
			System.err.println("Read_Write_Manager filed.");
		}
		//lec_escr.release();		
	}
	public synchronized String readNextLine(){
		String message = "";
		try {
			//lec_escr.acquire();
			message = in.readNextLine();
		} catch (Exception e) {
			System.err.println("IO system error.");
			System.err.println("Read_Write_Manager filed.");
		}
		//lec_escr.release();
		return message;
	}
	public synchronized void close(){
		try {
			//lec_escr.acquire();
			out.closeFile();
			in.closeFile();
		} catch (Exception e) {
			System.err.println("IO system error.");
			System.err.println("Read_Write_Manager filed.");
		}
		//lec_escr.release();
	}
}
