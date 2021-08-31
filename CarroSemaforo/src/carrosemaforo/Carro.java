package carrosemaforo;

import java.util.concurrent.*;
import java.util.Scanner;

public class Carro extends Thread{
	private static Semaphore estacionamento = new Semaphore(10, true);
	
	public Carro(String nome) {
		super(nome);
	}
	
	public void run() {
		try {
			estacionamento.acquire();
			System.out.println(getName() + " ocupou vaga");
			sleep((long)(Math.random() * 10000));
			System.out.println(getName() + " liberou vaga");
			estacionamento.release();
		} catch(InterruptedException ie) {
			ie.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double salario, descontoinss, descontoir, salariofim = 0;
		
		System.out.println("informa salario");
		salario = scan.nextDouble();
		descontoinss = (salario * 0.085);
		descontoir = (salario * 0.05);
		salariofim = (salario - descontoinss - descontoir);
		System.out.println("o valor final sera");
		System.out.println(salariofim);

		
		
		/*for(int i = 0; i < 20; i++) {
			new Carro("Carro #" + i).start();
		}*/
	}
}