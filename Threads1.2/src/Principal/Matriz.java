package Principal;
import java.util.Random;


public class Matriz{
	Random r = new Random();
	int [][] matriz = new int[3] [5];
	int linha = 0;
	
	//Criando a Matriz
	public void criaMatriz() {
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 5; j++){
				matriz[i][j] = r.nextInt(100); //adiciona valores aleatorios de 0 a 99 na matriz
			}
		}
	}
	
	
	public void exibeMatriz() {
		//Exibindo a Matriz
		System.out.println("------Matriz--------");
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print("|" + matriz[i][j] + "|");
			}
			System.out.println("");
		}
	}
	

}


