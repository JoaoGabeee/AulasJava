import javax.swing.*;
import java.util.Random;
public class Main {

    static int resposta;
    static int saldo;

    static Random aleatorio = new Random();
    public static void main(String[] args) {
        saldo = aleatorio.nextInt(10000)+1;
        inicio();

    }

    static void inicio() {
        String[] array = {"Saldo", "Sacar", "Deposito", "Sair"};

        resposta = JOptionPane.showOptionDialog(null,
                "Escolha a operação que deseja realizar",
                "Banco",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                null, array, array[0]);

        switch (resposta) {

            case 0:
                saldoBanco();
                break;

            case 1:
                saqueBanco();
                break;

            case 2:
                depositoBanco();
                break;

            default:
                sairPrograma();
        }
    }

    static void saldoBanco() {

        JOptionPane.showMessageDialog(null, "Olá, seu saldo é de R$:" + saldo);
        inicio();
    }

    static void saqueBanco() {

        int valorSaque = Integer.parseInt(JOptionPane.showInputDialog("Quanto deseja sacar? saldo R$:" + saldo));
        if (saldo >= valorSaque){
            saldo -= valorSaque;
            JOptionPane.showMessageDialog(null, "Saque efetuado com sucesso.\nSaldo atual R$:" + saldo);
        }else {
            JOptionPane.showMessageDialog(null, "Você não tem saldo suficiente!");
        }
        inicio();
    }

    static void depositoBanco() {
      int deposito = Integer.parseInt(JOptionPane.showInputDialog("Quanto deseja depositar?"));
      saldo += deposito;
      JOptionPane.showMessageDialog(null,"DEposito efetuado com sucesso.\n saldo atual R$:" + saldo);
        inicio();
    }

    static void sairPrograma() {
        JOptionPane.showMessageDialog(null, "obrigado pela preferencia");
    }
}
