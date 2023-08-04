import java.util.Random;
import javax.swing.JOptionPane;

public class jsdhvf {

    public static void main(String[] args) {
        Random aleatorio = new Random();
        int saldo = aleatorio.nextInt(10000) + 1;
        entrada(saldo);

    }

    static void entrada(int saldo) {

        int controle = Integer.parseInt(JOptionPane.showInputDialog(" olá!\n para sacar digite: 0 \n para depositar digite: 1 \n para conferir o saldo digite: 2 \n para sair digite: 3"));

        switch (controle) {

            case 0:

                saque(saldo);

                break;
            case 1:

                deposito(saldo);

                break;
            case 2:

                saldo(saldo);

            case 3:

                sair();
                break;

            default:
                sair();
        }

    }

    static void sair() {
        JOptionPane.showMessageDialog(null, "obrigado pela preferencia, volte sempre!");
    }

    static void saque(int saldo) {

        int valorDesejadoDoSaque = Integer.parseInt(JOptionPane.showInputDialog("quanto voce deseja sacar? \n saldo atual: R$" + saldo));

        if (valorDesejadoDoSaque >= saldo) {
            JOptionPane.showMessageDialog(null, "você não tem dinheiro suficiente!");
        } else {
            JOptionPane.showMessageDialog(null, "valor sacado com sucesso!");
            saldo = saldo - valorDesejadoDoSaque;
        }


        saldo(saldo);

        entrada(saldo);
    }

    static void deposito(int saldo) {

        int valorDeposito = Integer.parseInt(JOptionPane.showInputDialog("seu saldo atual é de: R$" + saldo + " \n quanto você deseja depositar?"));

        saldo = saldo + valorDeposito;
        saldo(saldo);

        entrada(saldo);
    }

    static void saldo(int saldo) {
        JOptionPane.showMessageDialog(null, "seu saldo atual é de: R$" + saldo);

        entrada(saldo);
    }


}

