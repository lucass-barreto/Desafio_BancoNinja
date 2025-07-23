import java.util.concurrent.ThreadLocalRandom;

public abstract class ContaBancaria implements Conta{
    private long numeroConta;
    private double saldo;
    private Dono dono;
    private TipoConta tipo;

    public ContaBancaria(Dono dono, TipoConta tipo) {
        this.dono = dono;
        this.tipo = tipo;
        this.saldo = 0;
        this.numeroConta = gerarNumeroDeConta();
    }

    public long getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public Dono getDono() {
        return dono;
    }

    public TipoConta getTipo() {
        return tipo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    private long gerarNumeroDeConta(){
        long minimo = 10_000_000L;
        long maximo = 100_000_000L;
        return ThreadLocalRandom.current().nextLong(minimo, maximo);
    }

    @Override
    public String toString() {
        return "Conta " + getTipo() + " do(a) " + dono.getNome() + ":" +
                "\n Número: " + getNumeroConta() +
                "\n Saldo atual:" + getSaldo();
    }
}
