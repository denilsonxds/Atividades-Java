package semaforos;



//classe do consumidor
public class Consumer extends Thread{
	private Semap cubbyhole;
	private int number;
	
	public Consumer(Semap c, int number){
		cubbyhole = c;
		this.number = number;
	}
	
	public void run() {
		int value = 0;
		for(int i = 0; i < 10; i++) {
			value = cubbyhole.get(number);
			try {
				sleep((int) (Math.random() * 100));
			} catch (InterruptedException e){}
		}
	}
}