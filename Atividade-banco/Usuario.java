public class Usuario {
    private String nome, numeroConta, senha;
    private float saldo;

    public Usuario(){
        this.nome = "Mateus";
        this.numeroConta = "2006";
        this.senha = "1234";
        this.saldo = 2000.0f;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
}
