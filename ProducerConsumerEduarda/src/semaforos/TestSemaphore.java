package semaforos;


//clase main
public class TestSemaphore{
	public static void main(String[] args) {
		Semap c = new Semap();
		
		Producer p1 = new Producer(c, 1);
		Consumer c1 = new Consumer(c, 1);
		
		p1.start();
		c1.start();
	}
}