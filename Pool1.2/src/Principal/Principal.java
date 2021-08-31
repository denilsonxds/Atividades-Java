package Principal;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import static java.lang.Thread.MAX_PRIORITY;
import static java.lang.Thread.MIN_PRIORITY;

public class Principal{
	public static void main(String[] args) {
		int numero = 8;
		
		ExecutorService pool = Executors.newFixedThreadPool(1);
		
		Threads[] thread = new Threads[numero];
		for(int i = 0; i < numero; i++) {
			thread[i] = new Threads("Thread " + i);
			if(i == 0) { //da prioridade maxima pra primeira thread
				Thread.currentThread().setPriority(MAX_PRIORITY);
			}else {//da prioridade minima pro restante
				Thread.currentThread().setPriority(MIN_PRIORITY);
			}
			System.out.println("A prioridade da Thread " + thread[i].nomeThread + " é: " + Thread.currentThread().getPriority());
			
			pool.execute(thread[i]);
			
		}
		pool.shutdown();
	}
}