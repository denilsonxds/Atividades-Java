
import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

 public class Servidor {
 
   public static void main(String[] args) throws IOException {
     // inicia o servidor
     new Servidor(12345).executa();
   }
   
   private int porta;
   private List<PrintStream> clientes;
   
   public Servidor (int porta) {
     this.porta = porta;
     this.clientes = new ArrayList<PrintStream>();
   }
   
   public void executa () throws IOException {
     ServerSocket servidor = new ServerSocket(this.porta);
     System.out.println("Porta 12345 aberta!");
     
     while (true) {
       // aceita um cliente
       Socket cliente = servidor.accept();
       System.out.println("Nova conexão com o cliente " + cliente.getInetAddress().getHostAddress());
       
       // adiciona saida do cliente à lista
       PrintStream ps = new PrintStream(cliente.getOutputStream());
       this.clientes.add(ps);
       
       // Lembre-se: No contexto de PrintStream: output = escrita / input = leitura
       
       // cria tratador de cliente numa nova thread e escuta suas msgs
       TrataCliente tc = new TrataCliente(cliente.getInputStream(), this);
       new Thread(tc).start();
     }
 
   }
 
   public void distribuiMensagem(String msg) {
     // envia msg para todo mundo
     for (PrintStream cliente : this.clientes) {
       cliente.println("Mensagem: " + msg);
     }
   }
 }