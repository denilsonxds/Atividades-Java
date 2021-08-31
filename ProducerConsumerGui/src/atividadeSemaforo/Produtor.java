package atividadeSemaforo;

public class Produtor implements Runnable{
	
	private CubbyHoleSemaphore cubbyhole;
	private int number;
	
	public Produtor(CubbyHoleSemaphore c, int number) {
		cubbyhole = c;
		this.number = number;
	}
	
	public void run() {
		for(int i = 0; i < 10; i++) {
			cubbyhole.put(number, i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {}
		}
	}
}