package modelo;

public class Conta {

    public Conta() {
    }

    public Conta(String numero, Double saldo, Usuario dono) {
        this.numero = numero;
        this.saldo = saldo;
        this.dono = dono;
    }

    private String numero;
    private Double saldo;
    private Usuario dono;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Usuario getDono() {
        return dono;
    }

    public void setDono(Usuario dono) {
        this.dono = dono;
    }

    public void debitar(Double valor) {
        this.saldo -= valor;
    }

    public void creditar(Double valor) {
        this.saldo += valor;
    }

    public void transferir(Double valor, Conta destino) {
        this.saldo -= valor;
        destino.creditar(valor);
    }

}
