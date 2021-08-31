package semaforo;

import java.util.concurrent.Semaphore;

public class ExecutaSemaforo{
	public static void main(String[] args) {
		int numeroDePermissoes = 2;
		int numeroDeThreads = 6;
		Semaphore semaphore = new Semaphore(numeroDePermissoes);
		
		ProcessadorThread[] processos = new ProcessadorThread[numeroDeThreads];
		for(int i = 0; i < numeroDeThreads; i++) {
			processos[i] = new ProcessadorThread(i, semaphore);
			processos[i].start();
		}
		
	}
}