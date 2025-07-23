public class ContaCorrente extends ContaBancaria{

    private TipoConta tipoConta = TipoConta.CORRENTE;
    private double taxaTransferencia = 0.01;

    public ContaCorrente(Dono dono, TipoConta tipo) {
        super(dono, tipo);
    }

    @Override
    public void depositar (double deposito){
        System.out.println("Não é possível realizar depósito em conta corrente.");
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
    public void sacar (double saque){
        System.out.println("O saque não está disponível em contas do tipo corrente.");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
