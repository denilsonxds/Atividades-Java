package producerconsumersemaphore;

import java.util.concurrent.*;

public class CubbyHole{
	private int contents;
	private Semaphore semaforoCon = new Semaphore(0);
	private Semaphore semaforoPro = new Semaphore(1);
	
	public int get(int who) {
		try{
			semaforoCon.acquire();
			System.out.println("Consumer " + who + " obteve: " + contents);
				
		} catch(Exception e) {
			e.printStackTrace();
		}
		semaforoPro.release();
		return contents;
	}
	
	
	public void put(int who, int value) {
		try {
			semaforoPro.acquire();
			contents = value;
			System.out.println("Producer " + who + " lançou: " + contents);
		} catch(Exception e) {
			e.printStackTrace();
		}
		semaforoCon.release();
	}
}