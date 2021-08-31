package Principal;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Principal{
	public static void main(String[] args) {
		
		ExecutorService pool = Executors.newFixedThreadPool(2); //executar as duas threads juntas
		
		Threads thread1 = new Threads("Thread 1"); //criando as threads 
		Threads thread2 = new Threads("Thread 2");
		
		pool.execute(thread1); //executando as treads pelo pool
		pool.execute(thread2);
		
	}
}
