package Principal;

import javax.swing.JOptionPane;

public class ThreadMain implements Runnable{
	public void run() {
		JOptionPane.showMessageDialog(null, "O id da thread " + ((Thread.currentThread().getId() - 10) + 1) + " é " + ((Thread.currentThread().getId() - 10) + 1));
	}
}