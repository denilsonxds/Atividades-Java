package atividadeSemaforo;

import java.util.concurrent.Semaphore;

public class CubbyHoleSemaphore{
	private int contents;
	private Semaphore semCon = new Semaphore(0);
	private Semaphore semPro = new Semaphore(1);
	
	public int get(int who) {
		try{
			semCon.acquire();
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Consumidor " + who + " consumiu: " + contents);
		semPro.release();
		return contents;
	}
	
	
	public void put(int who, int value) {
		try {
			semPro.acquire();
		} catch(Exception e) {
			e.printStackTrace();
		}
		contents = value;
		System.out.println("Produtor " + who + " produziu: " + contents);
		semCon.release();
	}
}