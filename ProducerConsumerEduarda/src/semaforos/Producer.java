package semaforos;


//classe do produtor
public class Producer extends Thread{
	
	private Semap cubbyhole;
	private int number;
	
	public Producer(Semap c, int number) {
		cubbyhole = c;
		this.number = number;
	}
	
	public void run() {
		for(int i = 0; i < 10; i++) {
			cubbyhole.put(number, i);
			try {
				sleep((int) (Math.random() * 100));
			} catch (InterruptedException e) {}
		}
	}
}