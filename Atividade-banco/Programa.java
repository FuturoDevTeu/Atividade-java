import java.util.Scanner;

public class Programa{
    public static void main(String args[]){
        Usuario usuario = new Usuario();
        Banco banco = new Banco(usuario);
        Scanner leitor = new Scanner(System.in);
        int opcao;


        do { 
            System.out.println("Usuario: "+ usuario.getNome());
            System.out.println("Saldo: "+ usuario.getSaldo());
            System.out.println("MENU");
            System.out.println("1  SACAR");
            System.out.println("2  Depositar");
            System.out.println("0  Sair");
            System.out.print(">");
            opcao = leitor.nextInt();

            switch (opcao){
                case 1:
                    banco.sacar();
                    break;
                case 2:
                    banco.depositar();
                    break;
                case 0:
                    System.out.println("Saindo...");
                default:
                    System.out.println("Opcao invalida!");
            }
        } while (opcao != 0);
        leitor.close();

    }
}