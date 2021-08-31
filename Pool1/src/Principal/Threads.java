package Principal;

import java.util.Random;

public class Threads implements Runnable{
	private String nomeThread;
	private int tempo;
	private static Random r = new Random();
	
	public Threads(String nome) {
		nomeThread = nome; //nome que a thread recebe
		tempo = r.nextInt(1000); //tempo q ela dorme em milissegundos
	}
	
	public void run() {
		
		for(int i = 0; i < 10; i++) {
			try {
				System.out.println("A thread " + nomeThread + " está na volta " + i + " e está Dormindo");
				Thread.sleep(tempo);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("------ A thread " + nomeThread + " acordou da repetição " + i + "-------");
		}
	}
}