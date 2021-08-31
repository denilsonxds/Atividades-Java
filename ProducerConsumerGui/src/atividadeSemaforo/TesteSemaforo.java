package atividadeSemaforo;

public class TesteSemaforo{
	public static void main(String[] args) {
		CubbyHoleSemaphore c = new CubbyHoleSemaphore();
		
		Produtor p1 = new Produtor(c, 1);
		Thread threadPro = new Thread(p1);
		threadPro.start();
		
		Consumidor c1 = new Consumidor(c, 1);
		Thread threadCon = new Thread (c1);
		threadCon.start();
	}
}