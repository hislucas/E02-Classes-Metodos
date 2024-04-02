public class Main {

    public static void main(String[] args) {

        Conta minhaConta = new Conta();
        Conta delaConta = new Conta();



        minhaConta.dono = "Lucas Ferreira Simões";
        minhaConta.agencia = "222-2";
        minhaConta.saldo = 2000;
        minhaConta.numero = 1234;

        delaConta.dono = "Perfection Silva Sauro";
        delaConta.agencia = "157-3";
        delaConta.saldo = 7500;
        delaConta.numero = 1929;



        System.out.print("\nEXEMPLO DE DEPÓSITO\n");
        // Método para depositar dinheiro na conta
        boolean depositoRealizado = minhaConta.depositar(1500.0);
        if (depositoRealizado) {
            System.out.println("Depósito feito com sucesso!");
            System.out.printf("Novo saldo: %.2f\n", minhaConta.saldo);
        } else {
            System.out.println("Erro ao realizar o depósito.");
        }


        System.out.print("\nEXEMPLO DE SAQUE\n");
        // Método para sacar dinheiro da conta
        boolean saqueRealizado = minhaConta.sacar(2500);
        if (saqueRealizado) {
            System.out.println("Saque feito om sucesso!");
            System.out.printf("Novo saldo: %.2f\n", minhaConta.saldo);
        } else {
            System.out.println("Erro ao realizar o saque.");
        }


        System.out.print("\nEXEMPLO DE TRANSFERÊNCIA\n");
        // Método para transferir dinheiro da conta
        boolean transferenciaRealizada = minhaConta.transferir(delaConta, 500);
        if (transferenciaRealizada) {
            System.out.println("Transferencia feita com sucesso!");
            System.out.printf("Novo saldo: %.2f\n", minhaConta.saldo);
        } else{
            System.out.println("Erro ao realizar a transferencia.");
        }

        // Método para imprimir os dados da conta
        minhaConta.imprimir();

    }

}
