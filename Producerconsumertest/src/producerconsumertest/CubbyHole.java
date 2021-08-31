package producerconsumertest;

public class CubbyHole{
	private int contents;
	private boolean available = false;
	
	public synchronized int get(int who) { //metodo para o consumidor
		while(available == false) {
			try {
				wait();
			}catch(InterruptedException e) {}
		}
		
		available = false;
		System.out.println("Consumer " + who + " obteve: " + contents);
		notifyAll();
		return contents;
	}
	
	public synchronized void put(int who, int value) { //metodo para o produtor
		while(available == true) {
			try {
				wait();
			} catch (InterruptedException e) {}
		}
		contents = value;
		available = true;
		System.out.println("Producer " + who + " lançou: " + contents);
		notifyAll();
	}
	
	
}