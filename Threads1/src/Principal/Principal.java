package Principal;

public class Principal{
	public static void main (String[] args) {
		
		ThreadMain thread1 = new ThreadMain();
		Thread threadAux1 = new Thread(thread1);
		threadAux1.start();
		
		ThreadMain thread2 = new ThreadMain();
		Thread threadAux2 = new Thread(thread2);
		threadAux2.start();
		
		ThreadMain thread3 = new ThreadMain();
		Thread threadAux3 = new Thread(thread3);
		threadAux3.start();
		
		ThreadMain thread4 = new ThreadMain();
		Thread threadAux4 = new Thread(thread4);
		threadAux4.start();
		
		ThreadMain thread5 = new ThreadMain();
		Thread threadAux5 = new Thread(thread5);
		threadAux5.start();
	}
}