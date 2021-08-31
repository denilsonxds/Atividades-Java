
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.rmi.UnknownHostException;
import java.util.Scanner;

 public class Cliente {
   public static void main(String[] args) 
         throws UnknownHostException, IOException {
     // dispara cliente
     new Cliente("127.0.0.1", 12345).executa();
   }
   
   private String host;
   private int porta;
   public String nome = "Usuario";
   
   public Cliente (String host, int porta) {
     this.host = host;
     this.porta = porta;
   }
   
   public void executa() throws UnknownHostException, IOException {
     Socket servidor = new Socket(this.host, this.porta);
     System.out.println("O cliente se conectou ao servidor!");
 
     // thread para receber mensagens do servidor
     Recebedor r = new Recebedor(servidor.getInputStream());
     new Thread(r).start();
     
     // Lembre-se: No contexto de PrintStream: output = escrita / input = leitura
     
     // lê msgs do teclado e manda pro servidor
     Scanner teclado = new Scanner(System.in);
     PrintStream saida = new PrintStream(servidor.getOutputStream());
     while (teclado.hasNextLine()) {
       saida.println(teclado.nextLine());
     }
     
     saida.close();
     teclado.close();
     servidor.close();    
   }
 }