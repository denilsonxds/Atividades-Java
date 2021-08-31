package atividadeSemaforo;


public class Consumidor implements Runnable{
	private CubbyHoleSemaphore cubbyhole;
	private int number;
	
	public Consumidor(CubbyHoleSemaphore c, int number){
		cubbyhole = c;
		this.number = number;
	}
	
	public void run() {
		int value = 0;
		for(int i = 0; i < 10; i++) {
			value = cubbyhole.get(number);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e){}
		}
	}
}