package Principal;

public class ThreadMain implements Runnable{
	
	Matriz matriz = new Matriz();
	
	public void run(){
		matriz.criaMatriz(); //inicia a matriz aleatoria
		for(int linha = 0; linha < 3; linha++) { //percorre a variavel linha afim de achar a thread dela
			if ((Thread.currentThread().getId() - 10) == linha) { //verifica se o id da thread bate com a linha, para q seja uma thread para cada linha
				int soma = 0; //variavel q armazena a soma da linha em questao
				System.out.println("Linha: " + linha);
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				for(int i = 0; i < 3; i++) {
					for(int j = 0; j <5; j++) {
						if(i == linha) { //se certifica q esta pegando a linha da matriz igual a linha
							soma += matriz.matriz[i][j]; //soma os valores de i para soma
							System.out.print("|" + matriz.matriz[i][j] + "|"); //exibe a linha que esta sendo somada
						}
					}
					try {
						Thread.sleep(3000); //da uma pausa de 3s para que n se misture as linhas printadas
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("");
				}
				//exibe o valor encontrada pela thread em questão
				System.out.println("A Thread: " + (Thread.currentThread().getId()-10) + " somou a linha: " + linha + " e obteve: " + soma + " como resultado.");
			}		
		}	
	}
}