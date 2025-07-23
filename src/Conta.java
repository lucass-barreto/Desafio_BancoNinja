public interface Conta {
    void depositar(double deposito);
    void sacar(double saque);
    void transferir(double transferencia, ContaBancaria contaBancaria);
}
