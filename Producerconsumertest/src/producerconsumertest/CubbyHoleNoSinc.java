package producerconsumertest;

public class CubbyHoleNoSinc{
	private int contents;
	
	public int get(int who) {
		System.out.println("Consumer " + who + " obteve: " + contents);
		return contents;
	}
	
	public void put(int who, int value) {
		contents = value;
		System.out.println("Producer " + who + " lançou: " + contents);
	}
}