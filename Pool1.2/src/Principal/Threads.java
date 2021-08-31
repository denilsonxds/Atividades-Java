package Principal;

import java.util.Random;

public class Threads implements Runnable{
	String nomeThread;
	
 	public Threads(String nome) {
		nomeThread = nome;
	}
	
	public void run(){
		try {
			System.out.println("A thread " + nomeThread + " Está executando");
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}