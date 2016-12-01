package pruebas;

import eventSystem.EventManager;

public class Pruebas {

	public void escritura() {
		EventManager manager = new EventManager("logs.txt");
		manager.registerEvent("Hola");
		for(int i = 0; i<10;i++){
			manager.registerEvent("Evento: " + i);
			
		}
		manager.close();
	}
}
