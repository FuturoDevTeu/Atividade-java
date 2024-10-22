import java.util.Scanner;

public class Banco {
    Scanner leitor = new Scanner(System.in);
    private Usuario usuario;

    public Banco(Usuario usuario){
        this.usuario = usuario;
       
    }

    public void sacar(){
        System.out.print("Digite o valor que deseja sacar: ");
        float valor = leitor.nextFloat();
        
        if (valor > 0 && valor <= usuario.getSaldo()) {
            usuario.setSaldo(usuario.getSaldo() - valor);
            System.out.println("Saque realizado com sucesso! Saldo atual: "+ usuario.getSaldo());
        }else{
            System.out.print("Saldo insuficiente");
        }
    }

    public void depositar(){
        System.out.print("Digite o valor que deseja depositar: ");
        float valor = leitor.nextFloat();

        if (valor > 0) {
            usuario.setSaldo(usuario.getSaldo() + valor);
            System.out.println("Deposito realizado com sucesso! Saldo atual: "+ usuario.getSaldo());
        }else{
            System.out.println("Valor invalido");
        }

    }



    
}
