public class Dono {
    private String nome;
    private String cpf;
    private ContaBancaria conta;

    public Dono(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }


    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public ContaBancaria getConta() {
        return conta;
    }

    public void setConta(ContaBancaria conta) {
        this.conta = conta;
    }

    @Override
    public String toString() {
        return "Nome: " + nome;
    }
}
