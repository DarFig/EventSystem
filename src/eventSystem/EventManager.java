package eventSystem;

import fileManager.Read_Write_Manager;

/**
 * 
 * @author Dariel
 * register events.
 * or logger.
 */
public class EventManager {
	Read_Write_Manager manager;
	EventManager(String file){
		manager = new Read_Write_Manager(file);
	}
	
	public void registerEvent(String message){
		manager.write(message);
	}
	
	public String getFirstEvent() {
		return manager.readNextLine();
	}
	
}
