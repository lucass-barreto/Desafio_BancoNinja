public class ContaPoupanca extends ContaBancaria{

    private TipoConta tipoConta = TipoConta.POUPANCA;
    private double taxaTransferencia = 0.05;
    private double taxaDeposito = 0.01;

    public ContaPoupanca(Dono dono, TipoConta tipo) {
        super(dono, tipo);
    }

    @Override
    public void depositar (double deposito){
        if (deposito > 0) {
            double saldoAtualizado = super.getSaldo() + deposito - (deposito * taxaDeposito);
            super.setSaldo(saldoAtualizado);
            System.out.println("Depósito realizado com sucesso." +
                    "\n Foi aplicada um taxa de 1% sobre o seu depósito (R$" + (deposito * taxaDeposito) + ").");
        } else {
            System.out.println("O valor de depósito deve ser maior que 0.");
        }

    }

    @Override
    public void sacar(double saque) {
        if (saque > 0){
            if (saque <= super.getSaldo()){
                double novoSaldo = super.getSaldo() - saque;
                super.setSaldo(novoSaldo);
                System.out.println("Saque realizado com sucesso.");
            } else {
                System.out.println("Não há saldo suficiente para realizar o saque no valor desejado.");
            }
        } else {
            System.out.println("O valor do saque deve ser maior que 0.");
        }

    }

    @Override
    public void transferir (double transferencia, ContaBancaria contaBancaria){
        if (transferencia <= super.getSaldo()){
            double novoSaldo = (super.getSaldo() - transferencia - (transferencia * taxaTransferencia));
            super.setSaldo(novoSaldo);
            contaBancaria.setSaldo((contaBancaria.getSaldo()) + transferencia);
            System.out.println("Transferência realizada com sucesso. " +
                    "\n Foi retido uma taxa de transferência a mais de 1% do valor da transação da sua conta (R$ " + (transferencia * taxaTransferencia) + ").");
        } else {
            System.out.println("O saldo atual é insuficiente para realizar a transferência no valor desejado.");
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
