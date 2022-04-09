import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in); 
    String nome = "";
    String endereco = "" ;
    String telefone = "" ;
   //Entrada de Dados
    System.out.println("Qual seu nome :");
    nome = leitor.nextLine();
    System.out.println("\nQual seu Endereço :");
    endereco = leitor.nextLine();
    System.out.println("\nQual seu Telefone");
    telefone = leitor.nextLine();
    //Saida
    System.out.println("\nNome :" + nome);
    System.out.println("Endereço :" + endereco);
    System.out.println("Telefone :" + telefone);



  }
}