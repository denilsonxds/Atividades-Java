package Principal;

public class Principal{
	public static void main (String[] args){
		

		ThreadMain thread1 = new ThreadMain();
		Thread threadAux1 = new Thread(thread1);
		threadAux1.start();

		ThreadMain thread2 = new ThreadMain();
		Thread threadAux2 = new Thread(thread2);
		threadAux2.start();
		
		ThreadMain thread3 = new ThreadMain();
		Thread threadAux3 = new Thread(thread3);
		threadAux3.start();
		
	}
}