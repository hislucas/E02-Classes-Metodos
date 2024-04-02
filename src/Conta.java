public class Conta {

    Cliente minhaCliente = new Cliente();
    Cliente delaCliente = new Cliente();

    String dono;
    double saldo;
    int numero;
    String agencia;

    boolean depositar(double valor) {
        if (valor >= 0) {
            this.saldo += valor;
            return true;
        } else {
            return false;
        }
    }

    boolean sacar(double valor) {
        if (valor > 0.0 && valor <= this.saldo) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    boolean transferir(Conta contaDestino, double valor) {
        if (valor <= this.saldo ) {
            this.saldo -= valor;
            contaDestino.saldo += valor;
            return true;
        } else {
            return false;
        }
    }

    void imprimir() {
        System.out.print("\n---- INFORMAÇÕES DA CONTA ----\n");
        System.out.printf("Nome do dono da conta: %s\n", this.dono);
        System.out.printf("Número da conta: %s\n", this.numero);
        System.out.printf("Agência: %s\n", this.agencia);
        System.out.printf("Saldo atual: %.2f\n\n", this.saldo);
    }
}
