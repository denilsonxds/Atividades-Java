package semaforos;

import java.util.concurrent.Semaphore;


//classe que controla os semaforos do consumidor e produtor
public class Semap{
	private int item;
	private Semaphore semaphoreConsumer = new Semaphore(0);
	private Semaphore semaphoreProducer = new Semaphore(1);
	
	public int get(int who) {
		try{
			semaphoreConsumer.acquire();
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Consumidor " + who + " obteve: " + item);
		semaphoreProducer.release();
		return item;
	}
	
	
	public void put(int who, int value) {
		try {
			semaphoreProducer.acquire();
		} catch(Exception e) {
			e.printStackTrace();
		}
		item = value;
		System.out.println("Produtor " + who + " lançou: " + item);
		semaphoreConsumer.release();
	}
}